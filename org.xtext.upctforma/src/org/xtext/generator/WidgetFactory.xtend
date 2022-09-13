package org.xtext.generator

import upctforma.Widget
import upctforma.PlaceHolder
import upctforma.ContentElement
import upctforma.Text
import java.util.List
import org.eclipse.xtext.generator.IFileSystemAccess2
import java.util.HashMap
import upctforma.Image
import upctforma.Video
import upctforma.Row
import upctforma.Column
import upctforma.Section

class WidgetFactory {
	private WidgetFactory instance;
	private Integer containsTrueFalse;
	private List<ContentElement> args; 
	private int i; 
	private ContentElement contentElement;
	private String secId;
	private String title;
	private IFileSystemAccess2 fsa;
	private Integer tipoUnidad
	
	private static HashMap<String, ContentGeneration> contentGenerationPool = new HashMap<String, ContentGeneration>();
	private static ElementSection elementsection = null;
	
	def static private getTypeWidget(Output output,Widget widget, List<ContentElement> args, int i, String secId, String title, Integer tipo, Integer tipoUnidad, String origin, int headingLevel){
		switch widget.widgettype.name{
			case "Couples": {
				if (contentGenerationPool.get("WidgetCouples") === null){
					contentGenerationPool.put("WidgetCouples",new WidgetCouples());					
				}
				contentGenerationPool.get("WidgetCouples").generate(widget, output, secId, title, args, i, tipo, tipoUnidad, origin, headingLevel);						
			}
			case "Schema": {
				if (contentGenerationPool.get("WidgetSchema") === null){
					contentGenerationPool.put("WidgetSchema",new WidgetSchema());					
				}
				contentGenerationPool.get("WidgetSchema").generate(widget, output, secId, title, args, i, tipo, tipoUnidad, origin, headingLevel);						
			}
			case "ContainerTest": {
				if (contentGenerationPool.get("WidgetContainerTest") === null){
					contentGenerationPool.put("WidgetContainerTest",new WidgetContainerTest());
				}
				contentGenerationPool.get("WidgetContainerTest").generate(widget, output, secId, title, args, i, tipo, tipoUnidad, origin, headingLevel);						
			}
			case "ImageTextOver": {
				if (contentGenerationPool.get("WidgetImageText") === null){
					contentGenerationPool.put("WidgetImageText",new WidgetImageText());
				}
				contentGenerationPool.get("WidgetImageText").generate(widget, output, secId, title, args, i, tipo, tipoUnidad, origin, headingLevel);
			}
			case "ImageTextRight": {
				if (contentGenerationPool.get("WidgetImageText") === null){
					contentGenerationPool.put("WidgetImageText",new WidgetImageText());
				}
				contentGenerationPool.get("WidgetImageText").generate(widget, output, secId, title, args, i, tipo, tipoUnidad, origin, headingLevel);
			}
			case "VerticalAccordion": {
				if (contentGenerationPool.get("WidgetVerticalAccordion") === null){
					contentGenerationPool.put("WidgetVerticalAccordion",new WidgetVerticalAccordion());
				}
				contentGenerationPool.get("WidgetVerticalAccordion").generate(widget, output, secId, title, args, i, tipo, tipoUnidad, origin, headingLevel);
			}
			case "HorizontalTabs": {
				if (contentGenerationPool.get("WidgetHorizontalTabs") === null){
					contentGenerationPool.put("WidgetHorizontalTabs",new WidgetHorizontalTabs());					
				}
				contentGenerationPool.get("WidgetHorizontalTabs").generate(widget, output, secId, title, args, i, tipo, tipoUnidad, origin, headingLevel);						
			}
			case "ModalButton": {
				if (contentGenerationPool.get("WidgetModalButton") === null){
					contentGenerationPool.put("WidgetModalButton",new WidgetModalButton());					
				}
				contentGenerationPool.get("WidgetModalButton").generate(widget, output, secId, title, args, i, tipo, tipoUnidad, origin, headingLevel);						
			}
			case "AnimationInOut": {
				if (contentGenerationPool.get("WidgetAnimationInOut") === null){
					contentGenerationPool.put("WidgetAnimationInOut",new WidgetAnimationInOut());					
				}
				contentGenerationPool.get("WidgetAnimationInOut").generate(widget, output, secId, title, args, i, tipo, tipoUnidad, origin, headingLevel);						
			}
			case "ContainerAudioTerm": {
				if (contentGenerationPool.get("WidgetAudioTerm") === null){
					contentGenerationPool.put("WidgetAudioTerm",new WidgetAudioTerm());					
				}
				contentGenerationPool.get("WidgetAudioTerm").generate(widget, output, secId, title, args, i, tipo, tipoUnidad, origin, headingLevel);						
			}
			case "ContainerTrueFalse": {
				if (contentGenerationPool.get("WidgetTrueFalse") === null){
					contentGenerationPool.put("WidgetTrueFalse",new WidgetTrueFalse());					
				}
				contentGenerationPool.get("WidgetTrueFalse").generate(widget, output, secId, title, args, i, tipo, tipoUnidad, origin, headingLevel);						
			}
			case "ImageSound": {
				if (contentGenerationPool.get("WidgetImageSound") === null){
					contentGenerationPool.put("WidgetImageSound",new WidgetImageSound());					
				}
				contentGenerationPool.get("WidgetImageSound").generate(widget, output, secId, title, args, i, tipo, tipoUnidad, origin, headingLevel);						
			}
			case "ChooseOption": {
				if (contentGenerationPool.get("WidgetChooseOption") === null){
					contentGenerationPool.put("WidgetChooseOption",new WidgetChooseOption());					
				}
				contentGenerationPool.get("WidgetChooseOption").generate(widget, output, secId, title, args, i, tipo, tipoUnidad, origin, headingLevel);						
			}
			case "TextualDragAndDrop": {
				if (contentGenerationPool.get("TextualDragAndDrop") === null){
					contentGenerationPool.put("TextualDragAndDrop",new WidgetTextualDragAndDrop());					
				}
				contentGenerationPool.get("TextualDragAndDrop").generate(widget, output, secId, title, args, i, tipo, tipoUnidad, origin, headingLevel);						
			}
			case "MissingWords": {
                if (contentGenerationPool.get("MissingWords") === null){
                    contentGenerationPool.put("MissingWords",new WidgetMissingWords());
                }
                contentGenerationPool.get("MissingWords").generate(widget, output, secId, title, args, i, tipo, tipoUnidad, origin, headingLevel);
            }
            case "CorrectWord": {
                if (contentGenerationPool.get("CorrectWord") === null){
                    contentGenerationPool.put("CorrectWord",new WidgetCorrectWord());
                }
                contentGenerationPool.get("CorrectWord").generate(widget, output, secId, title, args, i, tipo, tipoUnidad, origin, headingLevel);
            }
            case "ButtonText": {
                if (contentGenerationPool.get("ButtonText") === null){
                    contentGenerationPool.put("ButtonText",new WidgetButtonText());
                }
                contentGenerationPool.get("ButtonText").generate(widget, output, secId, title, args, i, tipo, tipoUnidad, origin, headingLevel);
            }
            case "Hangman": {
                if (contentGenerationPool.get("Hangman") === null){
                    contentGenerationPool.put("Hangman", new WidgetHangman());
                }
                contentGenerationPool.get("Hangman").generate(widget, output, secId, title, args, i, tipo, tipoUnidad, origin, headingLevel);
            }
            case "SentenceOrder": {
                if (contentGenerationPool.get("SentenceOrder") === null){
                    contentGenerationPool.put("SentenceOrder", new WidgetSentenceOrder());
                }
                contentGenerationPool.get("SentenceOrder").generate(widget, output, secId, title, args, i, tipo, tipoUnidad, origin, headingLevel);
            }
            case "MatchColumns": {
                if (contentGenerationPool.get("MatchColumns") === null){
                    contentGenerationPool.put("MatchColumns", new WidgetMatchColumns());
                }
                contentGenerationPool.get("MatchColumns").generate(widget, output, secId, title, args, i, tipo, tipoUnidad, origin, headingLevel);
            }
            case "Puzzle": {
                if (contentGenerationPool.get("Puzzle") === null){
                    contentGenerationPool.put("Puzzle", new WidgetPuzzle());
                }
                contentGenerationPool.get("Puzzle").generate(widget, output, secId, title, args, i, tipo, tipoUnidad, origin, headingLevel);
            }
            case "Animation": {
                if (contentGenerationPool.get("Animation") === null){
                    contentGenerationPool.put("Animation", new WidgetAnimation());
                }
                contentGenerationPool.get("Animation").generate(widget, output, secId, title, args, i, tipo, tipoUnidad, origin, headingLevel);
            }
		}
	}
	
	def static private getTypePlaceHolder(Output output, PlaceHolder placeHolder, List<ContentElement> args, int i, String secId, String title, Integer tipoUnidad, String origin, int headingLevel){
		switch (placeHolder.type.name){
			case 'TextType':{
				getElementText(output, args, i, args.get(i), secId,title, tipoUnidad, origin, headingLevel);	
			}
			case 'ImageType':{
				getElementImage(output, args, i, args.get(i), secId,title, tipoUnidad, origin, headingLevel);	
			}
			case 'VideoType':{
				getElementVideo(output, args, i, args.get(i), secId,title, tipoUnidad, origin, headingLevel);	
			}
			default:{
				getTypeWidget(output, args.get(i) as Widget, args, i, secId,title, 2, tipoUnidad, origin, headingLevel);
			}
		}
		
	}
	
	def static private getElementText(Output output, List<ContentElement> args, int i, ContentElement contentElement, String secId, String title, Integer tipoUnidad, String origin, int headingLevel){
		if (contentGenerationPool.get("ElementText") == null){
			contentGenerationPool.put("ElementText",new ElementText());					
		}
		contentGenerationPool.get("ElementText").generate(contentElement, output, secId, title, args, i, 1, tipoUnidad, origin, headingLevel);
	}
	
	def static private getElementImage(Output output, List<ContentElement> args, int i, ContentElement contentElement, String secId, String title, Integer tipoUnidad, String origin, int headingLevel){
		if (contentGenerationPool.get("ElementImage") == null){
			contentGenerationPool.put("ElementImage",new ElementImage());					
		}
		contentGenerationPool.get("ElementImage").generate(contentElement, output, secId, title, args, i, 1, tipoUnidad, origin, headingLevel);
	}
	
	def static private getElementVideo(Output output, List<ContentElement> args, int i, ContentElement contentElement, String secId, String title, Integer tipoUnidad, String origin, int headingLevel){
		if (contentGenerationPool.get("ElementVideo") == null){
			contentGenerationPool.put("ElementVideo",new ElementVideo());					
		}
		contentGenerationPool.get("ElementVideo").generate(contentElement, output, secId, title, args, i, 1, tipoUnidad, origin, headingLevel);
	}
	
	def static public void getElement(Output output, List<ContentElement> args, int i, ContentElement contentElement, String secId, String title, Integer tipoUnidad, String origin, int headingLevel){
		
		switch (contentElement) {
			case contentElement instanceof Text:{
				getElementText(output, args, i, contentElement, secId,title, tipoUnidad, origin, headingLevel);				
	  		}
	  		case contentElement instanceof Image:{
				getElementImage(output, args, i, contentElement, secId,title, tipoUnidad, origin, headingLevel);					
	  		}
	  		case contentElement instanceof Video:{
				getElementVideo(output, args, i, contentElement, secId,title, tipoUnidad, origin, headingLevel);				
	  		}
	  		case contentElement instanceof Row:{
				if (contentGenerationPool.get("ElementRow") == null){
					contentGenerationPool.put("ElementRow",new ElementRow());					
				}
				//Valor de tipo = 1 sin uso
				contentGenerationPool.get("ElementRow").generate(contentElement, output, secId, title, args, i, 1, tipoUnidad, origin, headingLevel);				
	  		}
	  		case contentElement instanceof Column:{
				if (contentGenerationPool.get("ElementColumn") == null){
					contentGenerationPool.put("ElementColumn",new ElementColumn());					
				}
				//Valor de tipo = 1 sin uso
				contentGenerationPool.get("ElementColumn").generate(contentElement, output, secId, title, args, i, 1, tipoUnidad, origin, headingLevel);				
	  		}
	  		case contentElement instanceof Widget:{	  			
	  			 getTypeWidget(output, contentElement as Widget, args, i, secId,title, 1, tipoUnidad, origin, headingLevel);
	  		}
	  		case contentElement instanceof PlaceHolder:{
	  			getTypePlaceHolder(output, contentElement as PlaceHolder, args, i, secId,title, tipoUnidad, origin, headingLevel);
	  		}
		}	

	}
	def static public void processSection(Output output, Section se, Integer secId, Integer tipoUnidad, String origin, int headingLevel){
		if (elementsection == null){
			elementsection = new ElementSection();					
		}
		//Valor de tipo = 1 sin uso
		elementsection.generate(se, output, secId, tipoUnidad, origin, headingLevel);
	}
}
