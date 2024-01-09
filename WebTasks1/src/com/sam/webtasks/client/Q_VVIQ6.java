package com.sam.webtasks.client;
// Apathy Evaluation Scale (AES) by Marin, Biedrzycki, & Firinciogullari (1991)


import com.sam.webtasks.questionnaire.QuestionnaireVertical;

public class Q_VVIQ6 {
	public static void Run() {
		//This line initialises the questionnaire object. You should replace "demoQuestinnaire" with
		//the name for your questionnaire (the Java convention is that this should start with a lower-
		//case letter. Then replace "demoQuestionnaire" in all of the lines below with your name.
		QuestionnaireVertical VVIQ = new QuestionnaireVertical();

		//This is the name for your questionnaire, which is outputted to the database with the
		//participant's answer
		VVIQ.name = "VVIQ6";

		//This is the instruction given to the participant above the questionnaire. NB you
		//can include line breaks with the HTML code "<br"
		VVIQ.instructionText = "For each item on this questionnaire, try to form a visual image, "
				+ "and consider your experience carefully. Please note that there are no right "
				+ "or wrong answers to the questions, and that it is not necessarily desirable "
				+ "to experience imagery or, if you do, to have more vivid imagery.";

		//How many items (i.e. questions) does the questionnaire have?
		VVIQ.nOptions = 5;
		
		//This command needs to be run before the text for the response options and items can
		//be set up below
		VVIQ.Init();
	
		for (int o=0;o<VVIQ.nOptions;o++) {
			VVIQ.options[o]= "";
		}

		//This is where you define the questionnaire items. As above, a line break can
		//be included with <br> if necessary
		VVIQ.item = "Visualise a rising sun. Consider carefully the picture that comes before your "
				+ "mind's eye. Now rate the following item:<br><br>"
				+ "<b>The sky clears and surrounds the sun with blueness.</b>";
		VVIQ.options[0] = "No image at all, I only \"know\" I am thinking of the object";
		VVIQ.options[1] = "Dim and vague image";
		VVIQ.options[2] = "Moderately realistic and vivid";
		VVIQ.options[3] = "Realistic and reasonably vivid";
		VVIQ.options[4] = "Perfectly realistic, as vivid as real seeing";
		
		//This needs to be included at the end of the code so that the questionnaire
		//actually runs
		VVIQ.Run();
	}
}
