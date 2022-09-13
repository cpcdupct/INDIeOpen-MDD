package org.xtext.generator

import upctforma.ContentUnit
import org.xtext.generator.helpers.MenuButtonHelper
import org.xtext.generator.config.ConfigGenerator

class OpenUnit  extends LearningUnit{
	new(ContentUnit cu, String platformversion){
		super(cu,platformversion);
	}

	override setHeader1(Output output){
		var String idenUnit = cu.idunidad;
		super.header(output);
		output.addStrIndex('''
	    <!--Progreso-->
	    <link rel="stylesheet" type="text/css" href="«ConfigGenerator.INSTANCE.CDNUrl»/generator/content/«ConfigGenerator.INSTANCE.URLVersion»/css/iaVideo.min.css">
	    <link rel="stylesheet" href="«ConfigGenerator.INSTANCE.CDNUrl»/generator/content/«ConfigGenerator.INSTANCE.URLVersion»/css/styles«cu.theme».min.css" media="screen">
		«IF (cu.email.contains('upct'))»
			<link rel="icon" href="«ConfigGenerator.INSTANCE.CDNUrl»/img/faviconUPCT.png" type="image/png">
		«ELSE»
			<link rel="icon" href="«ConfigGenerator.INSTANCE.CDNUrl»/img/favicon.png" type="image/png">
		«ENDIF»			
	   	<script src="//amp.azure.net/libs/amp/2.3.10/azuremediaplayer.min.js"></script>
	   	<script src="«ConfigGenerator.INSTANCE.CDNUrl»/generator/content/«ConfigGenerator.INSTANCE.URLVersion»/js/iaVideo.min.js"></script>
	    <script src="https://content.jwplatform.com/libraries/tokenJWPlatform.js"></script>
	    <script src="https://kit.fontawesome.com/tokenFontAwesome.js" crossorigin="anonymous"></script>
		<script id="MathJax-script" async src="https://cdn.jsdelivr.net/npm/mathjax@3/es5/tex-mml-chtml.js"></script>
				<script >
						  MathJax = { tex: { 
						    inlineMath: [["$","$"],["\\(","\\)"]]}
						  };
				</script>
	  	</head>
	
		<body id="body" data-spy="scroll" data-offset="50" data-target="#navbar-main" data-unit="«idenUnit»">
			<header>
				<div id="navbar-main">
			      <div class="navbar navbar-expand-sm navbar-dark bg-dark" aria-owns="nav-options">
				  «IF (cu.email.contains('upct'))»
			 		<a class="navbar-brand" href="https://www.upct.es/" target="_blank">
			      		<img src="«ConfigGenerator.INSTANCE.CDNUrl»/img/upct.png" class="img-responsive" alt="Logo UPCT" />
			    	</a>
			      «ELSE»
			    	<a class="navbar-brand" href="https://indieopen.upct.es/" target="_blank">
			    		<img src="«ConfigGenerator.INSTANCE.CDNUrl»/img/logoblanco.png" class="img-responsive" alt="Logo INDIe" />
			    	</a>
			      «ENDIF»
	                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#nav-options" aria-controls="nav-options" aria-expanded="false" aria-label="Toggle navigation">
	                    <span class="fa fa-bars"></span>
	                </button>
			      </div>
	                <ul id="nav-options" class="collapse bg-dark" aria-label="«i18n.getMessage("nav-options")»">
	                  <li id="analytics" class="analytics-button-wrapper">
	                    «MenuButtonHelper.generateAnalyticsHtml(cu.type.value)»
	                  </li>
	                  <li id="accesibility">
	                  «MenuButtonHelper.generateAccessibilityMenuHtml»
	                  </li>
	                  <li id="progreso_mp">
	                  «MenuButtonHelper.generateProgressMapHtml(cu)»
	                  </li>
	                  <li id="highlight">
	                  «MenuButtonHelper.generateHighlightHtml»
	                  </li>
	                  <li id="notes">
	                  «MenuButtonHelper.generateAddNewNoteMenuHtml»
	                  </li>
                      <li id="speech">
                      «MenuButtonHelper.generateVoiceControlHtml»
                      </li>
	                </ul>
	                 «MenuButtonHelper.generateVoiceControlNotificationsHtml»
	 	    	</div>
	 	    	<div id="cabecera">
	 	    	   	<h1 class="titulo text-white text-center"><strong>«cu.name»</strong></h1>
	 	    	</div>		    	 	    	
           </header>
           <main>
		''');	
		
	}
	override setHeader2(Output output){
		output.addStrIndex(super.writefileindexp3().toString);
		output.addStrIndex(generateSharedLibraries("../../contentunit").toString);
		output.addStrIndex(output.addScripts().toString);
		output.addStrIndex('''<script src="../../gamification/game.js"></script>''');
		output.addStrIndex('''<script>localStorage.setItem('indieopenla', JSON.stringify({"url": window.location.pathname, "autor": "«cu.author» - «cu.institution»"}));</script>''');
		output.addStrIndex(super.close().toString);
	}
}