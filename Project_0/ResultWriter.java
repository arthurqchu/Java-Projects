 

import java.io.IOException;
import java.io.FileWriter;
import java.util.ArrayList;

public class ResultWriter
{
	public static void writeResults(String filename, Ballot ballot)
	throws IOException
	{
	//Construct a long string and then write it to a file at the end
		ballot = BallotReader.readBallot(filename);

		String results = String.format("RESULTS - %s", ballot.getOfficeName());

		//Add the correct number of dashes
		for(int i = 0; i < FIXME; i++) {
			results += '-';
		}
		results += '\n';

		//Determine the longest tag 
		String longestTag = "";
		for(Candidate candidate : ballot.getCandidates()) {
			if(candidate.getName().length() + candidate.getAffiliation().length() > longestTag.length()) {
				longestTag = candidate.toString();
			}
			String resultFormat = "%-s" + "%" + longestTag.length() + "+d");
			results += String.format(resultFormat, candidate.toString(), candidate.getVoteCount());
		}
	}
}

