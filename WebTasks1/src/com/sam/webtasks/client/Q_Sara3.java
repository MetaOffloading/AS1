package com.sam.webtasks.client;
// Apathy Evaluation Scale (AES) by Marin, Biedrzycki, & Firinciogullari (1991)


import com.sam.webtasks.questionnaire.QuestionnaireVertical;

public class Q_Sara3 {
	public static void Run() {
		//This line initialises the questionnaire object. You should replace "demoQuestinnaire" with
		//the name for your questionnaire (the Java convention is that this should start with a lower-
		//case letter. Then replace "demoQuestionnaire" in all of the lines below with your name.
		QuestionnaireVertical Sara3 = new QuestionnaireVertical();

		//This is the name for your questionnaire, which is outputted to the database with the
		//participant's answer
		Sara3.name = "Sara3";

		//This is the instruction given to the participant above the questionnaire. NB you
		//can include line breaks with the HTML code "<br"
		Sara3.instructionText = "";

		//How many items (i.e. questions) does the questionnaire have?
		Sara3.nOptions = 6;
		
		//This command needs to be run before the text for the response options and items can
		//be set up below
		Sara3.Init();
	
		for (int o=0;o<Sara3.nOptions;o++) {
			Sara3.options[o]= "";
		}

		//This is where you define the questionnaire items. As above, a line break can
		//be included with <br> if necessary
		Sara3.item = "Please estimate how long you spend each day interacting "
				+ "with digital devices such as smartphones and computers.";
		Sara3.options[0] = "Less than 2 hours";
		Sara3.options[1] = "2-4 hours";
		Sara3.options[2] = "4-6 hours";
		Sara3.options[3] = "6-8 hours";
		Sara3.options[4] = "8-10 hours";
		Sara3.options[5] = "More than 10 hours";


		//This needs to be included at the end of the code so that the questionnaire
		//actually runs
		Sara3.Run();
	}
}
