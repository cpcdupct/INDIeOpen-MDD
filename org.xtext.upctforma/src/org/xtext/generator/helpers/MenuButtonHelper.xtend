package org.xtext.generator.helpers

import static upctforma.ContentUnitType.INTEROPERABILITY_VALUE;
import org.xtext.generator.i18n
import upctforma.ContentUnit
import java.util.List
import java.util.stream.IntStream
import java.util.stream.Collectors

class MenuButtonHelper {

    def static generateVoiceControlHtml() {
        '''
        <button type="button" id="speech-to-action-global"
                aria-labelledby="start-voice-control"
                class="speech-to-action btn btn-menu btn-block btn-dark rounded-0 text-white pr-3 pl-3"
                aria-pressed="false">
          <i class="fas fa-microphone-slash fa-3x"></i>
          <span id="start-voice-control" class="menu-label">«i18n.getMessage("speech-to-action-start")»</span>
        </button>
        '''
    }

    def static generateVoiceControlNotificationsHtml() {
        '''
        <div class="tta-message" aria-hidden="false" aria-atomic="true" aria-live="polite" id="tta-message-global" aria-relevant="all"></div>
        '''
    }

   
    def static generateAnalyticsHtml(Integer typeValue) {
        '''
        <a aria-labelledby="analytics-label" href="https://«if (typeValue== INTEROPERABILITY_VALUE) "contentserver.upct.es" else "opencontent.upct.es"»/la/" target="_blank" class="btn btn-block btn-link btn-dark text-white">
          <i class="fa-solid fa-chart-column fa-3x"></i>
          <span id="analytics-label" class="menu-label">«i18n.getMessage("Analytics")»</span>
        </a>
        '''
    }

    def static generateAccessibilityMenuHtml() {
        '''<!-- accesibility button -->
           <div class="accessibility-button-wrapper">
             <button type="button" aria-labelledby="accessibility-label" class="btn btn-menu btn-block btn-dark btn-link text-white" data-toggle="modal" data-target="#accesibilityModal">
               <i class="fa-regular fa-universal-access fa-3x"></i>
               <span id="accessibility-label" class="menu-label">«i18n.getMessage("Accessibility")»</span>
             </button>
           </div>
            <!-- accesibility modal -->
            <div class="modal fade" id="accesibilityModal" tabindex="-1" aria-labelledby="accesibilityModalLabel" aria-hidden="true">
              <div class="modal-dialog modal-xl">
                <div class="modal-content">
                  <div class="modal-header">
                    <h2 class="modal-title text-white" id="accesibilityModalLabel">«i18n.getMessage("AccessibilityOptions")»</h2>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                  </div>
                  <div class="modal-body">
                    <form>
                      <div class="form-group">
                      <label for="fontSize">«i18n.getMessage("FontSize")»</label>
                        <select id="fontSize" name="fontSize" class="form-control">
                          <option value="0" selected>«i18n.getMessage("Default")»</option>
                          <option value="16px">100%</option>
                          <option value="20px">125%</option>
                          <option value="24px">150%</option>
                          <option value="28px">175%</option>
                          <option value="32px">200%</option>
                        </select>
                      </div>
                      <div class="form-group">
                        <label for="fontType">«i18n.getMessage("FontType")»</label>
                        <select id="fontType" name="fontType" class="form-control">
                          <option value="arial, 'Liberation Sans', 'Lato', sans-serif" selected>Arial</option>
                          <option value="'Titillium Web', sans-serif">Titillium Web</option>
                          <option value="'Encode Sans', sans-serif">Encode Sans</option>
                          <option value="'Roboto', sans-serif">Roboto</option>
                        </select>
                      </div>
                      <div class="form-group">
                        <label for="backgroundColor">«i18n.getMessage("BackgroundColor")»</label>
                        <select id="backgroundColor" name="backgroundColor" class="form-control">
                          <option value="0" selected>«i18n.getMessage("Default")»</option>
                          <option value="#ffffff">«i18n.getMessage("White")»</option>
                          <option value="#fcf8e8">«i18n.getMessage("Beige")»</option>
                          <option value="#d5d5d5">«i18n.getMessage("Grey")»</option>
                        </select>
                      </div>
                      <div class="form-group">
                        <label for="letterSpacing">«i18n.getMessage("LetterSpacing")»</label>
                        <select id="letterSpacing" name="letterSpacing" class="form-control">
                          <option value="0" selected>«i18n.getMessage("Default")»</option>
                          <option value="letter-spacing-s">«i18n.getMessageWithParameters("TimesLetterSpace", "-0.1")»</option>
                          <option value="letter-spacing-l">«i18n.getMessageWithParameters("TimesLetterSpace", "0.1")»</option>
                          <option value="letter-spacing-xl">«i18n.getMessageWithParameters("TimesLetterSpace", "0.15")»</option>
                          <option value="letter-spacing-xxl">«i18n.getMessageWithParameters("TimesLetterSpace", "0.2")»</option>
                        </select>
                      </div>
                      <div class="form-group">
                        <label for="lineSpacing">«i18n.getMessage("LineSpacing")»</label>
                        <select id="lineSpacing" name="lineSpacing" class="form-control">
                          <option value="0" selected>«i18n.getMessage("Default")»</option>
                          <option value="1.25">«i18n.getMessageWithParameters("TimesLineSpace", "1.25")»</option>
                          <option value="1.5">«i18n.getMessageWithParameters("TimesLineSpace", "1.5")»</option>
                          <option value="1.75">«i18n.getMessageWithParameters("TimesLineSpace", "1.75")»</option>
                          <option value="2">«i18n.getMessageWithParameters("TimesLineSpace", "2")»</option>
                          <option value="2.25">«i18n.getMessageWithParameters("TimesLineSpace", "2.25")»</option>
                        </select>
                      </div>
                      <div class="form-group">
                          <label for="wordSpacing">«i18n.getMessage("WordSpacing")»</label>
                          <select id="wordSpacing" name="wordSpacing" class="form-control">
                            <option value="0" selected>«i18n.getMessage("Default")»</option>
                            <option value="0.8rem">«i18n.getMessageWithParameters("TimesWordSpace", "0.8")»</option>
                            <option value="0.16rem">«i18n.getMessageWithParameters("TimesWordSpace", "0.16")»</option>
                            <option value="0.24rem">«i18n.getMessageWithParameters("TimesWordSpace", "0.24")»</option>
                          </select>
                      </div>
                      <div class="form-group">
                            <label for="paragraphSpacing">«i18n.getMessage("ParagraphSpacing")»</label>
                            <select id="paragraphSpacing" name="paragraphSpacing" class="form-control">
                              <option value="0" selected>«i18n.getMessage("Default")»</option>
                              <option value="paragraph-spacing-s">«i18n.getMessageWithParameters("TimesParagraphSpace", "1")»</option>
                              <option value="paragraph-spacing-l">«i18n.getMessageWithParameters("TimesParagraphSpace", "2")»</option>
                              <option value="paragraph-spacing-xl">«i18n.getMessageWithParameters("TimesParagraphSpace", "3")»</option>
                              <option value="paragraph-spacing-xxl">«i18n.getMessageWithParameters("TimesParagraphSpace", "4")»</option>
                           </select>
                      </div>
                      <button id="saveChanges" type="submit" class="btn btn-success mt-5 ml-1">«i18n.getMessage("SaveChanges")»</button>
                      <button type="button" class="btn btn-success reestablecer mt-5 ml-1">«i18n.getMessage("DefaultOptions")»</button>
                    </form>
                  </div>
                  <div class="modal-footer">
                    <button id="closeAccessibility" type="button" class="btn btn-light" data-dismiss="modal">«i18n.getMessage("Close")»</button>
                  </div>
                </div>
              </div>
            </div>'''
    }

    def static generateAddNewNoteMenuHtml() {
        '''
        <div class="add-new-note-button-wrapper">
          <button type="button" id="add_new" aria-labelledby="add-new-note-label" class="btn btn-menu btn-block btn-dark rounded-0 text-white pr-3 pl-3">
            <i class="fa-solid fa-note fa-3x"></i>
            <span id="add-new-note-label" class="menu-label">«i18n.getMessage("AddNewNote")»</span>
          </button>
        </div>
        '''
    }

    def static generateProgressMapHtml(ContentUnit cu) {

        var List<Integer> positions = IntStream.range(0, cu.sections.length).boxed().collect(
                Collectors.toList());

        '''
        <div class='btn-group dropleft d-block progress-button-wrapper'>
          <button type='button' aria-labelledby='progress-heading' class='btn btn-menu btn-block btn-dark rounded-0 dropdown-toggle' data-toggle='dropdown' aria-haspopup='true' aria-expanded='false'>
            <i class='fas fa-tasks fa-3x'></i>
            <span id='progress-heading' class="menu-label">«i18n.getMessage("ProgressInfo")»</span>
          </button>
          <nav class='dropdown-menu' style='overflow: auto; height: 750px;'>
          	<ul class="nav-style">
            «FOR position : positions »
              « var section = cu.sections.get(position) »
              <li>
	              <a href='#apdo«position»' class='dropdown-item centered'>
	                <p>«section.name.toUpperCase» </p>
	                <div class='progress' style='height: 20px;'>
	                  <div class='progress-bar' role='progressbar' style='width: 100%;' aria-valuenow='100' aria-valuemin='0' aria-valuemax='100'></div>
	                </div>
	              </a>
              </li>
            «ENDFOR»
            </ul>
          </nav>
        </div>
        '''
    }

    def static generateHighlightHtml() {
        '''
        <!-- highlight button -->
        <div class="highlight-button-wrapper">
          <button type="button" aria-label="« i18n.getMessage("Highlight") »" class="btn btn-menu btn-block btn-dark rounded-0 text-white" data-toggle="modal" data-target="#highlightModal">
            <i class="fa-duotone fa-highlighter fa-3x"></i>
            <span class="menu-label">«i18n.getMessage("Highlight")»</span>
          </button>
        </div>
        <!-- highlight modal -->
        <div class="modal fade" id="highlightModal" tabindex="-1" aria-labelledby="highlightModalLabel" aria-hidden="true">
          <div class="modal-dialog modal-xl">
            <div class="modal-content">
              <div class="modal-header">
                <h2 class="modal-title text-white" id="highlightModalLabel">« i18n.getMessage("HighlightOptions")»</h2>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                  <span aria-hidden="true">&times;</span>
                </button>
              </div>
              <div class="modal-body">
                <fieldset class="row form-group mt-4">
                    <legend id="highlightingColor" class="float-left col-form-label col-sm-3 pt-0">« i18n.getMessage("HighlightingColor") »</legend>
                    <div class="col-sm-9">
                      <div class="color-picker"></div>
                    </div>
                    <div class="offset-sm-3 col-sm-9">
                      <button type="button" class="btn btn-success deleteAll"> « i18n.getMessage("DeleteHighlights") » </button>
                    </div>
                </fieldset>
                <p class="mt-5">
                  <i class="fas fa-info-circle"></i> « i18n.getMessage("HighlightInstructions") »
                </p>
              </div>
              <div class="modal-footer">
                <button id="closeHighlight" type="button" class="btn btn-light" data-dismiss="modal"> « i18n.getMessage("Close") » </button>
              </div>
            </div>
          </div>
        </div>
        '''
    }
}