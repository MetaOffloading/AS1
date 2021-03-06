//The SequenceHandler is the piece of code that defines the sequence of events
//that constitute the experiment.
//
//SequenceHandler.Next() will run the next step in the sequence.
//
//We can also switch between the main sequence of events and a subsequence
//using the SequenceHandler.SetLoop command. This takes two inputs:
//The first sets which loop we are in. 0 is the main loop. 1 is the first
//subloop. 2 is the second subloop, and so on.
//
//The second input is a Boolean. If this is set to true we initialise the 
//position so that the sequence will start from the beginning. If it is
//set to false, we will continue from whichever position we were currently in.
//
//So SequenceHandler.SetLoop(1,true) will switch to the first subloop,
//starting from the beginning.
//
//SequenceHandler.SetLoop(0,false) will switch to the main loop,
//continuing from where we left off.

package com.sam.webtasks.client;

import java.util.ArrayList;
import java.util.Collections;

import com.google.gwt.user.client.Random;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.RootPanel;
import com.sam.webtasks.basictools.CheckIdExists;
import com.sam.webtasks.basictools.CheckScreenSize;
import com.sam.webtasks.basictools.ClickPage;
import com.sam.webtasks.basictools.Consent;
import com.sam.webtasks.basictools.Counterbalance;
import com.sam.webtasks.basictools.InfoSheet;
import com.sam.webtasks.basictools.Initialise;
import com.sam.webtasks.basictools.Names;
import com.sam.webtasks.basictools.PHP;
import com.sam.webtasks.basictools.ProgressBar;
import com.sam.webtasks.basictools.Slider;
import com.sam.webtasks.basictools.TimeStamp;
import com.sam.webtasks.iotask1.IOtask1Block;
import com.sam.webtasks.iotask1.IOtask1BlockContext;
import com.sam.webtasks.iotask1.IOtask1DisplayParams;
import com.sam.webtasks.iotask1.IOtask1InitialiseTrial;
import com.sam.webtasks.iotask1.IOtask1RunTrial;
import com.sam.webtasks.iotask2.IOtask2Block;
import com.sam.webtasks.iotask2.IOtask2BlockContext;
import com.sam.webtasks.iotask2.IOtask2RunTrial;
import com.sam.webtasks.iotask2.IOtask2InitialiseTrial;
import com.sam.webtasks.iotask2.IOtask2PreTrial;

public class SequenceHandler {
	public static void Next() {	
		// move forward one step in whichever loop we are now in
		sequencePosition.set(whichLoop, sequencePosition.get(whichLoop) + 1);

		switch (whichLoop) {
		case 0: // MAIN LOOP
			switch (sequencePosition.get(0)) {
			/***********************************************************************
			 * The code here defines the main sequence of events in the experiment *
			 **********************************************************************/
			case 1:
				ClickPage.Run(Instructions.Get(0), "Next");
				break;
			case 2:
				IOtask2Block block0 = new IOtask2Block();
				block0.totalCircles = 8;
				block0.blockNum = 0;
				block0.nTargets = 0;
				block0.showPoints = false;
				block0.showPostTrialFeedback=false;
				block0.Run();
				break;
			case 3:
				ClickPage.Run(Instructions.Get(1),  "Next");
				break;
			case 4:
				IOtask2Block block1 = new IOtask2Block();
				block1.totalCircles = 8;
				block1.blockNum = 1;
				block1.nTargets = 1;
				block1.showPoints = false;
				block1.showPostTrialFeedback=false;
				block1.Run();
				break;
			case 5:
				if (IOtask2BlockContext.getnHits() == 0) { 
					SequenceHandler.SetPosition(SequenceHandler.GetPosition()-2); //this line means that instead of moving forward we will repeat the previous instructions
					ClickPage.Run("You did not drag the special circle to the instructed side of the square.", "Try again");
				} else {
					SequenceHandler.Next(); //move to the next instruction
				}
				break;
			case 6:
				ClickPage.Run(Instructions.Get(2), "Next");
				break;
			case 7:
				IOtask2Block block2 = new IOtask2Block();
				block2.totalCircles = 17;
				block2.blockNum = 2;
				block2.nTargets = 7;
				block2.showPoints = false;
				block2.showPostTrialFeedback=false;
				block2.Run();
				break;
			case 8:
				Slider.Run(Instructions.Get(12),  "None of them",  "All of them");
				break;
			case 9:
				PHP.logData("slider1", ""+Slider.getSliderValue(), true);
				break;
			case 10:
				ClickPage.Run(Instructions.Get(4), "Next");
				break;
			case 11:
				IOtask2Block block3 = new IOtask2Block();
				block3.totalCircles = 17;
				block3.blockNum = 3;
				block3.nTargets = 7;
				block3.showPoints = false;
				block3.showPostTrialFeedback=false;
				block3.Run();
				break;
			case 12:
				if (IOtask2BlockContext.getnHits() == 0) { 
					SequenceHandler.SetPosition(SequenceHandler.GetPosition()-2); //this line means that instead of moving forward we will repeat the previous instructions
					ClickPage.Run("You need to respond correctly to at least 5 of the special circles to continue.", "Try again");
				} else {
					SequenceHandler.Next(); //move to the next instruction
				}
				break;
			case 13:
				ClickPage.Run(Instructions.Get(5), "Next");
				break;
			case 14:
				ClickPage.Run(Instructions.Get(6), "Next");
				break;
			case 15:
				ClickPage.Run(Instructions.Get(7),  "Next");
				break;
			case 16:
				ClickPage.Run(Instructions.Get(8),  "Next");
				break;
			case 17:
				ClickPage.Run(Instructions.Get(9),  "Next");
				break;
			case 18:
				//add progress bar to screen
				ProgressBar.Initialise();
				ProgressBar.Show();
				ProgressBar.SetProgress(0,  14);
				Params.progress=0;
				
				IOtask2Block block4 = new IOtask2Block();
				block4.totalCircles = 17;
				block4.blockNum = 4;
				block4.nTargets = 7;
				block4.showPoints = true;
				block4.showPostTrialFeedback=false;
				block4.ongoingStimType = Names.ONGOING_STIM_NUMBERS;
				block4.standard13block = true;
				block4.updateProgress = true;
				
				
				block4.Run();
				break;
			case 19:
				// log data and check that it saves
				String data = TimeStamp.Now() + ",";
				data = data + SessionInfo.participantID + ",";
				data = data + Counterbalance.getFactorLevel("WhichReminderConditionFirst") + ",";
				data = data + Counterbalance.getFactorLevel("WhichEffortConditionFirst") + ",";
				data = data + SessionInfo.gender + ",";
				data = data + SessionInfo.age;

				PHP.UpdateStatus("finished");
				PHP.logData("finish", data, true);
				break;
			case 20:
				ProgressBar.Hide();
				
				ClickPage.Run(Instructions.Get(15), "nobutton");
				break;
			}
			break;

		/********************************************/
		/* no need to edit the code below this line */
		/********************************************/

		case 1: // initialisation loop
			switch (sequencePosition.get(1)) {
			case 1:
				// initialise experiment settings
				Initialise.Run();
				break;
			case 2:
				// make sure that a participant ID has been registered.
				// If not, the participant may not have accepted the HIT
				CheckIdExists.Run();
				break;
			case 3:
				// check the status of this participant ID.
				// have they already accessed or completed the experiment? if so,
				// we may want to block them, depending on the setting of
				// SessionInfo.eligibility
				PHP.CheckStatus();
				break;
			case 4:
				// clear screen, now that initial checks have been done
				RootPanel.get().clear();

				// make sure the browser window is big enough
				CheckScreenSize.Run(SessionInfo.minScreenSize, SessionInfo.minScreenSize);
				break;
			case 5:
				if (SessionInfo.runInfoConsentPages) { 
					InfoSheet.Run(Instructions.InfoText());
				} else {
					SequenceHandler.Next();
				}
				break;
			case 6:
				if (SessionInfo.runInfoConsentPages) { 
					Consent.Run();
				} else {
					SequenceHandler.Next();
				}
				break;
			case 7:
				SequenceHandler.SetLoop(0, true); // switch to and initialise the main loop
				SequenceHandler.Next(); // start the loop
				break;
			}
			break;
		case 2: // IOtask1 loop
			switch (sequencePosition.get(2)) {
			/*************************************************************
			 * The code here defines the sequence of events in subloop 2 *
			 * This runs a single trial of IOtask1                       *
			 *************************************************************/
			case 1:
				// first check if the block has ended. If so return control to the main sequence
				// handler
				IOtask1Block block = IOtask1BlockContext.getContext();

				if (block.currentTrial == block.nTrials) {
					SequenceHandler.SetLoop(0, false);
				}

				SequenceHandler.Next();
				break;
			case 2:
				// now initialise trial and present instructions
				IOtask1InitialiseTrial.Run();
				break;
			case 3:
				// now run the trial
				IOtask1RunTrial.Run();
				break;
			case 4:
				// we have reached the end, so we need to restart the loop
				SequenceHandler.SetLoop(2, true);
				SequenceHandler.Next();
				break;
				// TODO: mechanism to give post-trial feedback?
			}
			break;
		case 3: //IOtask2 loop
			switch (sequencePosition.get(3)) {
			/*************************************************************
			 * The code here defines the sequence of events in subloop 3 *
			 * This runs a single trial of IOtask2                       *
			 *************************************************************/
			case 1:
				// first check if the block has ended. If so return control to the main sequence
				// handler
				IOtask2Block block = IOtask2BlockContext.getContext();
				
				if (block.currentTrial == block.nTrials) {
					SequenceHandler.SetLoop(0,  false);
				}
				
				SequenceHandler.Next();
				break;
			case 2:
				IOtask2InitialiseTrial.Run();
				break;
			case 3:
				//present the pre-trial choice if appropriate
				if (IOtask2BlockContext.currentTargetValue() > -1) {
					IOtask2PreTrial.Run();
				} else { //otherwise just skip to the start of the block
					SequenceHandler.Next();
				}
				break;
			case 4:
				//now run the trial
				IOtask2RunTrial.Run();
				break;
			case 5:
				if (IOtask2BlockContext.showPostTrialFeedback()) {
					IOtask2Feedback.Run();
				} else {
					SequenceHandler.Next();
				}
				break;
			case 6:
				//we have reached the end, so we need to restart the loop
				SequenceHandler.SetLoop(3,  true);
				SequenceHandler.Next();
				break;
			}
		}
	}
	
	private static ArrayList<Integer> sequencePosition = new ArrayList<Integer>();
	private static int whichLoop;

	public static void SetLoop(int loop, Boolean init) {
		whichLoop = loop;

		while (whichLoop + 1 > sequencePosition.size()) { // is this a new loop?
			// if so, initialise the position in this loop to zero
			sequencePosition.add(0);
		}

		if (init) { // go the beginning of the sequence if init is true
			sequencePosition.set(whichLoop, 0);
		}
	}

	// set a new position
	public static void SetPosition(int newPosition) {
		sequencePosition.set(whichLoop, newPosition);
	}
	
	// get current loop
	public static int GetLoop() {
		return (whichLoop);
	}

	// get current position
	public static int GetPosition() {
		return (sequencePosition.get(whichLoop));
	}
	
	public static int GetMainPosition() {
		return (sequencePosition.get(0));
	}
}
