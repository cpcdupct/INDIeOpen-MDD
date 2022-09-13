package org.xtext.generator

import java.util.List
import org.xtext.generator.helpers.SpeechToActionHelper
import upctforma.ContentElement
import upctforma.ListValue
import upctforma.RecordValue
import upctforma.Text
import upctforma.Widget

import static upctforma.ContentUnitType.GAMIFICATION_VALUE
import org.xtext.generator.helpers.SiteMapHelper

class WidgetModalButton implements ContentGeneration<Widget>{
	override generate(Widget widget, Output output,String idgen, String title, List<ContentElement> args, int j, Integer tipo, Integer tipoUnidad, String origin, int headingLevel){	

		var nextLevel = if (tipoUnidad == GAMIFICATION_VALUE) headingLevel else headingLevel + 2;
		var RecordValue tempwg1;
        if (tipo==1){
            tempwg1= widget.widgetelements.get(0) as RecordValue;
        }else{
            val arge = args.get(j) as Widget;
            tempwg1= arge.widgetelements.get(0) as RecordValue;
        }

        val tempwg2 = tempwg1.recordvalues.get(0).fieldvalue as Text;
        val tempwg3 = tempwg1.recordvalues.get(1).fieldvalue as ListValue;

		output.addStrElement('''
		<div class="content-element">
            <div class="row">
              <div class="col-md-12 interview">
                <h«headingLevel» id="heading-«idgen»">
                  <i class="fas fa-info-circle"></i>&nbsp;
                  « if (widget.help != ''){widget.help}else{i18n.getMessage("HelpButton")} »
                  « SpeechToActionHelper.generateButtonHtml(tipoUnidad, idgen) »
                </h«headingLevel»>
                <i id="objetivo«idgen»" class="objective far fa-check-circle fa-2x" aria-hidden="true"></i>
              </div>
            </div>
            <div class="row widget-modal">
              <div class="col-12 tta-message" aria-hidden="false" aria-atomic="true" aria-live="polite" id="tta-message-«idgen»" aria-relevant="all"></div>
              <div class="col-md-12 col-sm-12 col-xs-12 centered">
                <button type="button" class="btn btn-lg btn-success btn-modal control_objetivo_unico_click" data-toggle="modal" data-type="modal" data-desc="Open 'modal«idgen»'" id="«idgen»" data-target="#modal«idgen»">«tempwg2.html»</button>
              </div>
            </div>
            <div class="modal fade" id="modal«idgen»" tabindex="-1" aria-labelledby="modal-title-«idgen»" aria-hidden="true">
              <div class="modal-dialog">
                <div class="modal-content">
                  <div class="modal-header">
                    <h«headingLevel + 1» class="modal-title" id="modal-title-«idgen»">«tempwg2.html»</h«headingLevel + 1»>
                    <button type="button" class="close" data-dismiss="modal" aria-label="«i18n.getMessage("Close")»">
                      <span aria-hidden="true">&times;</span>
                    </button>
                  </div>
                  <div class="modal-body" style="max-height:600px; overflow: auto;">''');
		for (var x = 0; x < tempwg3.listvalues.length; x++){			
				val tempwg41 = tempwg3.listvalues.get(x) as ContentElement;
				var secIdi = idgen + "e" + x.toString();
				WidgetFactory.getElement(output, args,(j+x),tempwg41,secIdi,title, tipoUnidad, origin, nextLevel);
		}
		output.addStrElement('''					
    			  </div>
    			  <div class="modal-footer">
    			    <button type="button" class="btn btn-light" data-dismiss="modal">«i18n.getMessage("TextClose")»</button>
                  </div>
                </div>
              </div>
            </div>
          </div>
		'''	);
		output.addStrProgesoObj(''',"objetivo«idgen»"''');
		SiteMapHelper.generateSubsection(tipoUnidad, idgen, "HelpButton", output, widget);
	}
	
}