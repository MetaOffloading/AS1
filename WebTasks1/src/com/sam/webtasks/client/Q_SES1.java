package com.sam.webtasks.client;
// Apathy Evaluation Scale (AES) by Marin, Biedrzycki, & Firinciogullari (1991)


import com.sam.webtasks.questionnaire.QuestionnaireVertical;

public class Q_SES1 {
	public static void Run() {
		//This line initialises the questionnaire object. You should replace "demoQuestinnaire" with
		//the name for your questionnaire (the Java convention is that this should start with a lower-
		//case letter. Then replace "demoQuestionnaire" in all of the lines below with your name.
		QuestionnaireVertical SES = new QuestionnaireVertical();

		//This is the name for your questionnaire, which is outputted to the database with the
		//participant's answer
		SES.name = "SES1";

		//This is the instruction given to the participant above the questionnaire. NB you
		//can include line breaks with the HTML code "<br"
		SES.instructionText = "";

		//How many items (i.e. questions) does the questionnaire have?
		SES.nOptions = 9;
		
		//This command needs to be run before the text for the response options and items can
		//be set up below
		SES.Init();
	
		for (int o=0;o<SES.nOptions;o++) {
			SES.options[o]= "";
		}

		//This is where you define the questionnaire items. As above, a line break can
		//be included with <br> if necessary
		SES.item = "What is your current occupational status?";
		SES.options[0] = "Higher managerial/administrative/professional";
		SES.options[1] = "Lower managerial/administrative/professional";
		SES.options[2] = "Intermediate occupations";
		SES.options[3] = "Small employers and own account workers";
		SES.options[4] = "Lower supervisory and technical";
		SES.options[5] = "Semi-routine occupations";
		SES.options[6] = "Routine occupations";
		SES.options[7] = "Never worked / long-term unemployed";
		SES.options[8] = "Full-time student";

		//This needs to be included at the end of the code so that the questionnaire
		//actually runs
		SES.Run();
	}
}
