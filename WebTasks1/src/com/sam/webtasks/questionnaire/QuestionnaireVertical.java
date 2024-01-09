package com.sam.webtasks.questionnaire;


public class QuestionnaireVertical {
	//name for this questionnaire (outputted in the results)
	public String name = "";
	
	//instruction test
	public String instructionText = "";

	//number of items and corresponding responses
	public String item;
	public int[] responses;
	
	//response options
	public int nOptions;
	public String[] options;

	
	//initialise
	public void Init() {
		options = new String[nOptions];
	}

	//run the questionnaire
	public void Run() {
		RunQuestionnaireVertical.main(this);
	}
}
