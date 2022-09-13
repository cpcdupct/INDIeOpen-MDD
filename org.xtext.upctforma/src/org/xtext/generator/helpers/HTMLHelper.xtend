package org.xtext.generator.helpers

import org.jsoup.Jsoup
import org.jsoup.nodes.Document

class HTMLHelper {
    
    def private static openLinksInNewTab(Document doc) {
        doc.select("a").forEach[link | {
            link.attr("target", "_blank");
            // Avoid https://en.wikipedia.org/wiki/Tabnabbing attacks
            link.attr("rel", "noreferrer noopener");
        }];
        return doc;
    }
    
//    def private static fixPreWithinParagraphs(String html)
//    {
//        var Document doc = Jsoup.parseBodyFragment(html);
//        doc.select("p").forEach[paragraph | {
//            if (paragraph.children.size === 1)
//            {
//                var elem = paragraph.children.first
//                if (elem.tag.name === "pre")
//                    paragraph.replaceWith(elem);
//            }
//        }];
//        return doc.select("body").html();
//    }
//    
    
    def static fixInvalidHtml(String html) 
    {
        var Document doc = Jsoup.parseBodyFragment(html);
        return doc.openLinksInNewTab.select("body").html()
    }
}