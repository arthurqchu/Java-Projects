 

import java.io.IOException;
import java.io.FileWriter;
import java.io.File;
import java.util.ArrayList;

public class ResultWriter
{
	public static void writeResults(String filename, Ballot ballot)
	throws IOException
	{
	//Construct a long string and then write it to a file at the end
		ballot = BallotReader.readBallot(filename);
		String header = "";
		String dashes = "";
		String candidateTags = "";
		String outcome = "";
		String outputString = "";

		header = String.format("RESULTS - %s", ballot.getOfficeName());

		//Determine the longest tag 
		String longestTag = "";
		for(Candidate candidate : ballot.getCandidates()) {
			if(candidate.getName().length() + candidate.getAffiliation().length() > longestTag.length()) {
				longestTag = candidate.getName() + " - " + candidate.getAffiliation();
			}
			String resultFormat = "%-s" + "%" + (longestTag.length() + 12) + "+d";
			candidateTags += String.format(resultFormat,  candidate.getName() + " - " + candidate.getAffiliation(), candidate.getVoteCount());
		}

		//Add the correct number of dashes
		for(int i = 0; i < longestTag.length(); i++) {
			dashes += '-';
		}
		//Determine who has the most votes
		String winner = "";
		int mostVotes = 0;
		for(Candidate candidate : ballot.getCandidates()) {
			if(candidate.getVoteCount() > mostVotes) {
				winner = candidate.getName() + " - " + candidate.getAffiliation();
			}
		}
		if(winner == "") {
			winner = "NO WINNER";
		}
		outcome += String.format("WINNER: %s", winner);

		outputString += header + '\n' + dashes + '\n' + candidateTags + '\n' + outcome;

		File file = new File("results.txt");
		FileWriter writer = new FileWriter(file);
		writer.write(outputString);
		writer.close();
	}
}

