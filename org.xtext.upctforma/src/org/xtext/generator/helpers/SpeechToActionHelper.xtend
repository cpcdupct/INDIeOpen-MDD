package org.xtext.generator.helpers

import org.xtext.generator.i18n

class SpeechToActionHelper {
    
    def static generateButtonHtml(int tipoUnidad, String widgetId) {
        '''
        <button id="speech-to-action-«widgetId»" type="button" 
                aria-labelledby="heading-«widgetId»"
                class="speech-to-action btn btn-default visto" 
                title="«i18n.getMessage("speech-to-action-start")»"
                aria-pressed="false">
            <i class="fa-light fa-head-side-cough fa-2x" aria-hidden="true"></i>
        </button>
        '''
    }
}