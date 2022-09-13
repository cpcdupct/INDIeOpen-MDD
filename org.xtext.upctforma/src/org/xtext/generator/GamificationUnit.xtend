package org.xtext.generator

import upctforma.ContentUnit
import org.xtext.generator.helpers.MenuButtonHelper
import org.xtext.generator.helpers.SpeechToActionHelper
import org.xtext.generator.config.ConfigGenerator

class GamificationUnit extends LearningUnit{
	new(ContentUnit cu, String platformversion){
		super(cu,platformversion);
	}

	def writeFileIndexP2c1(){			
		'''
            <div class="modal fade" id="response-modal" tabindex="-1" role="dialog"
                aria-labelledby="response-modal" aria-hidden="true">
             <div class="modal-dialog modal-lg modal-dialog-centered" role="document">
               <div class="modal-content">
                 <div class="modal-body mb-0 p-0">
                   <img id="response-image" src="" class="img-fluid"></img>
                 </div>
               </div>
             </div>
            </div>
            
            <div class="modal fade" aria-modal="true" aria-hidden="true" id="gamification-message-modal" role="dialog" tabindex="-1" aria-labelled-by="gamification-message-title">
                <div class="modal-dialog" role="document">
                
                  <!-- Modal content-->
                  <div class="modal-content">
                    <div class="modal-header">
                      <h2 class="modal-title" id="gamification-message-title"></h2>
                    </div>
                    <div class="modal-body">
                        <img class="modal-logo-img" src="" alt="" />
                    </div>
                    <div class="modal-footer">
                      <button type="button" class="btn btn-block btn-success text-white" data-dismiss="modal">«i18n.getMessage("TextClose")»</button>
                    </div>
                  </div>
                  
                </div>
            </div>
        '''
	}
	def writeFileIndexP2c2(){			
		'''
			<div id="student-list-div"></div>
		'''	
	}
	
	def writeFileIndexP2b(){			
		'''			  		    
		    <div id="showcodgane" style="font-size: 46px;text-align: center;border-bottom: 3px solid #28527a;"></div>
		'''	
	}
	def getHeader3Gamification(){
	   '''
	    	<!--Progreso-->
	    	<link rel="stylesheet" href="«ConfigGenerator.INSTANCE.CDNUrl»/generator/content/«ConfigGenerator.INSTANCE.URLVersion»/css/stylesGamification.min.css" media="screen">
            « IF cu.email.contains('upct') »
                <link rel="icon" href="«ConfigGenerator.INSTANCE.CDNUrl»/img/faviconUPCT.png" type="image/png">
            « ELSE »
                <link rel="icon" href="«ConfigGenerator.INSTANCE.CDNUrl»/img/favicon.png" type="image/png">
            «ENDIF»
            <script src="https://kit.fontawesome.com/tokenFontAwesome.js" crossorigin="anonymous"></script>
            <script id="MathJax-script" async src="https://cdn.jsdelivr.net/npm/mathjax@3/es5/tex-mml-chtml.js"></script>
            <script>
            MathJax = { tex: {
                        inlineMath: [["$","$"],["\\(","\\)"]]}
                      };
            </script>
            <script src = "https://cdn.socket.io/4.4.1/socket.io.min.js"></script>
            </head>
            <body id="body" class="gamification" data-spy="scroll" data-offset="50" data-target="#navbar-main" data-unit="«cu.idunidad»">
                <header>
	                <div id="navbar-main">
		                <div class="navbar navbar-expand-sm navbar-dark bg-dark" aria-owns="nav-options">
			                « IF cu.email.contains('upct') »
			                <a class="navbar-brand" href="https://www.upct.es/" target="_blank">
			                  <img src="«ConfigGenerator.INSTANCE.CDNUrl»/img/upct.png" class="img-responsive" alt="Logo UPCT" />
			                </a>
			                « ELSE »
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
			              <li id="speech">
                            «MenuButtonHelper.generateVoiceControlHtml»
                          </li>
			            </ul>
			            «MenuButtonHelper.generateVoiceControlNotificationsHtml»
	        	  	</div>
	        	  	<div id="cabecera">
	        	  	     <h1 class="titulo text-white text-center"><strong>UPCTPlay</strong></h1>
	        	  	</div>                		    	        	  	
	        </header>
        '''.toString()
	}
	
	def addModalConfirmacion(){
		'''
		    <div class="modal fade" tabindex="-1" role="dialog" aria-labelledby="modalConfirmacion" aria-hidden="true" id="modalConfirmacion">
		      <div class="modal-dialog modal-sm">
		        <div class="modal-content">
		          <div class="modal-header">
		            <h4 class="modal-title" id="myModalLabel">Cierre y resultados</h4>
		            <button type="button" class="close" data-dismiss="modal" aria-label="«i18n.getMessage("TextClose")»"><span aria-hidden="true">&times;</span></button>
		           
		          </div>
		          <div class="modal-body">
		            <p> «i18n.getMessage("GamificationModalFinishWarning")»</p>
		          </div>
		          <div class="modal-footer">
		            <button type="button" class="btn btn-primary" id="modal-btn-si">«i18n.getMessage("GamificationModalContinue")»</button>
		            <button type="button" class="btn btn-primary" id="modal-btn-no">«i18n.getMessage("GamificationModalCancel")»</button>
		          </div>
		        </div>
		      </div>
		    </div>
		'''
	}

    def addUsernameForm(){
        '''
        <form id="select-username-form" action="game.html">
          <section class="bgwhitecab2">
            <div class="container">
              <div class="row">
                <div class="col-md-12 interview">
                    <h2 id="heading-select-username">
                        <i class="fas fa-info-circle"></i>&nbsp;
                        <label for="input-username">«i18n.getMessage("GamificationWriteUsernameLabel")»</label>
                        «SpeechToActionHelper.generateButtonHtml(cu.type.value, "login")»
                    </h2>
                </div>
              </div>
              <div class="form-group row">
                <div class="col-12 tta-message" aria-hidden="false" aria-atomic="true" aria-live="polite" id="tta-message-login" aria-relevant="all"></div>
                <input type="text" class="form-control mx-3 mb-4" id="input-username">
              </div>
              <input id="btn-username" type="submit" class="btn btn-block btn-success" value="«i18n.getMessage("GamificationWriteUsernameAccept")»"/>
            </div>
          </section>
        </form>
        '''
    }

	override setHeader1(Output output){
		super.header(output);	
		output.addStrIndex(getHeader3Gamification());
		output.addStrTeacher(output.strIndex);

		output.addStrIndex(writeFileIndexP2c1().toString);
		output.addStrTeacher(writeFileIndexP2c2().toString);
		
		output.addStrIndex(writeFileIndexP2b().toString);
		output.addStrTeacher(writeFileIndexP2b().toString);
		
		output.addStrGameLogin(output.strIndex);
		output.addStrGameLogin(addUsernameForm.toString)

	}
	override setHeader2(Output output){
		output.addStrTeacher(addModalConfirmacion().toString);
		output.addStrIndex(super.writefileindexp3().toString);
		output.addStrTeacher(super.writefileindexp3().toString);
		output.addStrGameLogin(super.writefileindexp3().toString);
		
		output.addStrIndex(generateSharedLibraries("../contentunit").toString);
		output.addStrTeacher(generateSharedLibraries("../../contentunit").toString);
		output.addStrGameLogin(generateSharedLibraries("../../contentunit").toString);
		
		output.addStrIndex(output.addScripts().toString);
		output.addStrTeacher(output.addScripts().toString);

        output.addStrIndex('''<script src="«ConfigGenerator.INSTANCE.CDNUrl»/generator/content/«ConfigGenerator.INSTANCE.URLVersion»/js/gamification-student.min.js"></script>''');
		output.addStrGameLogin('''<script src="«ConfigGenerator.INSTANCE.CDNUrl»/generator/content/«ConfigGenerator.INSTANCE.URLVersion»/js/gamification-login.min.js"></script>''');
		output.addStrTeacher('''<script src="«ConfigGenerator.INSTANCE.CDNUrl»/generator/content/«ConfigGenerator.INSTANCE.URLVersion»/js/gamification-teacher.min.js"></script>''');

        output.addStrIndex(super.close().toString);
        output.addStrTeacher(super.close().toString);
        output.addStrGameLogin(super.close().toString);
	}
}