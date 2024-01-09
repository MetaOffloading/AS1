package com.sam.webtasks.client;
// Alcohol Use Disorders Identification Test (ICAR) by Saunders, Aasland, Babor, De la Fuente & Grant (1993)


import com.sam.webtasks.questionnaire.Questionnaire;

public class Q_Sara2 {
	public static void Run() {
		//This line initialises the questionnaire object. You should replace "demoQuestinnaire" with
		//the name for your questionnaire (the Java convention is that this should start with a lower-
		//case letter. Then replace "demoQuestionnaire" in all of the lines below with your name.
		Questionnaire Sara2 = new Questionnaire();

		//This is the name for your questionnaire, which is outputted to the database with the
		//participant's answer
		Sara2.name = "Sara2";

		//This is the instruction given to the participant above the questionnaire. NB you
		//can include line breaks with the HTML code "<br"
		Sara2.instructionText = "In this questionnaire you will get some questions about your attitudes "
				+ "to technology.<br><br>"
				+ "For each question below, please tell us where you would place yourself on a scale of "
				+ "1 (strongly disagree) to 5 (strongly agree).";

		//How many response options does the questionnaire have?
		Sara2.nOptions = 5;

		//How many items (i.e. questions) does the questionnaire have?
		Sara2.nItems = 6;

		//What is the maximum number of items to be presented on one page? If the questionnaire
		//has more than this number, it will be presented on two or more page
		Sara2.itemsPerPage = 6;

		//What proportion of the screen width should be used for the questions rather than
		//the response options. This can be adjusted by trial and error if the widths look wrong
		Sara2.questionWidth = 0.25;

		//This command needs to be run before the text for the response options and items can
		//be set up below
		Sara2.Init();

		//This is where you define the possible response options. Start with [0]
		//NB a line break can be included with <br> if necessary
		Sara2.options[0] = "Strongly<br>disagree";
		Sara2.options[1] = "Slightly<br>disagree";
		Sara2.options[2] = "Neutral";
		Sara2.options[3] = "Slightly<br>agree";
		Sara2.options[4] = "Strongly<br>agree";
		
		//This is where you define the questionnaire items. As above, a line break can
		//be included with <br> if necessary
		Sara2.items[0] = "I usually trust technologies until there is a reason not to";
		Sara2.items[1] = "For the most part, I distrust technology";
		Sara2.items[2] = "In general, I would rely on technology to assist me";
		Sara2.items[3] = "My tendency to trust technology is high";
		Sara2.items[4] = "It is easy for me to trust technologies to do their job";
		Sara2.items[5] = "I am likely to trust technology even when I have little knowledge about it";
					
		//This needs to be included at the end of the code so that the questionnaire
		//actually runs
		Sara2.Run();
	}
}


