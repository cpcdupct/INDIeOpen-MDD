package org.xtext.generator

import upctforma.ContentUnit
import org.xtext.generator.helpers.MenuButtonHelper
import org.xtext.generator.config.ConfigGenerator

class InteroperabilityUnit extends LearningUnit{
	new(ContentUnit cu, String platformversion){
		super(cu,platformversion);
	}
	
	def progresoObjetivo(Output output){
        output.addStrProgesoObj('''["objetivos"''');
    }
	
	def closeprogresoObjetivo(Output output){
        output.addStrProgesoObj(''']''');
    }

	override generateSharedLibraries(String contentUnitPath) {
		'''
	    	<script src="«ConfigGenerator.INSTANCE.CDNUrl»/generator/content/«ConfigGenerator.INSTANCE.URLVersion»/js/progreso_mapav13.min.js"></script>
	    '''
    }
    
	override setHeader1(Output output){
	    progresoObjetivo(output);
		var String idenUnit = this.cu.idunidad;
		output.addStrIndex('''
		<?php	
		require_once "globalConfig.php";
		
		$config = GlobalConfig::getInstance();
		$config->initializeData("«idenUnit»", GlobalConfigTypeAccess::Unit, "«cu.learninganalytics»", "«cu.name»");
		$config->setSession();
		$config->setCookie();
		?>
		''');
		super.header(output);
	
		output.addStrIndex(	'''
		    <!--Progreso-->
		    <link rel="stylesheet" type="text/css" href="«ConfigGenerator.INSTANCE.CDNUrl»/generator/content/«ConfigGenerator.INSTANCE.URLVersion»/css/iaVideo.min.css">
			<link rel="stylesheet" href="«ConfigGenerator.INSTANCE.CDNUrl»/generator/content/«ConfigGenerator.INSTANCE.URLVersion»/css/styles«cu.theme».min.css" media="screen">
			<link rel="stylesheet" type="text/css" href="../../contentunit/css/errorLTI.css">
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
	
	  		<body id="body" data-spy="scroll" data-offset="50" data-target="#navbar-main"
	  		 data-unit="«idenUnit»" 
	  		 data-objectives='<?php echo($config->get("OBJECTIVES")); ?>'>
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
	                «IF (cu.learninganalytics == 1)»
	                <li id="analytics" class="analytics-button-wrapper">
	                  «MenuButtonHelper.generateAnalyticsHtml(cu.type.value)»
	                </li>
	                «ENDIF»
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
				        	
		        <div id="message" class="oculto">
		            <div style="padding: 5px;">
		                <div id="inner-message" class="alert alert-danger">
		                   «i18n.getMessage("warning-open-units-simultaneously")»
		                </div>
		            </div>
		        </div>
		''');
	}
	override setHeader2(Output output){
		output.addStrIndex(super.writefileindexp3().toString);
		output.addStrIndex(generateSharedLibraries("../../contentunit").toString);
		output.addStrIndex(output.addScripts().toString);
		output.addStrIndex(super.close().toString);
		closeprogresoObjetivo(output);
	}
}