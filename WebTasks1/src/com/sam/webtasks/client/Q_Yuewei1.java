package com.sam.webtasks.client;
// Alcohol Use Disorders Identification Test (ICAR) by Saunders, Aasland, Babor, De la Fuente & Grant (1993)


import com.sam.webtasks.questionnaire.Questionnaire;

public class Q_Yuewei1 {
	public static void Run() {
		//This line initialises the questionnaire object. You should replace "demoQuestinnaire" with
		//the name for your questionnaire (the Java convention is that this should start with a lower-
		//case letter. Then replace "demoQuestionnaire" in all of the lines below with your name.
		Questionnaire Yuewei1 = new Questionnaire();

		//This is the name for your questionnaire, which is outputted to the database with the
		//participant's answer
		Yuewei1.name = "Yuewei1";

		//This is the instruction given to the participant above the questionnaire. NB you
		//can include line breaks with the HTML code "<br"
		Yuewei1.instructionText = "Please answer how much you agree with the following statements "
				+ "about yourself, on a scale of 1 (strongly disagree) to 4 (strongly agree).";

		//How many response options does the questionnaire have?
		Yuewei1.nOptions = 4;

		//How many items (i.e. questions) does the questionnaire have?
		Yuewei1.nItems = 10;

		//What is the maximum number of items to be presented on one page? If the questionnaire
		//has more than this number, it will be presented on two or more page
		Yuewei1.itemsPerPage = 5;

		//What proportion of the screen width should be used for the questions rather than
		//the response options. This can be adjusted by trial and error if the widths look wrong
		Yuewei1.questionWidth = 0.35;

		//This command needs to be run before the text for the response options and items can
		//be set up below
		Yuewei1.Init();

		//This is where you define the possible response options. Start with [0]
		//NB a line break can be included with <br> if necessary
		Yuewei1.options[0] = "Strongly<br>disagree";
		Yuewei1.options[1] = "Disagree";
		Yuewei1.options[2] = "Agree";
		Yuewei1.options[3] = "Strongly<br>agree";
		
		//This is where you define the questionnaire items. As above, a line break can
		//be included with <br> if necessary
		Yuewei1.items[0] = "I feel that I'm a person of worth, at least on an equal plane with others";
		Yuewei1.items[1] = "I feel that I have a number of good qualities";
		Yuewei1.items[2] = "All in all, I am inclined to feel that I am a failure";
		Yuewei1.items[3] = "I am able to do things as well as most other people";
		Yuewei1.items[4] = "I feel I do not have much to be proud of";
		Yuewei1.items[5] = "I take a positive attitude toward myself";
		Yuewei1.items[6] = "On the whole, I am satisfied with myself";
		Yuewei1.items[7] = "I wish I could have more respect for myself";
		Yuewei1.items[8] = "I certainly feel useless at times";
		Yuewei1.items[9] = "At times I think I am no good at all";
			
		
		//This needs to be included at the end of the code so that the questionnaire
		//actually runs
		Yuewei1.Run();
	}
}


