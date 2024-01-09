package com.sam.webtasks.client;
// Alcohol Use Disorders Identification Test (ICAR) by Saunders, Aasland, Babor, De la Fuente & Grant (1993)


import com.sam.webtasks.questionnaire.Questionnaire;

public class Q_SUIS {
	public static void Run() {
		//This line initialises the questionnaire object. You should replace "demoQuestinnaire" with
		//the name for your questionnaire (the Java convention is that this should start with a lower-
		//case letter. Then replace "demoQuestionnaire" in all of the lines below with your name.
		Questionnaire SUIS = new Questionnaire();

		//This is the name for your questionnaire, which is outputted to the database with the
		//participant's answer
		SUIS.name = "SUIS";

		//This is the instruction given to the participant above the questionnaire. NB you
		//can include line breaks with the HTML code "<br"
		SUIS.instructionText = "Please read each of the following descriptions and indicate the degree "
				+ "to which each is appropriate for you. Do not spend a lot of time thinking about each "
				+ "one, but respond based on your thoughts about how you do or do not perform each "
				+ "activity. If a description is always completely appropriate, please select "
				+ "\"5\"; if it is never appropriate, select \"1\"; if it is appropriate about half "
				+ "of the time, select \"3\"; and use the other numbers accordingly.";

		//How many response options does the questionnaire have?
		SUIS.nOptions = 5;

		//How many items (i.e. questions) does the questionnaire have?
		SUIS.nItems = 13;

		//What is the maximum number of items to be presented on one page? If the questionnaire
		//has more than this number, it will be presented on two or more page
		SUIS.itemsPerPage = 7;

		//What proportion of the screen width should be used for the questions rather than
		//the response options. This can be adjusted by trial and error if the widths look wrong
		SUIS.questionWidth = 0.5;

		//This command needs to be run before the text for the response options and items can
		//be set up below
		SUIS.Init();

		//This is where you define the possible response options. Start with [0]
		//NB a line break can be included with <br> if necessary
		SUIS.options[0] = "1";
		SUIS.options[1] = "2";
		SUIS.options[2] = "3";
		SUIS.options[3] = "4";
		SUIS.options[4] = "5";
		
		//This is where you define the questionnaire items. As above, a line break can
		//be included with <br> if necessary
		SUIS.items[0] = "When going to a new place, I prefer directions that include detailed descriptions of landmarks "
				+ "(such as the size, shape and color of a petrol station) in addition to their names.";
		SUIS.items[1] = "If I catch a glance of a car that is partially hidden behind bushes, I "
				+ "automatically \"complete it,\" seeing the entire car in my mind’s eye.";
		SUIS.items[2] = "If I am looking for new furniture in a store, I always visualize what the "
				+ "furniture would look like in particular places in my home."; 
		SUIS.items[3] = "I prefer to read novels that lead me easily to visualize where the "
				+ "characters are and what they are doing instead of novels that are difficult to visualize.";
		SUIS.items[4] = "When I think about visiting a relative, I almost always have a clear mental picture of him or her.";
		SUIS.items[5] = "When relatively easy technical material is described clearly in a text, I find illustrations "
				+ "distracting because they interfere with my ability to visualize the material.";
		SUIS.items[6] = "If someone were to tell me two-digit numbers to add (e.g., 24 and 31), "
				+ "I would visualize them in order to add them.";
		SUIS.items[7] = "Before I get dressed to go out, I first visualize what I will look like if I wear different combinations of clothes.";
		SUIS.items[8] = "When I think about a series of errands I must do, I visualize the stores I will visit.";
		SUIS.items[9] = "I competed in the 1917 Summer Olympics Games";
		SUIS.items[10] = "When I first hear a friend’s voice, a visual image of him or her almost always springs to mind.";
		SUIS.items[11] = "When I hear a radio announcer or DJ I’ve never actually seen, I usually find myself picturing what they might look like.";
		SUIS.items[12] = "If I saw a car accident, I would visualize what had happened when later trying to recall the details.";
		//This needs to be included at the end of the code so that the questionnaire
		//actually runs
		SUIS.Run();
	}
}


