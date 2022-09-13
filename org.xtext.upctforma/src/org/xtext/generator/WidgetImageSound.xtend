package org.xtext.generator

import upctforma.Widget
import upctforma.ContentElement
import java.util.List
import upctforma.ListValue
import upctforma.RecordValue
import upctforma.Text
import upctforma.Image
import java.util.stream.IntStream
import java.util.stream.Collectors
import org.xtext.generator.helpers.SpeechToActionHelper
import static extension org.xtext.generator.helpers.StringHelper.*
import org.xtext.generator.helpers.SiteMapHelper

class WidgetImageSound implements ContentGeneration<Widget>{	
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
		  <div class="row">
			<div class="col-md-12 interview">
				<h«headingLevel» id="heading-«idgen»">
				    <i class="fas fa-info-circle"></i>&nbsp;
				    «if (widget.help != ''){widget.help}else{i18n.getMessage("HelpImages")}»
				    « SpeechToActionHelper.generateButtonHtml(tipoUnidad, idgen) »
				</h«headingLevel»>
				<i id="objetivo«idgen»" class="objective far fa-check-circle fa-2x" aria-hidden="true"></i>
			</div>
		</div>
		<div class="row widget-image-sound" id="«idgen»" data-desc="«widget.name»">
		  <div class="col-12 tta-message" aria-hidden="false" aria-atomic="true" aria-live="polite" id="tta-message-«idgen»" aria-relevant="all"></div>
		  <ul class="list-unstyled col-12 row">
		  «FOR position : positions »
			« val tempwg2 = tempwg1.listvalues.get(position) as RecordValue »
			« val tempwg3 = tempwg2.recordvalues.get(0).fieldvalue as Text »
			« val tempwg4 = tempwg2.recordvalues.get(1).fieldvalue as Image »
			« val tempwg5 = tempwg2.recordvalues.get(2).fieldvalue as Text »
			« val hasText = tempwg5.html.trim().length > 0 »
			« val captions = tempwg2.recordvalues.get(3).fieldvalue as Text »
			<li class="col-4 mb-3 centered">
              <button class="image-sound-term ContenedorGeneral ImageSoundTransicion"
                aria-labelledby="image-sound-state-«idgen»-«position» «IF hasText »text«idgen»«position»«ENDIF» «idgen»«position»">
                <img id="«idgen»«position»" class="mano img-responsive vocabulary«idgen»" src="«tempwg4.url»"
                  data-value="«position»" data-sound="audio-«idgen»-«position»" 
                  «IF hasText»data-text="text«idgen»«position»"«ENDIF» 
                  alt="«tempwg4.alt»">
		        <audio id="audio-«idgen»-«position»" crossorigin="use-credentials">
		          <source src="«tempwg3.html»" type="audio/mpeg" />
		          «IF !captions.html.isNullOrEmpty()»<track kind="captions" src="«captions.html»" srclang="«i18n.getCountry()»" label="«i18n.getDisplayLanguage()»" default>«ENDIF»
		        </audio>
		        «IF hasText »
		        <span id="text«idgen»«position»" class="Contenido3">
                  <span class="image-sound-text">«tempwg5.html.parse(widget)»</span>
		        </span>
		        «ENDIF»
		        <span class="control-wrapper">
		          <i id="audio-icon-«idgen»-«position»" class="fa fa-solid fa-play"></i>
		          <span id="image-sound-state-«idgen»-«position»" class="image-sound-state"></span>
		        </span>
		        <span class="image-sound-term-content" aria-hidden="true"></span>
		      </button>
		    </li>
		  «ENDFOR»
		  </ul>
		  </div>
		</div>
		'''
		output.addStrProgesoObj(''',"objetivo«idgen»"''');
		SiteMapHelper.generateSubsection(tipoUnidad, idgen, "HelpImages", output, widget);		
		output.addStrElement(content);
	}
	
}