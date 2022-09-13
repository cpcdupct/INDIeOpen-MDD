package org.xtext.generator.helpers

import java.util.regex.Pattern
import java.util.stream.IntStream
import java.util.regex.Matcher

class RegexReplaceWithFunc {
    
    private static def replaceTimes(String text, Pattern pattern, (String[]) => String replacement, int times) {
        var output = new StringBuffer();
        val matcher = pattern.matcher(text);
        var current = 0; 
        while (current < times && matcher.find()) {
            current += 1;
            val String[] groups = IntStream.range(0, matcher.groupCount() + 1).boxed().map[num | matcher.group(num)].toArray[size | newArrayOfSize(size)]
            matcher.appendReplacement(output, Matcher.quoteReplacement(replacement.apply(groups)));
        }
        matcher.appendTail(output);
        output.toString();    
    }
    
    static def replace(String text, Pattern pattern, (String[]) => String replacement) {
        replaceTimes(text, pattern, replacement, 1);    
    }
    
    static def replace(String text, String patternStr, (String[]) => String replacement) {
        replace(text, Pattern.compile(patternStr), replacement);    
    }
    
    static def replaceAll(String text, Pattern pattern, (String[]) => String replacement) {
        replaceTimes(text, pattern, replacement, Integer.MAX_VALUE);
    }
    
    static def replaceAll(String text, String patternStr, (String[]) => String replacement) {
        replaceAll(text, Pattern.compile(patternStr), replacement);
    }
    
}