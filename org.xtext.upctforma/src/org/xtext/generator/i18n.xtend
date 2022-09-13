package org.xtext.generator

import java.util.ResourceBundle
import java.util.Locale
import java.text.MessageFormat

final class i18n {
	private final static String MESSAGES_KEY = "messages";
	private static ResourceBundle bundle;

	def static void setLocale(String lang, String coun){
		bundle = ResourceBundle.getBundle(MESSAGES_KEY,  new Locale(lang, coun));
	}
	
	def static String getMessage(String key){
		return bundle.getString(key);
	}	
	
	def static String getDisplayLanguage(){
		return bundle.getLocale().getDisplayLanguage();
	}
	
	def static String getCountry(){
		return bundle.getLocale().getCountry().toLowerCase();
	}

	def static String getMessageWithParameters(String key, Object ...params)
	{
		var formatter = new MessageFormat(bundle.getString(key), bundle.locale);
		return formatter.format(params);
	}
}