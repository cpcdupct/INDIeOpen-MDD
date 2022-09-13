package org.xtext.generator.helpers

import com.google.gson.Gson
import java.util.regex.Pattern
import java.util.stream.Collectors
import org.xtext.generator.i18n
import upctforma.ContentElement
import upctforma.SimpleElement

import static extension org.xtext.generator.helpers.RegexReplaceWithFunc.*

class StringHelper {
    
    static val latexPattern = Pattern.compile("\\\\begin\\s*\\[([^]]*)\\]\\s*\\{([^}]*)\\}\\s*(.*?)\\s*\\\\end",
        Pattern.DOTALL.bitwiseOr(Pattern.CASE_INSENSITIVE)
    );

    def static json(String text) {
        return new Gson().toJson(text);
    }

    def static replaceHeadings(String text, int currentHeadingLevel) {
        val (String[]) => String replaceFunc = [groups |
            val hLevel = Integer.parseInt(groups.get(1));
            val newHLevel =  hLevel + currentHeadingLevel - 1;
            var res = groups.get(0).replace('''<h«hLevel.toString»''', '''<h«newHLevel.toString»''' +
                if(newHLevel > 6) ''' role="heading" aria-level="«newHLevel.toString»" ''' else "");
            res.replace('''</h«hLevel.toString»''', '''</h«newHLevel.toString»''')
        ];
        text.replaceAll("<h(\\d)[^>]*>.*<\\/h\\1[^>]*>", replaceFunc);
    }

    private static def replaceParagraphsWithText(String text, String replacement) {
        return text
            .replaceAll("(?s)<\\/?p[^>]*>(.*?)<\\/?p[^>]*>", "$1" + replacement)
            .replaceFirst("^\\s+", "") // Remove leading spaces
            .replaceFirst("\\s+$", "") // Remove ending spaces
    }

    private static def replaceParagraphsWithNewlines(String text) {
        text.replaceParagraphsWithText("\n");
    }

    private static def handleMatch(String[] groups, ContentElement container) {
        val command = groups.get(1).toLowerCase;
        val arguments = groups.get(2).trim().split(",").stream.collect(Collectors.toSet());
        val content = groups.get(3);
        switch (command) {
            case "hidden":
                return '''<span class="sr-only">«content.replaceParagraphsWithNewlines»</span>'''
            case "spell":
                return '''«content» <span class="sr-only">(«i18n.getMessage("spelt-content") + content.replaceParagraphsWithNewlines.trim().split("").stream.collect(Collectors.joining(' '))»)</span>
                '''
            default: // Programming language
                return
                '''
                «IF container instanceof SimpleElement && !arguments.contains("inline")»<pre «IF arguments.contains("line-numbers")»class="line-numbers"«ENDIF»>«ENDIF»
                <code class="language-«command»">«content.replaceParagraphsWithNewlines»</code>
                «IF container instanceof SimpleElement && !arguments.contains("inline")» </pre>«ENDIF»'''
        }
    }

    def static parse(String text, ContentElement container) {
        text.replaceAll(latexPattern, [groups | handleMatch(groups, container)])
    }
}