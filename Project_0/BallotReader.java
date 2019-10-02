import java.io.IOException;


public class BallotReader
{

	public static Ballot readBallot(String filename)
	throws IOException
	{
		// ***Replace this with the correct implementation; for now, it's
		//    always returning a hard-coded ballot with three candidates.
		Ballot ballot = new Ballot("James Beard Award");
		ballot.addCandidate(new Candidate("Nina Compton", "Compere Lapin Party"));
		ballot.addCandidate(new Candidate("Alon Shaya", "Saba Party"));
		ballot.addCandidate(new Candidate("Emeril Lagasse", "Emeril's Party"));
		return ballot;
	}
}

