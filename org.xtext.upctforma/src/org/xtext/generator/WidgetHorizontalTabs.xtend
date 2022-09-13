package org.xtext.generator

import upctforma.Widget
import java.util.List
import upctforma.ContentElement
import upctforma.ListValue
import upctforma.RecordValue
import upctforma.Text
import static upctforma.ContentUnitType.GAMIFICATION_VALUE
import org.xtext.generator.helpers.SpeechToActionHelper
import org.xtext.generator.helpers.SiteMapHelper

class WidgetHorizontalTabs  implements ContentGeneration<Widget>{	
	override generate(Widget widget, Output output,String idgen, String title, List<ContentElement> args, int j, Integer tipo, Integer tipoUnidad, String origin, int headingLevel){	

		var nextLevel = if (tipoUnidad == GAMIFICATION_VALUE) headingLevel else headingLevel + 1;
		SiteMapHelper.generateSubsection(tipoUnidad, idgen + "0", "HelpTab", output, widget);
		output.addStrElement('''
		  <div class="content-element">
			<div class="row">
				<div class="col-md-12 interview">
					<h«headingLevel» id="heading-«idgen»">
					  <i class="fas fa-info-circle"></i>&nbsp;
					  «if (widget.help != '') { widget.help } else { i18n.getMessage("HelpTab") } »
					  «SpeechToActionHelper.generateButtonHtml(tipoUnidad, idgen)»
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
			if (i != 0){
				output.addStrElement('''
					<i id="objetivo«idgen»«i»" class="objective far fa-check-circle fa-2x" aria-hidden="true"></i>
				''');
				output.addStrProgesoObj('''
                    ,"objetivo«idgen»«i»"
                ''');
			}
		}
		 	
		output.addStrElement('''			
				</div>
			</div>
			<div class="widget-tabs" id="«idgen»">
			  <div class="col-12 tta-message" aria-hidden="false" aria-atomic="true" aria-live="polite" id="tta-message-«idgen»" aria-relevant="all"></div>
              <ul class="nav nav-tabs" role="tablist" aria-labelledby="heading-«idgen»">
	    ''');
	    
	    for (var i = 0; i < tempwg1.listvalues.length; i++){
			val tempwg2 = tempwg1.listvalues.get(i) as RecordValue;
			val tempwg3 = tempwg2.recordvalues.get(0).fieldvalue as Text;
			
			output.addStrElement('''
           		<li role="presentation" class="nav-item"><a id="«idgen»«i»" data-type="HorizontalTabs" data-desc="«idgen»«i»" class="events tab-link nav-link ''');if (i==0){output.addStrElement('''active''');} else {output.addStrElement('''control_objetivo_unico_click''');} output.addStrElement('''" href="#pes«idgen»«i»" aria-controls="pes«idgen»«i»" role="tab" data-toggle="tab" aria-selected="''');if (i==0){output.addStrElement('''true''');} else {output.addStrElement('''false''');} output.addStrElement('''">''');
           		var secIdi = idgen + "e" + i.toString();
				WidgetFactory.getElement(output, args,(i+j),tempwg3,secIdi,title, tipoUnidad, origin, nextLevel);
			output.addStrElement('''
				</a></li>
			''');
		} 				
		output.addStrElement('''
			</ul>
		    <div class="tab-content" tabindex="-1">
		''');
		for (var i = 0; i < tempwg1.listvalues.length; i++){
			val tempwg2 = tempwg1.listvalues.get(i) as RecordValue;
			val tempwg4 = tempwg2.recordvalues.get(1).fieldvalue as ListValue;
			
			output.addStrElement('''
				<div role="tabpanel" class="tab-pane fade''');if (i==0){output.addStrElement(''' active show''');} output.addStrElement('''" id="pes«idgen»«i»" aria-labelledby="«idgen»«i»">
			''');
		
			for (var x = 0; x < tempwg4.listvalues.length; x++){
				val tempwg41 = tempwg4.listvalues.get(x) as ContentElement;
				var secIdi = idgen + "e" + i.toString() + "e" + x.toString();
				WidgetFactory.getElement(output, args,(i+j+x),tempwg41,secIdi,title, tipoUnidad, origin, nextLevel);
			}
			output.addStrElement('''
			     <a href="#«idgen»" class="tabtop" aria-label="«i18n.getMessage("TopTab")»"><i class="far fa-3x fa-arrow-alt-circle-up visto" aria-hidden="true"></i></a>
				</div>
			''');
		}		        
		output.addStrElement('''
			  </div>
			</div>
		  </div>
					''');
		
	}
	
}