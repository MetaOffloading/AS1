package com.sam.webtasks.client;
// Apathy Evaluation Scale (AES) by Marin, Biedrzycki, & Firinciogullari (1991)


import com.sam.webtasks.questionnaire.QuestionnaireVertical;

public class Q_SES5 {
	public static void Run() {
		//This line initialises the questionnaire object. You should replace "demoQuestinnaire" with
		//the name for your questionnaire (the Java convention is that this should start with a lower-
		//case letter. Then replace "demoQuestionnaire" in all of the lines below with your name.
		QuestionnaireVertical SES = new QuestionnaireVertical();

		//This is the name for your questionnaire, which is outputted to the database with the
		//participant's answer
		SES.name = "SES5";

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
		SES.item = "What is your approximate annual household income bracket?";
		SES.options[0] = "Less than £20,000";
		SES.options[1] = "£20,000 - £40,000";
		SES.options[2] = "£40,000 - £60,000";
		SES.options[3] = "£60,000 - £80,000";
		SES.options[4] = "£80,000 - £100,000";
		SES.options[5] = "Above £100,000";
		SES.options[6] = "Not sure / prefer not to say";


		//This needs to be included at the end of the code so that the questionnaire
		//actually runs
		SES.Run();
	}
}
