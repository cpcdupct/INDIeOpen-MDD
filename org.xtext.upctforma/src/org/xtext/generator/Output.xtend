package org.xtext.generator

import org.eclipse.xtext.generator.IFileSystemAccess2

import static upctforma.ContentUnitType.INTEROPERABILITY_VALUE
import static upctforma.ContentUnitType.OPEN_VALUE
import static upctforma.ContentUnitType.PREVIEW_VALUE
import static upctforma.ContentUnitType.GAMIFICATION_VALUE
import upctforma.ContentUnit
import org.xtext.generator.config.ConfigGenerator

class Output {
	private IFileSystemAccess2 fsa;
	private String strIndex = '';
	private String strGameLogin = '';
	private String progresoObj = '';
	private String fileanimationcSS='';
	private String fileanimation='';
	private String strTeacher = '';
	private String strMap = '';
	private String selectusernametextual = '';
	private ContentUnit cu;
	private String platformversion;
	private int typevalue = INTEROPERABILITY_VALUE;
	
	new(IFileSystemAccess2 fsa, ContentUnit cu, String platformversion){
		this.fsa = fsa;
		this.cu = cu;
		typevalue = cu.type.value;
		this.platformversion = platformversion;
	}
	
	def addStrSelectusernametextual(String str){
		selectusernametextual += str;
	}
	def addStrIndex(String str){
		strIndex += str;
	}

	def addStrGameLogin(String str) {
	    strGameLogin += str;
	}

	def addStrElement(String str){
		if (typevalue != GAMIFICATION_VALUE)
			addStrIndex(str);			
	}
	def getStrIndex(){
		return strIndex;
	}
	
	def addStrProgesoObj(String str){
        progresoObj += str;
    }
	
	def addStrFileAnimationCSS(String str){
		fileanimationcSS += str;
	}
	def addStrFileAnimation(String str){
		fileanimation += str;
	}
	def addStrTeacher(String str){
		strTeacher += str;
	}	
	def addStrMap(String str){
		strMap += str;
	}	
	
	def addScripts(){
		'''«IF  (!fileanimation.isEmpty())»
				<script src="animation.js"></script>
			«ENDIF»
		'''
		
	}

	def writeOutput(){

		if (!strMap.isEmpty()){
			var siteMapPage = '''
			«IF  (typevalue == INTEROPERABILITY_VALUE)»	
				<?php
					require_once "globalConfig.php";
			
					$config = GlobalConfig::getInstance();
					$config->getSessionInternalCall();
				?>
			«ENDIF»	
			<!DOCTYPE html>
			<html lang="«cu.language.toString.toLowerCase»">
			<head>
			    <meta charset="UTF-8">
			    <meta http-equiv="X-UA-Compatible" content="IE=edge">
			    <meta name="viewport" content="width=device-width, initial-scale=1.0">
			    <title>«cu.name»</title>
			    <link rel="stylesheet" href="«ConfigGenerator.INSTANCE.CDNUrl»/generator/content/«ConfigGenerator.INSTANCE.URLVersion»/css/styles«cu.theme».min.css" media="screen" charset="utf-8">
			    <link rel="preconnect" href="https://fonts.googleapis.com">
			    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
			    <link href="https://fonts.googleapis.com/css2?family=Encode+Sans:wght@100;400;600;700;900&family=Lato:ital,wght@0,100;0,300;0,400;0,700;0,900;1,100;1,300;1,400;1,700;1,900&family=Roboto:ital,wght@0,100;0,300;0,400;0,500;0,700;0,900;1,100;1,300;1,400;1,500;1,700;1,900&family=Titillium+Web:ital,wght@0,200;0,300;0,400;0,600;0,700;0,900;1,200;1,300;1,400;1,600;1,700&display=swap" rel="stylesheet">
			    <script src="https://kit.fontawesome.com/tokenFontawesome.js" crossorigin="anonymous"></script>
			    «IF (cu.email.contains('upct'))»
			    	<link rel="icon" href="«ConfigGenerator.INSTANCE.CDNUrl»/img/faviconUPCT.png" type="image/png">
			    «ELSE»
			    	<link rel="icon" href="«ConfigGenerator.INSTANCE.CDNUrl»/img/favicon.png" type="image/png">
			    «ENDIF»						    			    			    
			</head>
			<body class="sitemap">			
			  <header>
				<div id="navbar-main">
			      <div class="navbar navbar-expand-lg navbar-dark bg-dark" aria-owns="nav-options">
				  «IF (cu.email.contains('upct'))»
			 		<a class="navbar-brand" href="https://www.upct.es/" target="_blank">
			      		<img src="«ConfigGenerator.INSTANCE.CDNUrl»/img/upct.png" class="img-responsive" alt="Logo UPCT" />
			    	</a>
			      «ELSE»
			    	<a class="navbar-brand" href="https://indie.upct.es/" target="_blank">
			    		<img src="«ConfigGenerator.INSTANCE.CDNUrl»/img/logoblanco.png" class="img-responsive" alt="Logo INDIe" />
			    	</a>
			      «ENDIF»
	                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#nav-options" aria-controls="nav-options" aria-expanded="false" aria-label="Toggle navigation">
	                    <span class="fa fa-bars"></span>
	                </button>
			      </div>	               
	 	    	</div>
	 	    	<div>
	 	    		<h1 class="mt-4 text-center"><i class="fas fa-sitemap fa-2x" aria-hidden="true"></i></h1>
	 	    	   	<h1 class="text-center"><strong>«cu.name»</strong></h1>
	 	    	</div>		    	 	    	
           </header>
           <main>
           	<ul class="container">
           		«strMap»
           	</ul>
           	</main>              
           		
           		<footer id="footerwrap">
           				<div class="container-fluid">
           					<div class="d-flex flex-column flex-lg-row justify-content-lg-around">							
           						<div class="col-12 col-lg-3  p-2 d-flex justify-content-center align-items-center">
	           						«IF cu.license.value == 0»
	           							<p class="text-white"><img src="«ConfigGenerator.INSTANCE.CDNUrl»/img/copyright.png" class="img-responsive" alt="Copyright" /> All rights reserved. </p>
	           						 «ELSEIF cu.license.value == 1»
	           						    <p class="text-white"><a href="https://creativecommons.org/licenses/by/4.0/" target="_blank"><img src="«ConfigGenerator.INSTANCE.CDNUrl»/img/by.png" class="img-responsive"  alt="License BY" /></a> </p>
	           						 «ELSEIF cu.license.value == 2»
	           						    <p class="text-white"><a href="https://creativecommons.org/licenses/by-sa/4.0/" target="_blank"><img src="«ConfigGenerator.INSTANCE.CDNUrl»/img/bysa.png" class="img-responsive" alt="License BY-SA" /></a> </p>
	           						 «ELSEIF cu.license.value == 3»
	           						    <p class="text-white"><a  href="https://creativecommons.org/licenses/by-nd/4.0/" target="_blank"><img src="«ConfigGenerator.INSTANCE.CDNUrl»/img/bynd.png" class="img-responsive"  alt="License BY-ND" /></a> </p>
	           						 «ELSEIF cu.license.value == 4»
	           						    <p class="text-white"><a href="https://creativecommons.org/licenses/by-nc/4.0/" target="_blank"><img src="«ConfigGenerator.INSTANCE.CDNUrl»/img/bync.png" class="img-responsive" alt="License BY-NC" /></a> </p>
	           						 «ELSEIF cu.license.value == 5»
	           							<p class="text-white"><a href="https://creativecommons.org/licenses/by-nc-sa/4.0/" target="_blank"><img src="«ConfigGenerator.INSTANCE.CDNUrl»/img/byncsa.png" class="img-responsive"  alt="License BY-NC-SA" /></a></p>
	           						 «ELSEIF cu.license.value == 6»
	           						    <p class="text-white"><a href="https://creativecommons.org/licenses/by-nc-nd/4.0/" target="_blank"><img src="«ConfigGenerator.INSTANCE.CDNUrl»/img/byncnd.png" class="img-responsive" alt="License BY-NC-ND" /></a> </p>
	           						 «ENDIF»
          															
           						</div>
           						<div class="col-12 col-lg-3  p-2 d-flex justify-content-center align-items-center">
           							<p class="text-white" >«cu.author» <br> «cu.institution»</p>			
           						</div>
           						<div  class="col-12 col-lg-3  p-2 d-flex justify-content-center align-items-center">
           							<p >«platformversion»</p>
           						</div>
           						<div class="col-12 col-lg-3  p-2 d-flex justify-content-center align-items-center">
           							«IF (cu.email.contains('upct'))»
           								<p class="text-white"><a href="https://cpcd.upct.es" target="_blank"><img src="«ConfigGenerator.INSTANCE.CDNUrl»/img/cpcd_blanco.png" class="img-responsive"  alt="Logo CPCD" /></a> </p>
           							«ELSE»
           								<p class="text-white" >Erasmus + KA201 projects: <br> 2018-1-ES01-KA201-050924 <br> 2020-1-ES01-KA201-083177</p>
           							«ENDIF»
           						</div>
           					</div>
           					<br>	
           				</div>
           			</footer>	      	
           	  </body>
           	 </html>
           '''		
           	fsa.generateFile('''sitemap.«if (typevalue == INTEROPERABILITY_VALUE) "php" else "html"»''',siteMapPage);
		}
		
		if (typevalue == OPEN_VALUE)
		  fsa.generateFile("index.html",strIndex)
		else if (typevalue == GAMIFICATION_VALUE)
		{
			fsa.generateFile("index.html",strGameLogin)
			fsa.generateFile("game.html", strIndex)
			fsa.generateFile("teacher/index.html",strTeacher)
		} else {
            fsa.generateFile("index.php",strIndex)
		}

		if (typevalue != GAMIFICATION_VALUE){
			fsa.generateFile("animation.css",fileanimationcSS);

			if (!fileanimation.isEmpty()){
				fsa.generateFile("animation.js",fileanimation);
			}
		}
		
		if (!progresoObj.isEmpty() && typevalue === INTEROPERABILITY_VALUE){
		    fsa.generateFile("progreso_obj.json",progresoObj);
        }
   	}
}


	