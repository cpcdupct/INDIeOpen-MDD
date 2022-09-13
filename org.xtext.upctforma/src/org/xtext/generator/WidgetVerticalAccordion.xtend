package org.xtext.generator

import upctforma.Widget
import upctforma.ContentElement
import java.util.List
import upctforma.RecordValue
import upctforma.Text
import upctforma.ListValue
import static upctforma.ContentUnitType.GAMIFICATION_VALUE
import org.xtext.generator.helpers.SpeechToActionHelper
import org.xtext.generator.helpers.SiteMapHelper

class WidgetVerticalAccordion  implements ContentGeneration<Widget>{
	override generate(Widget widget, Output output,String idgen, String title, List<ContentElement> args, int j, Integer tipo, Integer tipoUnidad, String origin, int headingLevel){	
		
		var nextLevel = if (tipoUnidad == GAMIFICATION_VALUE) headingLevel else headingLevel + 2;
		SiteMapHelper.generateSubsection(tipoUnidad, idgen + "0", "HelpTab", output, widget);
		output.addStrElement('''
		  <div class="content-element">
			<div class="row">
				<div class="col-md-12 interview">
					<h«headingLevel» id="heading-«idgen»">
					  <i class="fas fa-info-circle"></i>&nbsp;
					  « if (widget.help != '') { widget.help } else { i18n.getMessage("HelpTab") } »
					  « SpeechToActionHelper.generateButtonHtml(tipoUnidad, idgen) »
					</h«headingLevel»>
		''');
		var ListValue tempwg1;
		if (tipo==1){
			tempwg1= widget.widgetelements.get(0) as ListValue;
		}else{
			val arge = args.get(j) as Widget;			
			tempwg1= arge.widgetelements.get(0) as ListValue;
		}
		for (var i = 0; i < tempwg1.listvalues.length; i++){
			output.addStrElement('''
			        <i id="objetivo«idgen»«i»" class="objective far fa-check-circle fa-2x" aria-hidden="true"></i>
			''');
			
			output.addStrProgesoObj('''
                    ,"objetivo«idgen»«i»"
                ''');
		}
		 	
		output.addStrElement('''				
				</div>
			</div>
			<div class="accordion" id="«idgen»">
			  <div class="col-12 tta-message" aria-hidden="false" aria-atomic="true" aria-live="polite" id="tta-message-«idgen»" aria-relevant="all"></div>
		''');
		
		for (var i = 0; i < tempwg1.listvalues.length; i++){
			val tempwg2 = tempwg1.listvalues.get(i) as RecordValue;
			val tempwg3 = tempwg2.recordvalues.get(0).fieldvalue as Text;
			val tempwg4 = tempwg2.recordvalues.get(1).fieldvalue as ListValue;
			
				output.addStrElement('''
					<div class="card mb-1">
						<div class="card-header p-0" id="heading«idgen»«i»">

		                    <h«headingLevel + 1» class="mb-0  control_objetivo_unico_click" id="«idgen»«i»" data-type="VerticalAccordion" data-desc="«widget.name»">
		                        <button class="events btn btn-accordion btn-block text-left collapsed" type="button" data-toggle="collapse" data-target="#collapse«idgen»«i»" aria-expanded="false" aria-controls="collapse«idgen»«i»">
		         ''');
		         
		        var secIdi1 = idgen + "e" + i.toString();
		        WidgetFactory.getElement(output, args, (i+j), tempwg3,secIdi1,title, tipoUnidad, origin, nextLevel);
		        
				output.addStrElement('''
						</button>						
		                    </h«headingLevel + 1»>
		                </div>        
		                <div role="region" tabindex="-1" id="collapse«idgen»«i»" class="accordion-region collapse" aria-labelledby="heading«idgen»«i»" data-parent="#«idgen»">
		                    <div class="card-body">
				''');		                 
				for (var x = 0; x < tempwg4.listvalues.length; x++){
					val tempwg41 = tempwg4.listvalues.get(x) as ContentElement;  
					var secIdi2 = idgen + "e" + i.toString() + "e" + x.toString(); 
                    WidgetFactory.getElement(output, args, (i+j+x), tempwg41,secIdi2,title,  tipoUnidad, origin, nextLevel);
      			}
				output.addStrElement('''
                                <a href="#heading«idgen»«i»" class="tabtop" aria-label="«i18n.getMessage("TopTab")»"><i class="far fa-3x fa-arrow-alt-circle-up visto" aria-hidden="true"></i></a>
		                    </div>
		                </div>
	            	</div>				
				''');
			}
			output.addStrElement('''		        				
			</div>
	     </div>
			''');
			
	}
	
}