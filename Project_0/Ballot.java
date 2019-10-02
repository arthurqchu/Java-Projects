import java.util.ArrayList;

/**
*Each instance of Ballot contains an arraylist of Candidates and the Name of the office up for a toe
*/
public class Ballot
{
	//Variables
	private String officeName;
	private ArrayList<Candidate> candidateArray;

	public Ballot(String officeName)
	{
		this.officeName = officeName;
	}

	public String getOfficeName()
	{
    		return this.officeName;
	}

	public void addCandidate(Candidate c)
	{
		this.candidateArray.add(c);
	}

	public ArrayList<Candidate> getCandidates()
	{
    		return this.candidateArray;
	}
}
