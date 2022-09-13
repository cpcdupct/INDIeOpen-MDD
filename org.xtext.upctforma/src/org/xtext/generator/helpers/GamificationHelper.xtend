package org.xtext.generator.helpers

import org.xtext.generator.Utils
import org.xtext.generator.i18n
import upctforma.ContentUnit
import upctforma.Widget

import static upctforma.ContentUnitType.INTEROPERABILITY_VALUE
import static upctforma.ContentUnitType.OPEN_VALUE

class GamificationHelper {

    def static generateButtonHtml(int tipoUnidad, String widgetId, String origin) {
        switch tipoUnidad {
        case INTEROPERABILITY_VALUE:  '''<?php if ($config->isInstructor()){ ?><button id="game«widgetId»" onclick="startGame('«widgetId»', '«origin»')" type="button" class="btn btn-default visto" aria-label="«i18n.getMessage("GamificationStart")»"><i class="fas fa-gamepad fa-2x" aria-hidden="true"></i></button><?php } ?>'''
        case OPEN_VALUE:  '''<span id="game«widgetId»" data-widget="«widgetId»" data-origin="«origin»"></span>'''
        default: ''''''
        }
    }

    def static belongsToGamification(Widget widget, String idgen)
    {
        return idgen.equals(Utils.getContainerOfType(widget, ContentUnit).idunidad);
    }

}
