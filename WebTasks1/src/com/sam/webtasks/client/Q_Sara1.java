package com.sam.webtasks.client;
// Alcohol Use Disorders Identification Test (ICAR) by Saunders, Aasland, Babor, De la Fuente & Grant (1993)


import com.sam.webtasks.questionnaire.Questionnaire;

public class Q_Sara1 {
	public static void Run() {
		//This line initialises the questionnaire object. You should replace "demoQuestinnaire" with
		//the name for your questionnaire (the Java convention is that this should start with a lower-
		//case letter. Then replace "demoQuestionnaire" in all of the lines below with your name.
		Questionnaire Sara1 = new Questionnaire();

		//This is the name for your questionnaire, which is outputted to the database with the
		//participant's answer
		Sara1.name = "Sara1";

		//This is the instruction given to the participant above the questionnaire. NB you
		//can include line breaks with the HTML code "<br"
		Sara1.instructionText = "In this questionnaire you will get some questions about your attitudes "
				+ "to Artificial Intelligence smart technologies such as Alexa, Google Home Assistant, and Siri.<br><br>"
				+ "For each question below, please tell us where you would place yourself on a scale of "
				+ "1 (strongly disagree) to 5 (strongly agree).";

		//How many response options does the questionnaire have?
		Sara1.nOptions = 5;

		//How many items (i.e. questions) does the questionnaire have?
		Sara1.nItems = 10;

		//What is the maximum number of items to be presented on one page? If the questionnaire
		//has more than this number, it will be presented on two or more page
		Sara1.itemsPerPage = 5;

		//What proportion of the screen width should be used for the questions rather than
		//the response options. This can be adjusted by trial and error if the widths look wrong
		Sara1.questionWidth = 0.25;

		//This command needs to be run before the text for the response options and items can
		//be set up below
		Sara1.Init();

		//This is where you define the possible response options. Start with [0]
		//NB a line break can be included with <br> if necessary
		Sara1.options[0] = "Strongly<br>disagree";
		Sara1.options[1] = "Slightly<br>disagree";
		Sara1.options[2] = "Neutral";
		Sara1.options[3] = "Slightly<br>agree";
		Sara1.options[4] = "Strongly<br>agree";
		
		//This is where you define the questionnaire items. As above, a line break can
		//be included with <br> if necessary
		Sara1.items[0] = "I feel positive toward AI smart technologies";
		Sara1.items[1] = "I feel the using AI smart technologies is pleasant";
		Sara1.items[2] = "Using AI smart technologies is a good idea";
		Sara1.items[3] = "Using AI smart technologies is a smart way to get things done";
		Sara1.items[4] = "I intend to use AI smart technologies in future";
		Sara1.items[5] = "AI smart technologies work well";
		Sara1.items[6] = "AI smart technologies have the features necessary to complete key tasks";
		Sara1.items[7] = "Smart technologies are competent in their area of expertise";
		Sara1.items[8] = "Smart technologies are reliable";
		Sara1.items[9] = "Smart technologies are dependable";
		
				
		//This needs to be included at the end of the code so that the questionnaire
		//actually runs
		Sara1.Run();
	}
}


