package org.xtext.generator

import org.eclipse.emf.ecore.EObject

class Utils {
		def static <T extends EObject> T getContainerOfType(EObject ele, Class<T> type) {
		for (var EObject e = ele.eContainer(); e != null; e = e.eContainer())
			if (type.isInstance(e))
				return type.cast(e);
		return null;
	}
	
}