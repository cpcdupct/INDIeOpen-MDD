package org.xtext.generator

import upctforma.ContentUnit
import static upctforma.ContentUnitType.INTEROPERABILITY_VALUE
import static upctforma.ContentUnitType.OPEN_VALUE
import static upctforma.ContentUnitType.PREVIEW_VALUE
import static upctforma.ContentUnitType.GAMIFICATION_VALUE


class UnitFactory {
	
	
	def static getLearningUnit(ContentUnit cu, String version){
		switch cu.type.value{
			case INTEROPERABILITY_VALUE: {
				return new InteroperabilityUnit(cu, version);
			}
			case OPEN_VALUE: {
				return new OpenUnit(cu, version);	
			}
			case PREVIEW_VALUE: {
				return new PreviewUnit(cu, version);
			}
			case GAMIFICATION_VALUE: {
				return new GamificationUnit(cu, version);
			}  
		}
	}
}