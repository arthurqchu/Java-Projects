/**
 * Candidate class constructs Candidate objects that contain each candidate's name and affiliation
 * @author Arthur
 *
 */

public class Candidate
{
	//Variables
	private String name;
	private String affiliation;
	private int voteCount;
	
	/**
	 * Candidate constructor takes in name of affiliation
	 * @param name
	 * @param affiliation
	 */
	public Candidate(String name, String affiliation)
	{
		this.name = name;
		this.affiliation = affiliation;
	}

	/**
	 * Returns name of Candidate
	 * @return this.name
	 */
	public String getName()
	{
    		return this.name;
	}

	/**
	 * Returns affiliation of Candidate
	 * @return this.affiliation
	 */
	public String getAffiliation()
	{
		 return this.affiliation;
	}

	/**
	 * Returns vote count for the candidate
	 * @return this.vote
	 */
	public int getVoteCount()
	{
    	return this.voteCount;
	}

	/**
	 * Increments the Candidate's voteCount
	 */
	public void tallyVote()
	{
		this.voteCount += 1;
	}

	/**
	 * Displays all inforamtion about the Candidate
	 */
	public String toString()
	{
		 return "Name: " + getName() + '\n' + "Affiliation: " + getAffiliation() + '\n' + "Number of Votes: " + getVoteCount();
	}
}
