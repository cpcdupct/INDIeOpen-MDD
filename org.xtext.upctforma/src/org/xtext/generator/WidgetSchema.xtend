package org.xtext.generator

import upctforma.Widget
import upctforma.ContentElement
import java.util.List
import upctforma.ListValue
import upctforma.Image
import org.xtext.generator.helpers.SpeechToActionHelper
import java.util.stream.IntStream
import java.util.stream.Collectors
import java.util.Base64
import org.xtext.generator.helpers.SiteMapHelper

class WidgetSchema  implements ContentGeneration<Widget>{
	override generate(Widget widget, Output output,String idgen, String title, List<ContentElement> args, int j, Integer tipo, Integer tipoUnidad, String origin, int headingLevel){		
		var ListValue tempwg1;
		if (tipo==1){
			tempwg1= widget.widgetelements.get(0) as ListValue;	
		}else{
			val arge = args.get(j) as Widget;				
			tempwg1= arge.widgetelements.get(0) as ListValue;
		}
		
		val tempwg2 = tempwg1.listvalues.get(0) as Image;
		var List<Integer> positions = IntStream.range(0, tempwg1.listvalues.length).boxed().collect(
                Collectors.toList());
        var slides = '''
        «FOR position : positions BEFORE '[' SEPARATOR ',' AFTER ']'»
            « val tempwg3 = tempwg1.listvalues.get(position) as Image »
            { "src": "« tempwg3.url »", "alt": "« tempwg3.alt »" }
        «ENDFOR»
        '''
		var content = '''
		<div class="content-element">
		  <div class="row">
            <div class="col-md-12 interview">
                <h«headingLevel» id="heading-«idgen»">
                  <i class="fas fa-info-circle"></i>&nbsp;
                  « if (widget.help != ''){widget.help}else{i18n.getMessage("HelpSchema")} »
                  « SpeechToActionHelper.generateButtonHtml(tipoUnidad, idgen) »
                </h«headingLevel»>
                <i id="objetivo«idgen»" class="objective far fa-check-circle fa-2x" aria-hidden="true"></i>
            </div>
          </div>
          <div id="«idgen»" class="row widget-schema"
             data-content="«Base64.encoder.encodeToString(slides.getBytes("UTF-8"))»">
            <div class="col-12 tta-message" aria-hidden="false" aria-atomic="true" aria-live="polite" id="tta-message-«idgen»" aria-relevant="all"></div>
            <div class="col-md-12 centered">
                <button class="btn btn-schema mano" data-desc="«widget.name»" aria-labelledby="schema-img-«idgen»">
                  <img id="schema-img-«idgen»" class="img-responsive" src="«tempwg2.url»" alt="«tempwg2.alt»" />
                </button>
            </div>
          </div>
        </div>
		'''
		output.addStrElement(content);
		output.addStrProgesoObj(''',"objetivo«idgen»"''');
		SiteMapHelper.generateSubsection(tipoUnidad, idgen, "HelpSchema", output, widget);
	}
	
}