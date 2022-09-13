package org.xtext.generator

import upctforma.Widget
import java.util.List
import upctforma.ContentElement
import upctforma.Image
import upctforma.Text
import org.xtext.generator.helpers.SpeechToActionHelper
import static extension org.xtext.generator.helpers.StringHelper.*
import static extension org.xtext.generator.helpers.HTMLHelper.*
import org.xtext.generator.helpers.SiteMapHelper

class WidgetImageText implements ContentGeneration<Widget>{
	override generate(Widget widget, Output output,String idgen, String title, List<ContentElement> args, int j, Integer tipo, Integer tipoUnidad, String origin, int headingLevel){	
		val tempwg1= widget.widgetelements.get(0) as Image;
		val tempwg2= widget.widgetelements.get(1) as Text;
		val textType = switch(widget.widgettype.name) {
		    case "ImageTextRight": "image-text-right"
		    case "ImageTextOver": "image-text-over"
		    default: "image-text-default"
		}
		
		output.addStrElement('''
		  <div class="content-element">
			<div class="row">
				<div class="col-md-12 interview">
					<h«headingLevel» id="heading-«idgen»">
					   <i class="fas fa-info-circle"></i>&nbsp;
					   «if (widget.help != ''){widget.help}else{i18n.getMessage("HelpImage")}»
					   « SpeechToActionHelper.generateButtonHtml(tipoUnidad, idgen) »
					</h«headingLevel»>
					<i id="objetivo«idgen»" class="objective far fa-check-circle fa-2x" aria-hidden="true"></i>
				</div>
			</div>
			<div class="row widget-image «textType»">
			    <div class="col-12 tta-message" aria-hidden="false" aria-atomic="true" aria-live="polite" id="tta-message-«idgen»" aria-relevant="all"></div>
				<div class="image-wrapper">
				    <button class="btn image-element btnmostrar mano control_objetivo_unico_click"
				            id="«idgen»"
				            data-type="ImageTextRight"
				            data-desc="«widget.name»"
				            data-target="#imagen«idgen»"
				            aria-controls="imagen«idgen»"
				            aria-expanded="false"
				            aria-disabled="false">
					  <img class="img-responsive"
					    src="«tempwg1.url»" alt="«tempwg1.alt»" />
					</button>
				    <div id="imagen«idgen»" class="text-element hidden">
                        «tempwg2.html.parse(widget).fixInvalidHtml»
                    </div>
				</div>
				
			</div>
	      </div>
		''');
		output.addStrProgesoObj(''',"objetivo«idgen»"''');
		SiteMapHelper.generateSubsection(tipoUnidad, idgen, "HelpImage", output, widget);
	}
	
}