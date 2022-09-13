package org.xtext.generator

import upctforma.ContentUnit
import static upctforma.ContentUnitType.INTEROPERABILITY_VALUE
import org.xtext.generator.config.ConfigGenerator

abstract class LearningUnit {
	protected ContentUnit cu = null;
	protected String platformversion = "";
	
	
	new(ContentUnit cu, String platformversion){
		this.cu = cu;	
		
		this.platformversion = platformversion;
	}
	
	def generateSharedLibraries(String contentUnitPath) {
		'''
        <script src="«ConfigGenerator.INSTANCE.CDNUrl»/generator/content/«ConfigGenerator.INSTANCE.URLVersion»/js/public_progreso_mapa.min.js"></script>
	    '''
    }
    
    def close(){
    	'''
		   </body>
	  		</html>
		'''
    }
    
	def getHeader(){
		'''
		<!DOCTYPE html>
		<html lang="«cu.language.toString.toLowerCase»">
		  <head>
	        <meta name="viewport" content="width=device-width, initial-scale=1">
		    <meta charset="utf-8">
		    <title>«cu.name»</title>
		    <!-- Bootstrap -->
    		<link href="https://cdn.jsdelivr.net/gh/gitbrent/bootstrap4-toggle@3.6.1/css/bootstrap4-toggle.min.css" rel="stylesheet">

		    <link href="//amp.azure.net/libs/amp/latest/skins/amp-default/azuremediaplayer.min.css" rel="stylesheet">
		    <!-- Base -->
			<link rel="stylesheet" type="text/css" href="animation.css">

			<link rel="stylesheet" type="text/css" href="«ConfigGenerator.INSTANCE.CDNUrl»/generator/content/«ConfigGenerator.INSTANCE.URLVersion»/css/ColorPicker.min.css" />
			<link rel="stylesheet" type="text/css" href="«ConfigGenerator.INSTANCE.CDNUrl»/generator/content/«ConfigGenerator.INSTANCE.URLVersion»/css/notes.min.css" />
			
			<link rel="stylesheet" href="«ConfigGenerator.INSTANCE.CDNUrl»/generator/content/«ConfigGenerator.INSTANCE.URLVersion»/css/prism.min.css">
			
			<link rel="preconnect" href="https://fonts.googleapis.com">
			<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
			<link href="https://fonts.googleapis.com/css2?family=Encode+Sans:wght@100;400;600;700;900&family=Lato:ital,wght@0,100;0,300;0,400;0,700;0,900;1,100;1,300;1,400;1,700;1,900&family=Roboto:ital,wght@0,100;0,300;0,400;0,500;0,700;0,900;1,100;1,300;1,400;1,500;1,700;1,900&family=Titillium+Web:ital,wght@0,200;0,300;0,400;0,600;0,700;0,900;1,200;1,300;1,400;1,600;1,700&display=swap" rel="stylesheet">
		'''	
	}
	def header(Output output){
		output.addStrIndex(this.getHeader.toString);		
	}
	
	def void setHeader1(Output output)
	
	def void setHeader2(Output output)
	
	def writefileindexp3(){
		var temporalp3v2 =
		'''
		 <!-- Modal -->
		  <div class="modal fade" id="myModal" role="dialog">
		    <div class="modal-dialog">
		    
		      <!-- Modal content-->
		      <div class="modal-content">
		        <div class="modal-header">
		          <button type="button" class="close" data-dismiss="modal">&times;</button>
		          <h2 class="modal-title">UPCTforma</h2>
		        </div>
		        <div class="modal-body">
		          <p id="bodymymodal"></p>
		        </div>
		        <div class="modal-footer">
		          <button type="button" class="btn btn-default text-white" data-dismiss="modal">Close</button>
		        </div>
		      </div>
		      
		    </div>
		  </div>
		  <div>
		    <div class="container">
		      <div class="row">
		        <div class="col-md-12 righted">
		          <a href="#body" class="sctop" aria-label="«i18n.getMessage("TopPage")»"><i class="far fa-3x fa-arrow-alt-circle-up visto"></i></a>
		        </div>
		      </div>
		    </div>
		  </div>
         </main>
         <footer id="footerwrap">
		   <div class="container-fluid">
			 <div class="d-flex flex-column flex-lg-row justify-content-lg-around">
			   <div class="col-12 col-lg-3 p-2 d-flex justify-content-center align-items-center">
						''';
					
						switch (cu.license.value){
					  			case 0:{
					  				temporalp3v2 += '''<p class="text-white"><img src="«ConfigGenerator.INSTANCE.CDNUrl»/img/copyright.png" class="img-responsive" alt="Copyright" /> All rights reserved. </p>''';
					  			}
					  			case 1:{
					  				temporalp3v2 += '''<p class="text-white"><a href="https://creativecommons.org/licenses/by/4.0/" target="_blank"><img src="«ConfigGenerator.INSTANCE.CDNUrl»/img/by.png" class="img-responsive"  alt="License BY" /></a> </p>''';
					  			}
					  			case 2:{
					  				temporalp3v2 += '''<p class="text-white"><a href="https://creativecommons.org/licenses/by-sa/4.0/" target="_blank"><img src="«ConfigGenerator.INSTANCE.CDNUrl»/img/bysa.png" class="img-responsive" alt="License BY-SA" /></a> </p>''';
					  			}
					  			case 3:{
					  				temporalp3v2 += '''<p class="text-white"><a  href="https://creativecommons.org/licenses/by-nd/4.0/" target="_blank"><img src="«ConfigGenerator.INSTANCE.CDNUrl»/img/bynd.png" class="img-responsive"  alt="License BY-ND" /></a> </p>''';
					  			}
					  			case 4:{
					  				temporalp3v2 += '''<p class="text-white"><a href="https://creativecommons.org/licenses/by-nc/4.0/" target="_blank"><img src="«ConfigGenerator.INSTANCE.CDNUrl»/img/bync.png" class="img-responsive" alt="License BY-NC" /></a> </p>''';
					  			}
					  			case 5:{
					  				temporalp3v2 += '''<p class="text-white"><a href="https://creativecommons.org/licenses/by-nc-sa/4.0/" target="_blank"><img src="«ConfigGenerator.INSTANCE.CDNUrl»/img/byncsa.png" class="img-responsive"  alt="License BY-NC-SA" /></a></p>''';
					  			}
					  			case 6:{
					  				temporalp3v2 += '''<p class="text-white"><a href="https://creativecommons.org/licenses/by-nc-nd/4.0/" target="_blank"><img src="«ConfigGenerator.INSTANCE.CDNUrl»/img/byncnd.png" class="img-responsive" alt="License BY-NC-ND" /></a> </p>''';
					  			}
					  		}
					
						temporalp3v2 +=		
						'''											
							</div>
							<div class="col-12 col-lg-3 p-2 d-flex justify-content-center align-items-center">
								<p class="text-white" >«cu.author» <br> «cu.institution»</p>			
							</div>
							<div  class="col-12 col-lg-3 p-2 d-flex flex-column justify-content-center align-items-center">
								<p >«platformversion»</p>
								<p><a class="item-link text-white" href="sitemap.«if (cu.type.value == INTEROPERABILITY_VALUE) "php" else "html"»" >«i18n.getMessage("sitemap")»</a></p>
							</div>
							<div class="col-12 col-lg-3 p-2 d-flex justify-content-center align-items-center">
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
                    «IF (cu.type.value == INTEROPERABILITY_VALUE)»
		        	 	<div class="modal" id="sharedModal" tabindex="-1" aria-labelledby="sharedModalLabel" aria-hidden="true">
		        		    <div class="modal-dialog"></div>
		        		</div>		        			        
		        	«ENDIF»		        		          	
				    <script src="https://code.jquery.com/jquery-3.5.1.min.js" integrity="sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0=" crossorigin="anonymous"></script>
			    	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
			    	<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.min.js" integrity="sha384-+YQ4JLhjyBLPDQt//I+STsc9iw4uQqACwlvpslubQzn4u2UU2UFM80nGisd026JF" crossorigin="anonymous"></script>       
			    	<script src="https://cdn.jsdelivr.net/gh/gitbrent/bootstrap4-toggle@3.6.1/js/bootstrap4-toggle.min.js"></script>			    	    
			       	<script src="https://code.jquery.com/ui/1.11.3/jquery-ui.min.js"></script>
			    	<script src="«ConfigGenerator.INSTANCE.CDNUrl»/jquery-ui-touch-punch-master/jquery.ui.touch-punch.min.js"></script>    
                    <script src="https://unpkg.com/i18next@21.6.0/dist/umd/i18next.min.js"></script>
                    <script src="https://unpkg.com/annyang@2.6.1/dist/annyang.min.js"></script>
                    <script src="«ConfigGenerator.INSTANCE.CDNUrl»/generator/content/«ConfigGenerator.INSTANCE.URLVersion»/js/libraries.min.js"></script>
                    <script src="https://cdn.jsdelivr.net/npm/prismjs@1.27.0/prism.min.js" data-manual></script>
                    <script src="https://cdn.jsdelivr.net/npm/prismjs@1.27.0/plugins/autoloader/prism-autoloader.min.js"></script>
                    <script src="https://cdn.jsdelivr.net/npm/prismjs@1.27.0/plugins/unescaped-markup/prism-unescaped-markup.min.js"></script>
                    <script src="https://cdn.jsdelivr.net/npm/prismjs@1.27.0/plugins/line-numbers/prism-line-numbers.min.js"></script>
					<script>
					      $(document).on('click', 'span.highlighted', function(){
					        $(this).popover({
					          html: true,
					          placement: 'top',
					          trigger: 'manual'
					        });
					        $(this).popover('toggle');
					      });
					</script> 			
		    ''';
	    	return temporalp3v2;
		 				
	}
}