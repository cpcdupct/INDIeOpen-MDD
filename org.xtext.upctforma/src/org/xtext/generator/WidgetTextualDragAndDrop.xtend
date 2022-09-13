package org.xtext.generator

import java.util.ArrayList
import java.util.List
import org.xtext.generator.helpers.GamificationHelper
import upctforma.ContentElement
import upctforma.ContentUnit
import upctforma.ListValue
import upctforma.RecordValue
import upctforma.Text
import upctforma.Widget
import static extension org.xtext.generator.helpers.GamificationHelper.belongsToGamification
import static upctforma.ContentUnitType.GAMIFICATION_VALUE;
import java.util.stream.IntStream
import java.util.stream.Collectors
import java.util.Base64
import org.xtext.generator.helpers.SpeechToActionHelper
import static extension org.xtext.generator.helpers.StringHelper.*
import org.xtext.generator.helpers.SiteMapHelper


class WidgetTextualDragAndDrop implements ContentGeneration<Widget> {

    override generate(Widget wg, Output output, String idgen, String title, List<ContentElement> args, int j,
        Integer tipo, Integer tipoUnidad, String origin, int headingLevel) {
        if( tipoUnidad != GAMIFICATION_VALUE || wg.belongsToGamification(idgen)) {

            var ListValue tempwg1;
            if(tipo == 1) {
                tempwg1 = wg.widgetelements.get(0) as ListValue;
            } else {
                val arge = args.get(j) as Widget;
                tempwg1 = arge.widgetelements.get(0) as ListValue;
            }

            var List<Integer> positions = IntStream.range(0, tempwg1.listvalues.length).boxed().collect(
                Collectors.toList());

            var options = '''
            «FOR position : positions BEFORE '[' SEPARATOR ',' AFTER ']'»
                « val tempwg2 = tempwg1.listvalues.get(position) as RecordValue »
                « val tempwg3 = tempwg2.recordvalues.get(0).fieldvalue as Text »
                « val tempwg4 = tempwg2.recordvalues.get(1).fieldvalue as Text »
                { "term": «tempwg3.html.parse(wg).json», "definition": «tempwg4.html.parse(wg).json» }
            «ENDFOR»
            '''

            var tempoIndexTDD = '''
                «IF tipoUnidad == GAMIFICATION_VALUE »
                <section class="bgwhitecab2">
                  <div class="container">
                «ENDIF»
                   <div class="content-element">
                    <div class="row">
                	  <div class="col-md-12 interview">
                        <h«headingLevel» id="heading-«idgen»"><i class="fas fa-info-circle"></i>&nbsp;«if (wg.help != ''){wg.help}else{i18n.getMessage("HelpDragAndDrop")}»
                        « GamificationHelper.generateButtonHtml(tipoUnidad, idgen, origin) »
                        « SpeechToActionHelper.generateButtonHtml(tipoUnidad, idgen) »
                		</h«headingLevel»>
                		<i id="objetivo«idgen»" class="objective far fa-check-circle fa-2x" aria-hidden="true"></i>
		              </div>
                    </div>
                    <div id="«idgen»" class="row drag-drop" aria-labelledby="heading-«idgen» activity-description-«idgen»" data-desc="«wg.name»" data-content="«Base64.encoder.encodeToString(options.getBytes("UTF-8"))»">
                        <div id="activity-description-«idgen»" class="activity-description sr-only">«i18n.getMessageWithParameters("accessible-dragdrop-list", tempwg1.listvalues.length) »</div>
                        <div class="col-md-12" aria-hidden="false" aria-atomic="true" aria-live="polite" id="drag-drop-message-«idgen»" aria-relevant="all"></div>
                        <div id="dragdrop-table-options-«idgen»" class="col-12 d-sm-none dragdrop-table-options">
                          <div>
                            <button class="btn btn-success btn-block btn-check mb-4">
                                «i18n.getMessage("HelpCheckAnswer")»
                            </button>
                            <button class="btn btn-reset btn-block btn-secondary">
                                «i18n.getMessage("ResetAnswer")»
                            </button>
                          </div>
                          <div class="col-12 mt-4 result-text" id="mobile-result-«idgen»" aria-atomic="true" aria-live="polite" aria-relevant="all"></div>
                        </div>
                        <div class="drag-drop-grid col-12">
                            <div id="drag-options-«idgen»" class=""></div>
                            <div id="drag-elections-«idgen»" class=""></div>
                            <div id="drag-descriptions-«idgen»" class=""></div>
                        </div>
                        <div class="col-12 mb-4 centered result-text" id="result-«idgen»" aria-atomic="true" aria-live="polite" aria-relevant="all"></div>
                        <div class="col-12 col-sm-6 mb-2 d-none d-sm-block">
                          <button id="check-«idgen»" class="btn btn-block btn-success btn-gamification btn-check">
                            «i18n.getMessage("HelpCheckAnswer")»
                          </button>
                        </div>
                        <div class="col-12 col-sm-6 mb-2 d-none d-sm-block">
                         <button type="button" class="btn btn-reset btn-block btn-secondary">«i18n.getMessage("ResetAnswer")»</button>
                        </div>
                        <div class="modal fade drag-drop-modal"
                             role="dialog"
                             id="drag-drop-modal-«idgen»" tabindex="-1"
                             aria-labelledby="drag-drop-label-«idgen»"
                             aria-modal="true"
                             aria-hidden="true">
                           <div class="modal-dialog" role="document"
                                aria-describedby="drag-drop-current-option-«idgen» drag-drop-desc-«idgen»">
                              <div class="modal-content">
                                <div class="modal-header">
                                  <h«headingLevel + 1» class="modal-title" id="drag-drop-label-«idgen»">
                                    «i18n.getMessage("accessible-dragdrop-modal-title")»
                                  </h«headingLevel + 1»>
                                </div>
                                <div class="modal-body">
                                  <div class="drag-drop-current-option" id="drag-drop-current-option-«idgen»"></div>
                                  <p id="drag-drop-desc-«idgen»">
                                    «i18n.getMessage("accessible-dragdrop-modal-description")»
                                  </p>
                                  <ol class="modal-options">
                                  </ol>
                               </div>
                               <div class="modal-footer">
                                 <button data-dismiss="modal" class="btn btn-default btn-close btn-light">«i18n.getMessage("Close")»</button>
                               </div>
                             </div>
                           </div>
                         </div>
                    </div>
                   </div>
                «IF tipoUnidad == GAMIFICATION_VALUE »
                  </div>
                </section>
                «ENDIF»
            ''';

            output.addStrProgesoObj('''
                ,"objetivo«idgen»"
            ''');
            output.addStrIndex(tempoIndexTDD);
            if(tipoUnidad == GAMIFICATION_VALUE) {
                output.addStrTeacher(tempoIndexTDD);
            }
            SiteMapHelper.generateSubsection(tipoUnidad, idgen, "HelpDragAndDrop", output, wg);
        }
    }

}
