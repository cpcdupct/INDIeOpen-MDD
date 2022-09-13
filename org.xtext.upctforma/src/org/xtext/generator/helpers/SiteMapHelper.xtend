package org.xtext.generator.helpers

import static upctforma.ContentUnitType.INTEROPERABILITY_VALUE;
import org.xtext.generator.i18n
import upctforma.ContentUnit
import java.util.List
import java.util.stream.IntStream
import java.util.stream.Collectors
import static upctforma.ContentUnitType.GAMIFICATION_VALUE
import static upctforma.ContentUnitType.INTEROPERABILITY_VALUE
import org.xtext.generator.Output
import upctforma.Widget

class SiteMapHelper {

    def static generateSubsection(int tipoUnidad, String idgen, String helpMessage, Output output, Widget widget) {
    	var href = '''«if (tipoUnidad == INTEROPERABILITY_VALUE) "<?php echo $config->get('LINK_PATH'); ?>" else if (tipoUnidad == GAMIFICATION_VALUE) "game.html" else "index.html"»''';
		output.addStrMap('''
			<li><a class="item-link" href="«href»?element=«idgen»">«if (widget.help != ''){widget.help}else{i18n.getMessage(helpMessage)}»</a></li>
		''');
    }
    def static generateSubsectionVideo(int tipoUnidad, String idgen, Output output) {
    	var href = '''«if (tipoUnidad == INTEROPERABILITY_VALUE) "<?php echo $config->get('LINK_PATH'); ?>" else if (tipoUnidad == GAMIFICATION_VALUE) "game.html" else "index.html"»''';
		output.addStrMap('''
			<li><a class="item-link" href="«href»?element=«idgen»">«i18n.getMessage("HelpVideo")»</a></li>
		''');
    }

}