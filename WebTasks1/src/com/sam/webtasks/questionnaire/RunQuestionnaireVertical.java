package com.sam.webtasks.questionnaire;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RadioButton;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.sam.webtasks.basictools.PHP;
import com.sam.webtasks.basictools.ProgressBar;

public class RunQuestionnaireVertical {

	public static void main(QuestionnaireVertical q) {
		final RadioButton[] radioButton = new RadioButton[q.nOptions];
		final HorizontalPanel[] radioButtonPanel = new HorizontalPanel[q.nOptions];
        final VerticalPanel itemPanel = new VerticalPanel();
        final HTML optionHTML[] = new HTML[q.nOptions];
        final HorizontalPanel[] optionHTMLPanel = new HorizontalPanel[q.nOptions];
        final VerticalPanel questionPanel = new VerticalPanel();
        final HTML itemHTML = new HTML();
        final VerticalPanel screenPanel = new VerticalPanel();
        final Label spacingLabel = new Label(" ");
        final HorizontalPanel centeringPanel = new HorizontalPanel();
        
        final HTML instructHTML = new HTML(q.instructionText);
        
        screenPanel.setWidth("80%");
        
        screenPanel.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
        screenPanel.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);

        instructHTML.addStyleName("instructionText");
        instructHTML.addStyleName("bottomMarginSmall");

        screenPanel.add(instructHTML);

        itemHTML.setHTML(q.item);

        itemPanel.add(itemHTML);

        itemHTML.addStyleName("bottomMarginSmall");

        for (int o=0;o<q.nOptions;o++) {
        	radioButton[o] = new RadioButton("","");

        	radioButton[o].setName("item");

        	optionHTML[o] = new HTML();

        	optionHTML[o].setHTML(q.options[o]);

        	radioButtonPanel[o] = new HorizontalPanel();

        	radioButtonPanel[o].add(radioButton[o]);
        	radioButton[o].addStyleName("rightMarginSmall");
        	radioButtonPanel[o].add(optionHTML[o]);

        	itemPanel.add(radioButtonPanel[o]);
        }
        
        screenPanel.add(itemPanel);
        
        final Button continueButton = new Button("Continue");
        
        continueButton.addStyleName("topMarginSmall");
        
        screenPanel.add(continueButton);

        centeringPanel.setWidth(Window.getClientWidth() + "px");
        centeringPanel.setHeight(Window.getClientHeight() + "px");
        
        centeringPanel.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
        centeringPanel.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
        
        centeringPanel.add(screenPanel);
        
        RootPanel.get().add(centeringPanel);
        
        continueButton.addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
            	int response=0;
            	
            	for (int o=0;o<q.nOptions;o++) {
            		if (radioButton[o].getValue()) {
            			response=o+1;
            		}
            	}
            	
            	if (response==0) {
            		itemHTML.removeStyleName("black");
                    itemHTML.addStyleName("red");
            	} else {
            		ProgressBar.Increment();
            		
            		String data = q.name;
            		
            		data = data + ", " + response;
            		
            		RootPanel.get().remove(centeringPanel);
            		
            		PHP.logData("completedQuestionnaire", data, true);
            	}
            }
        });
	}

}
