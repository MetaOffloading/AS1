package com.sam.webtasks.client;
// Apathy Evaluation Scale (AES) by Marin, Biedrzycki, & Firinciogullari (1991)


import com.sam.webtasks.questionnaire.QuestionnaireVertical;

public class Q_SES3 {
	public static void Run() {
		//This line initialises the questionnaire object. You should replace "demoQuestinnaire" with
		//the name for your questionnaire (the Java convention is that this should start with a lower-
		//case letter. Then replace "demoQuestionnaire" in all of the lines below with your name.
		QuestionnaireVertical SES = new QuestionnaireVertical();

		//This is the name for your questionnaire, which is outputted to the database with the
		//participant's answer
		SES.name = "SES3";

		//This is the instruction given to the participant above the questionnaire. NB you
		//can include line breaks with the HTML code "<br"
		SES.instructionText = "";

		//How many items (i.e. questions) does the questionnaire have?
		SES.nOptions = 6;
		
		//This command needs to be run before the text for the response options and items can
		//be set up below
		SES.Init();
	
		for (int o=0;o<SES.nOptions;o++) {
			SES.options[o]= "";
		}

		//This is where you define the questionnaire items. As above, a line break can
		//be included with <br> if necessary
		SES.item = "What is the highest level of education completed by your parents?";
		SES.options[0] = "Primary school";
		SES.options[1] = "Secondary school up to 16 years";
		SES.options[2] = "Higher or secondary or further education (A-levels, BTEC, etc.)";
		SES.options[3] = "College or university";
		SES.options[4] = "Post-graduate degree";
		SES.options[5] = "Prefer not to say";

		//This needs to be included at the end of the code so that the questionnaire
		//actually runs
		SES.Run();
	}
}
