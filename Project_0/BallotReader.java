import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;


public class BallotReader
{

	public static Ballot readBallot(String filename)
	throws IOException
	{
		// ***Replace this with the correct implementation; for now, it's
		//    always returning a hard-coded ballot with three candidates.
		//Ballot ballot = new Ballot("James Beard Award");
		//ballot.addCandidate(new Candidate("Nina Compton", "Compere Lapin Party"));
		//ballot.addCandidate(new Candidate("Alon Shaya", "Saba Party"));
		//ballot.addCandidate(new Candidate("Emeril Lagasse", "Emeril's Party"));
		//return ballot;

		//Read the input file
		String fileName = "ENTER FILE NAME";
		Scanner fileScnr = new Scanner(fileName);

		String officeName = fileScnr.nextLine();
		Ballot inputBallot = new Ballot(officeName);

		int numCandidates = Integer.parseInt(fileScnr.nextLine());
		for(int i = 1; i <= numCandidates; i++) {
			String candidateInput = fileScnr.nextLine();
			for(int j = 0; j < candidateInput.length(); j++) {
				char ch = candidateInput.charAt(j);
				if(ch == ';') {
					String candidateName = candidateInput.substring(0, j-1);
					String candidateAffiliation = candidateInput.substring(j+1, -1);
					
					Candidate candidate = new Candidate(candidateName, candidateAffiliation);	
					inputBallot.addCandidate(candidate);	
					return inputBallot;
				}
			}
		}
		return inputBallot;
	}
}

