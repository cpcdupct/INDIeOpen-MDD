package org.xtext.generator

import upctforma.Video
import java.util.List
import upctforma.ContentElement
import java.util.Base64
import java.nio.charset.StandardCharsets
import static upctforma.ContentUnitType.INTEROPERABILITY_VALUE
import org.xtext.generator.helpers.SpeechToActionHelper
import org.xtext.generator.helpers.SiteMapHelper

class ElementVideo implements ContentGeneration<Video>{

	override generate(Video video, Output output, String secId, String title, List<ContentElement> args, int i, Integer tipo, Integer tipoUnidad, String origin, int headingLevel){

        var type = if (video.id.contains('youtube')) "youtube"
                   else if (video.type.value == 0) "indiemedia-normal"
                   else "indiemedia-interactive"
        var typeUnit = if (tipoUnidad == INTEROPERABILITY_VALUE) "interoperability"
                       else "open"

        var content = '''
        <div class="content-element">
          <div class="row">
            <div class="col-md-12 interview">
                <h«headingLevel» id="heading-«secId»">
                        «video.title»
                        « SpeechToActionHelper.generateButtonHtml(tipoUnidad, secId) »
                 </h«headingLevel»>
                <i id="objetivo«secId»" class="objective far fa-check-circle fa-2x" aria-hidden="true"></i>
            </div>
          </div>
          <div class="row widget-video">
          <div class="col-12 tta-message" aria-hidden="false" aria-atomic="true" aria-live="polite" id="tta-message-«secId»" aria-relevant="all"></div>
          <div id="«secId»" class="embed-responsive embed-responsive-16by9 element-video «type» «typeUnit»"
             data-video-id="«video.id»"
             data-title="«video.title»">
             <button class="btn btn-video-minimize" aria-label="«i18n.getMessage("video-minimize")»"><i class="fa-thin fa-circle-xmark fa-3x" aria-hidden="true"></i></button>
            «IF (video.id.contains('youtube'))»
            <div id="player-«secId»" class="centered"></div>

          «ELSEIF video.type.value == 0 »
            «var byte[] decodedBytesURL = Base64.getDecoder().decode(video.id)»
            «var String tempdecode = new String(decodedBytesURL)»
            «var String[] parts = tempdecode.split(',')»
            «var String url = parts.get(0)»
            «var String thumb = parts.get(1)»
            <div class="embed-responsive-item">
              <div class="screen-reader-description sr-only" aria-live="assertive" aria-atomic="true"></div>
              <video id="player-«secId»"
                     preload="none"
                     poster="«thumb»"
                     class="azuremediaplayer amp-default-skin"
                     data-src="«url»"
                     data-stype="application/vnd.ms-sstr+xml"
                     data-captions="«video.captions»"
                     data-descriptions="«video.descriptions»"
                     data-language="«i18n.getDisplayLanguage()»"
                     data-country="«i18n.getCountry()»"
                     controls>
              </video>
            </div>
          «ELSE»
            <div class="embed-responsive-item" id="player-«secId»"></div>

          «ENDIF»
            </div>
          </div>
        </div>
        '''
        output.addStrElement(content);
        output.addStrProgesoObj(''',"objetivo«secId»"''');
        SiteMapHelper.generateSubsectionVideo(tipoUnidad, secId, output);
	  	 
	}
}