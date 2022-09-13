package org.xtext.generator

import upctforma.Widget
import java.util.List
import upctforma.ContentElement
import upctforma.ListValue
import upctforma.RecordValue
import upctforma.Text
import java.util.stream.IntStream
import java.util.stream.Collectors
import org.xtext.generator.helpers.SpeechToActionHelper
import static extension org.xtext.generator.helpers.StringHelper.*
import org.xtext.generator.helpers.SiteMapHelper

class WidgetAudioTerm  implements ContentGeneration<Widget>{	
	override generate(Widget widget, Output output,String idgen, String title, List<ContentElement> args, int j, Integer tipo, Integer tipoUnidad, String origin, int headingLevel){		
		var ListValue tempwg1;
		if (tipo==1){
			tempwg1= widget.widgetelements.get(0) as ListValue;	
		}else{
			val arge = args.get(j) as Widget;				
			tempwg1= arge.widgetelements.get(0) as ListValue;
		}
		
		var List<Integer> positions = IntStream.range(0, tempwg1.listvalues.length).boxed().collect(
                Collectors.toList());

         var content = '''
         <div class="content-element">
         «FOR position : positions »
            « val tempwg2 = tempwg1.listvalues.get(position) as RecordValue »
			« val tempwg3 = tempwg2.recordvalues.get(0).fieldvalue as Text »
			« val tempwg4 = tempwg2.recordvalues.get(1).fieldvalue as Text »
			« val tempwg5 = tempwg2.recordvalues.get(2).fieldvalue as Text »
			« val captions = tempwg2.recordvalues.get(3).fieldvalue as Text »
			<div class="row">
				<div class="col-md-12 interview">
                    <h«headingLevel» id="heading-«idgen»">
                        <i class="fas fa-info-circle"></i>&nbsp;«if (widget.help != ''){widget.help}else{i18n.getMessage("HelpTerm")}»
                        « SpeechToActionHelper.generateButtonHtml(tipoUnidad, idgen + position.toString()) »
                    </h«headingLevel»>
                    <i id="objetivo«idgen»«position»" class="objective far fa-check-circle fa-2x" aria-hidden="true"></i>
				</div>
			</div>
			<div class="row widget-audio">
			    <div class="col-12 tta-message" aria-hidden="false" aria-atomic="true" aria-live="polite" id="tta-message-«idgen»" aria-relevant="all"></div>
				<div class="col-md-3 col-sm-3 col-xs-3">
					<audio id="audio«idgen»«position»"  crossorigin="use-credentials">
                      <source src="«tempwg3.html»" type="audio/mpeg" />
                      «IF !captions.html.isNullOrEmpty()»<track kind="captions" src="«captions.html»" srclang="«i18n.getCountry()»" label="«i18n.getDisplayLanguage()»" default>«ENDIF»
                    </audio>
                    <button id="«idgen»«position»" data-desc="«widget.name»"
                       class="termino btn-block btnmostrar mano control_objetivo_unico_click js-audio-button"
                       aria-describedby="term«idgen»«position»"
                       data-audio="audio«idgen»«position»" data-target="#term«idgen»«position»"
                       data-type="ShowTextAudio">
                       <span class="mb-0 d-block" id="audio-term-«idgen»-«position»">
                       «tempwg4.html.parse(widget)»
                       </span>
                       <span id="audio-state-«idgen»-«position»" class="sr-only audio-state" aria-live="polite"></span>
                       <i id="audio-icon-«idgen»-«position»" class="fa fa-solid fa-play"></i>
                    </button> 
				</div>
				<div id="term«idgen»«position»" class="col-md-9 col-sm-9 col-xs-9 hidden definicion_termino">
                  <p>«tempwg5.html.parse(widget)»</p>
				</div>
				<div><p class="audio-widget-content" aria-hidden="true"></p></div>
			</div>
		«ENDFOR»
		</div>
		''';

        positions.forEach[pos |
            output.addStrProgesoObj(''',"objetivo«idgen»«pos»"''')
        ];
		output.addStrElement(content);
		SiteMapHelper.generateSubsection(tipoUnidad, idgen, "HelpTerm", output, widget);
	}
	
}