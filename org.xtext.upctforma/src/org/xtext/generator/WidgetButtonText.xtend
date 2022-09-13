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
import upctforma.Image

class WidgetButtonText  implements ContentGeneration<Widget>{
	override generate(Widget widget, Output output,String idgen, String title, List<ContentElement> args, int j, Integer tipo, Integer tipoUnidad, String origin, int headingLevel){		
		var ListValue images;
		if (tipo==1){
		  images = widget.widgetelements.get(0) as ListValue;	
		}else{
			val arge = args.get(j) as Widget;				
			images = arge.widgetelements.get(0) as ListValue;
		}
		var List<Integer> positions = IntStream.range(0, images.listvalues.length).boxed().collect(
                Collectors.toList());
                            
         var content = '''
         <div role="application" id="«idgen»" class="content-element widget-button-text">
            <div class="row mb-4">
             <div class="col-md-12 interview">
                 <h«headingLevel» id="heading-«idgen»">
                     <i class="fas fa-info-circle"></i>&nbsp;«if (widget.help != ''){widget.help}else{i18n.getMessage("HelpImages")}»
                     « SpeechToActionHelper.generateButtonHtml(tipoUnidad, idgen) »
                 </h«headingLevel»>
                 «FOR position : positions»
                   «IF position > 0 »
                     <i id="objetivo«idgen»«position»" class="objective far fa-check-circle fa-2x" aria-hidden="true"></i>
                   «ENDIF»
                 «ENDFOR»
             </div>
            </div>
            <div class="row">
              <div class="col-12 tta-message" aria-hidden="false" aria-atomic="true" aria-live="polite" id="tta-message-«idgen»" aria-relevant="all"></div>
            </div>
            <div aria-labelledby="heading-«idgen»" role="tablist" class="row">
            «FOR position : positions »
                « val record = images.listvalues.get(position) as RecordValue »
			    « val image = record.recordvalues.get(0).fieldvalue as Image »
    			<button type="button"
    			   id="«idgen»«position»"
    			   role="tab"
    			   class="mano btn btntexto control_objetivo_unico_click btn-show tab col-md-3 col-sm-3 col-xs-3 centered « if (position == 0 ) "show" »"
    			   aria-selected="« if (position == 0) "true" else "false" »"
    			   aria-controls="panel-«idgen»-«position»"
    			   tabindex="«if (position == 0) "0" else "-1" »">
    			     <img class="img-responsive img"
                        id="«idgen»«position»"
                        class="img-responsive img mano"
                        src="«image.url»"
                        alt="«image.alt»" />
                </button>
            «ENDFOR»
            </div>
            <div role="document" class="row shared-texts">
            «FOR position : positions »
              « val record = images.listvalues.get(position) as RecordValue »
              « val text = record.recordvalues.get(1).fieldvalue as Text »
			  <div id="panel-«idgen»-«position»"
			       role="tabpanel"
			       aria-labelledby="«idgen»«position»"
			       tabindex="0" 
			       class="shared-text col-md-12 « if (position == 0 ) "show" »">
			     « text.html.parse(widget) »
			  </div>
		    «ENDFOR»
		      <a href="#heading-«idgen»" class="tabtop" aria-label="«i18n.getMessage("TopTab")»"><i class="far fa-3x fa-arrow-alt-circle-up visto" aria-hidden="true"></i></a>
		    </div>
		</div>
		''';

        positions.forEach[pos |
            output.addStrProgesoObj(''',"objetivo«idgen»«pos»"''')
        ];
		output.addStrElement(content);

	}
	
}