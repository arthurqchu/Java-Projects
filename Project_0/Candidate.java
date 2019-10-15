public class Candidate
{
	//Variables
	private String name;
	private String affiliation;

	public Candidate(String name, String affiliation)
	{
		this.name = name;
		this.affiliation = affiliation;
	}


	public String getName()
	{
    		return this.name;
	}


	public String getAffiliation()
	{
		 return this.affiliation;
	}


	public int getVoteCount()
	{
    		return -1;
	}

	public void tallyVote()
	{

	}


	public String toString()
	{
		 return this.getName() + " - " + this.getAffiliation();
	}
}
