package com.sam.webtasks.client;
// Apathy Evaluation Scale (AES) by Marin, Biedrzycki, & Firinciogullari (1991)


import com.sam.webtasks.questionnaire.QuestionnaireVertical;

public class Q_SES4 {
	public static void Run() {
		//This line initialises the questionnaire object. You should replace "demoQuestinnaire" with
		//the name for your questionnaire (the Java convention is that this should start with a lower-
		//case letter. Then replace "demoQuestionnaire" in all of the lines below with your name.
		QuestionnaireVertical SES = new QuestionnaireVertical();

		//This is the name for your questionnaire, which is outputted to the database with the
		//participant's answer
		SES.name = "SES4";

		//This is the instruction given to the participant above the questionnaire. NB you
		//can include line breaks with the HTML code "<br"
		SES.instructionText = "";

		//How many items (i.e. questions) does the questionnaire have?
		SES.nOptions = 7;
		
		//This command needs to be run before the text for the response options and items can
		//be set up below
		SES.Init();
	
		for (int o=0;o<SES.nOptions;o++) {
			SES.options[o]= "";
		}

		//This is where you define the questionnaire items. As above, a line break can
		//be included with <br> if necessary
		SES.item = "What is your current employment status?";
		SES.options[0] = "Employed full-time";
		SES.options[1] = "Employed part-time";
		SES.options[2] = "Self-employed";
		SES.options[3] = "Unemployed";
		SES.options[4] = "Retired";
		SES.options[5] = "Student";
		SES.options[6] = "Homemaker";

		//This needs to be included at the end of the code so that the questionnaire
		//actually runs
		SES.Run();
	}
}
