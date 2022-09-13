package org.xtext.generator

import upctforma.Widget
import upctforma.ContentElement
import java.util.List
import java.util.ArrayList
import upctforma.RecordValue
import upctforma.ListValue
import upctforma.Text
import upctforma.Image

class WidgetAnimationInOut  implements ContentGeneration<Widget>{
	
	 
	def generateAnimation0(Output output, String idgen){
		output.addStrFileAnimation( '''
			$(document).ready(function() {
					initializeapp«idgen»();	
			});
		''');
	}
	def generateAnimation1(Output output, Widget wg, List<ContentElement> args, int j, String idgen, Integer tipo){
		output.addStrFileAnimation( '''
			var canvasapp«idgen»;
			var stageapp«idgen»;
			var cargadorapp«idgen»;
			var contenedorImagenesapp«idgen»;
			var fondoapp«idgen»;
			var imagenrcapp«idgen»;
			var imagenrcgapp«idgen»;
			var rutaPieza«idgen»;
			var textoPiezasapp«idgen»;
			var enablePiezasapp«idgen»;
			var cambiadoapp«idgen»;
			var moverPiezasapp«idgen»;
			var piezasapp«idgen»;
	
			function initializeapp«idgen»() {
				this.rutaPieza«idgen» =  [ 
		''');

		var RecordValue tempwg1;
		if (tipo==1){
			tempwg1= wg.widgetelements.get(0) as RecordValue;
		}else{
			val arge = args.get(j) as Widget;			
			tempwg1= arge.widgetelements.get(0) as RecordValue;
		}	
			
		val tempwg2= tempwg1.recordvalues.get(2).fieldvalue as ListValue;
		val tempwg3= tempwg1.recordvalues.get(0).fieldvalue as Text;
		val tempwg4= tempwg1.recordvalues.get(1).fieldvalue as Image;
		val tempwg3h= tempwg1.recordvalues.get(3).fieldvalue as Text;
		for (var i = 0; i < tempwg2.listvalues.length; i++){
			val tempwg5 = tempwg2.listvalues.get(i) as Image;
			output.addStrFileAnimation( '''
				"«tempwg5.url»"
			''');	
			if (i != (tempwg2.listvalues.length-1)){
				output.addStrFileAnimation( ''',''');
			}else{
				output.addStrFileAnimation( '''];''');
			}	
		}
		output.addStrFileAnimation( '''
			this.enablePiezasapp«idgen» = [
		'''	);
		for (var i = 0; i < tempwg2.listvalues.length; i++){
			val tempwg5 = tempwg2.listvalues.get(i) as Image;
			if (i < ((tempwg2.listvalues.length-1)/2)-1){
				output.addStrFileAnimation( '''0,''');
			}else if (i == ((tempwg2.listvalues.length-1)/2)){
				output.addStrFileAnimation( '''0''');
			}		
		}	
		output.addStrFileAnimation( '''
			];
	
			this.moverPiezasapp«idgen» = [1, 0, 0, 0, 0];
			this.piezasapp«idgen» = [null, null, null, null, null];
			var self = this;
			this.canvasapp«idgen» = document.createElement("canvas");
			this.canvasapp«idgen».width = «tempwg3.html»;
			this.canvasapp«idgen».height = «tempwg3h.html»;
			var contenedorapp«idgen» = document.getElementById("«idgen»");
			contenedorapp«idgen».appendChild(this.canvasapp«idgen»);
		
			this.stageapp«idgen» = new createjs.Stage(this.canvasapp«idgen»);
			this.stageapp«idgen».enableMouseOver(20);
			this.cargadorapp«idgen» = new Cargador«idgen»();
		
			this.cargadorapp«idgen».onComplete = function() {
				self.assetsCargadosapp«idgen»();
			}
			this.cargadorapp«idgen».loadImagenes([
		''');	
		for (var i = 0; i < tempwg2.listvalues.length; i++){
			output.addStrFileAnimation( '''
				this.rutaPieza«idgen»[«i»]
			''');
			if (i != (tempwg2.listvalues.length-1)){
				output.addStrFileAnimation( ''',''');
			}else{
				output.addStrFileAnimation( ''']);''');
			}	
		}
		output.addStrFileAnimation( '''
			};
			function assetsCargadosapp«idgen»() {
				this.ejecutaAppapp«idgen»();
			}
			
			function ejecutaAppapp«idgen»() {
			
				var contenedorapp«idgen» = new ContenedorImagenes«idgen»();
				this.stageapp«idgen».addChild(contenedorapp«idgen»);
				contenedorImagenesapp«idgen» = contenedorapp«idgen»;
				contenedorImagenesapp«idgen».x = 0;
				contenedorImagenesapp«idgen».y = 0;
			
				var self = this;
				this.tickapp«idgen»();
			};
			
			function tickapp«idgen»(e) {
				this.stageapp«idgen».update();
			};
			
			var completo = [];
	
			function Recargarapp«idgen»(vid) {	
				this.enablePiezasapp«idgen»[0] = vid + 1;
				if (vid == «((tempwg2.listvalues.length-1)/2)»){
					setObjetivoCompleto("objetivo«idgen»","«wg.name»", "AnimationInOut");
				}
				
				this.rutaPieza«idgen»[vid] = this.rutaPieza«idgen»[vid+«(((tempwg2.listvalues.length-1)/2)).intValue()»];
				
				contenedorImagenesapp«idgen».deleteImagenCargar();
			};
		''');
	}
	def generateAnimation2(Output output, String idgen){
		output.addStrFileAnimation( '''
			(function(scope){
				function Cargador«idgen»(){
					this.initialize();
				}
				
				//var variable = Cargador«idgen».prototype;
				var cargadas  = Cargador«idgen».prototype;
				var totales = Cargador«idgen».prototype;
				var onComplete  = Cargador«idgen».prototype;
			
				Cargador«idgen».prototype.initialize = function(){
					//console.log("cargador generado");	
				};
			
				Cargador«idgen».prototype.loadImagenes = function(lista){
					
					this.cargadas = 0;
					this.totales = lista.length;
					for (i=0;i<this.totales;i++){
						this.cargaImagen(lista[i]);
					}
				}
			
				Cargador«idgen».prototype.cargaImagen = function(ruta){
					var self = this;
					var image = new Image();
					image.crossOrigin = "Anonymous";
					this[ruta] = image;
					
					image.onload = function(e){
						self.imagenCargada();
					}
					image.src = image.url = ruta;
			
				}
			
				Cargador«idgen».prototype.imagenCargada = function(){
					this.cargadas ++;
					if (this.cargadas == this.totales){
						if (this.onComplete){
							this.onComplete();
						}else{
							//console.log("onComplete no definida");
						}
			
					}
			
				}
				scope.Cargador«idgen» = Cargador«idgen»;
			}(window));
		''');
	}
	def generateAnimation3(Output output, Widget wg, List<ContentElement> args, int j, String idgen, Integer tipo){
		var RecordValue tempwg1;
		if (tipo==1){
			tempwg1= wg.widgetelements.get(0) as RecordValue;
		}else{
			val arge = args.get(j) as Widget;			
			tempwg1= arge.widgetelements.get(0) as RecordValue;
		}
			
		val tempwg2= tempwg1.recordvalues.get(2).fieldvalue as ListValue;
		
		output.addStrFileAnimation( '''	
			(function(scope) {
				function ContenedorImagenes«idgen»() {
					this.initialize();
				}
			
				ContenedorImagenes«idgen».prototype = new createjs.Container()
				ContenedorImagenes«idgen».prototype.Container_init = ContenedorImagenes«idgen».prototype.initialize;
			
				var filas = ContenedorImagenes«idgen».prototype;
				var pasos = ContenedorImagenes«idgen».prototype;
				var initY = ContenedorImagenes«idgen».prototype;
				var cargado = ContenedorImagenes«idgen».prototype;
			
				var vX = ContenedorImagenes«idgen».prototype;
				var vY = ContenedorImagenes«idgen».prototype;
			
				ContenedorImagenes«idgen».prototype.initialize = function() {
					this.Container_init();
			
					this.vX = 6;
					this.vY = 70;
					this.velocity = {
						x: 0,
						y: 0
					};
					this.init();
				}
			
				ContenedorImagenes«idgen».prototype.init = function() {
					var self = this;
					this.cargado = false;
			
					//console.log("Inicializando Contenedor Imagenes");
			
					this.x = 0;
					this.y = 0;
					this.initY = 60;
			
					this.snapToPixel = true;
			
					this.cargarPiezas();
				}
			
				ContenedorImagenes«idgen».prototype.cargarPiezas = function(e) {
					var bmp1 = new MostrarImagen«idgen»(0, cargadorapp«idgen»[rutaPieza«idgen»[0]], 0, 0, 0);
					this.addChild(bmp1);
					var pulsado = 0;
					if (enablePiezasapp«idgen»[0]>0){
						pulsado = enablePiezasapp«idgen»[0] -1;
						for (i=1; i <=«(tempwg2.listvalues.length-1)/2»; i++){
								if (i!=pulsado){
									var bmp1 = new MostrarImagen«idgen»(i, cargadorapp«idgen»[rutaPieza«idgen»[i]], 0, 0);
									this.addChild(bmp1);
								}			
						}
						var bmp1 = new MostrarImagen«idgen»(pulsado, cargadorapp«idgen»[rutaPieza«idgen»[pulsado]], 0, 0);
						this.addChild(bmp1);
					}else{
						for (i=1; i <=«(tempwg2.listvalues.length-1)/2»; i++){			
							var bmp1 = new MostrarImagen«idgen»(i, cargadorapp«idgen»[rutaPieza«idgen»[i]], 0, 0);
							this.addChild(bmp1);
						}
					}
				};
			
				ContenedorImagenes«idgen».prototype.onTick = function() {}
			
				ContenedorImagenes«idgen».prototype.deleteImagenCargar = function() {
					this.removeAllChildren();
					this.cargarPiezas();
				}
			

				scope.ContenedorImagenes«idgen» = ContenedorImagenes«idgen»;
			

			}(window));
		''');
	}
	def generateAnimation4(Output output, Widget wg, List<ContentElement> args, int j, String idgen, Integer tipo){
		var RecordValue tempwg1;
		if (tipo==1){
			tempwg1= wg.widgetelements.get(0) as RecordValue;
		}else{
			val arge = args.get(j) as Widget;			
			tempwg1= arge.widgetelements.get(0) as RecordValue;
		}
		
		val tempwg2= tempwg1.recordvalues.get(2).fieldvalue as ListValue;
		
		output.addStrFileAnimation('''	
			(function(scope){
				//constructor de la clase
				function MostrarImagen«idgen»(id,image, posX, posY){
					this.initialize(id,image, posX, posY);
				}
			
				MostrarImagen«idgen».prototype = new createjs.Bitmap()
				MostrarImagen«idgen».prototype.Bitmap_init = MostrarImagen«idgen».prototype.initialize;
			
				var ancho = MostrarImagen«idgen».prototype;
				var id = MostrarImagen«idgen».prototype;
				var _evento = MostrarImagen«idgen».prototype;
			
				MostrarImagen«idgen».prototype.initialize = function (id,image, posX, posY){
					this.ancho = 6;
					var self = this;
					this.Bitmap_init(image);
					this.x = posX;
					this.y = posY;
					this.id = id;
					stageapp«idgen».addChild(this);
			
					//ejecuto el resto de valores
					this.snapToPixel = true;
					this.velocity = {x:0,y:-15};
					this.addEventListener("mousedown", function(e){self.handleMouseDown(e);});
			
					this.addEventListener("mouseover", function(e){self.handleMouseOver(e);});
					this.addEventListener("mouseout", function(e){self.handleMouseOut(e);});
			
					tickapp«idgen»();
				}
			
				MostrarImagen«idgen».prototype.handleMouseDown = function (e){
					if (
			''');
			for (var i = 0; i < tempwg2.listvalues.length; i++){
				if (i <= ((tempwg2.listvalues.length-1)/2)-1){
					output.addStrFileAnimation( '''(this.id == «i+1»)''');if (i != ((tempwg2.listvalues.length-1)/2)-1){output.addStrFileAnimation('''||''');}
				}else if (i == tempwg2.listvalues.length-1){
					output.addStrFileAnimation( '''){''');
				}		
			}						
			output.addStrFileAnimation('''			
						Recargarapp«idgen»(this.id);
					}
				}
			
				MostrarImagen«idgen».prototype.handleMouseOver = function (e){
					if (
			''');
			for (var i = 0; i < tempwg2.listvalues.length; i++){
				if (i <= ((tempwg2.listvalues.length-1)/2)-1){
					output.addStrFileAnimation('''(this.id == «i+1»)''');if (i != ((tempwg2.listvalues.length-1)/2)-1){output.addStrFileAnimation('''||''');}
				}else if (i == tempwg2.listvalues.length-1){
					output.addStrFileAnimation('''){''');
				}		
			}			
			output.addStrFileAnimation('''
						$("#«idgen»").addClass('mano');
					}
				}
				MostrarImagen«idgen».prototype.handleMouseOut = function (e){
					$("#«idgen»").removeClass('mano');
				}
				scope.MostrarImagen«idgen» = MostrarImagen«idgen»;						
			}(window));
		''');
	}
	def generateAnimation5(Output output, Widget wg, List<ContentElement> args, int j, String idgen, Integer tipo){
		var RecordValue tempwg1;
		if (tipo==1){
			tempwg1= wg.widgetelements.get(0) as RecordValue;
		}else{
			val arge = args.get(j) as Widget;			
			tempwg1= arge.widgetelements.get(0) as RecordValue;
		}
		val tempwg3= tempwg1.recordvalues.get(0).fieldvalue as Text;
		output.addStrFileAnimationCSS('''
			#«idgen» canvas{
				max-width: «tempwg3.html»px
			}
		''');
	}	
	def generateAnimationInOut(Output output, Widget wg, String idgen, String title, List<ContentElement> args, int j, Integer tipo, int headingLevel){
		var List<String> returnparameter = new ArrayList()
		output.addStrElement('''
			<div class="row">
				<div class="col-md-12 interview">
					<h«headingLevel»><i class="fas fa-info-circle"></i>&nbsp;«if (wg.help != ''){wg.help}else{i18n.getMessage("HelpImages")}»</h«headingLevel»>
					<i id="objetivo«idgen»" class="objective far fa-check-circle fa-2x" aria-hidden="true"></i>
				</div>
			</div>
			<div class="col-md-12" id="«idgen»"></div>
		''');

        output.addStrProgesoObj('''
            ,"objetivo«idgen»"
        ''');
		generateAnimation0(output, idgen);
		generateAnimation1(output, wg,args,j,idgen,tipo);
		generateAnimation2(output, idgen);
		generateAnimation3(output, wg, args,j,idgen, tipo);
		generateAnimation4(output, wg, args,j,idgen, tipo);
		generateAnimation5(output, wg, args,j,idgen, tipo);

	}
	override generate(Widget widget, Output output,String idgen, String title, List<ContentElement> args, int i, Integer tipo, Integer tipoUnidad, String origin, int headingLevel){	
		generateAnimationInOut(output, widget, idgen,title,args,i, tipo, headingLevel);
	  	
	}
	
}