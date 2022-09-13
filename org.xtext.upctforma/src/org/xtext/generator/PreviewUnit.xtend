package org.xtext.generator

import upctforma.ContentUnit
import org.xtext.generator.helpers.MenuButtonHelper
import org.xtext.generator.config.ConfigGenerator

class PreviewUnit  extends LearningUnit{
	new(ContentUnit cu, String platformversion){
		super(cu,platformversion);
	}
	
	override setHeader1(Output output){
		output.addStrIndex('''
		<?php
			require_once('encriptar.php');
			 
			if ((empty($_GET["vt"]))||(!IsValidRequest($_GET["vt"],$_SERVER['REQUEST_URI']))){
		        echo ("<h1>ERROR: URL no accesible. Consulte con el autor del contenido.</h1>");
		        echo ("<h2>Universidad Politécnica de Cartagena</h2>");
		        echo ("<h3>Centro de Producción de Contenidos Digitales</h3>");
		        exit;
			}
		?>
		''');
		super.header(output);
		var String idenUnit = cu.idunidad;
		
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
	    <script src="https://content.jwplatform.com/libraries/tokenJwPlayer.js"></script>
	    <script src="https://kit.fontawesome.com/tokenFontawesome.js" crossorigin="anonymous"></script>
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
			      <div aria-owns="nav-options" class="navbar navbar-expand-sm navbar-dark bg-dark">
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
		output.addStrIndex(generateSharedLibraries("contentunit").toString);
		output.addStrIndex(output.addScripts().toString);
		output.addStrIndex(super.close().toString);
	}
}