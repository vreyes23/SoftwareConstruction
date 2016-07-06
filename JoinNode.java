package cfg;

public class JoinNode {

	private JoinNode joinnode;

	public JoinNode(JoinNode join) 
	{
	     //Set joinnode equal to  join variable;
		this.joinnode = join;
	}//end Constructor

	public JoinNode getJoinNode() //(Knows content is "Join")
	{
	     //Return  of joinnode private variable;
		  return (this.joinnode);
	}//end getJoinNode() function
	
    public void setJoinNode(JoinNode jn)
	{
	       //Set joinnode equal to join variable;
    	this.joinnode = jn;
	}//end setJoinNode() procedure

	public boolean isJoinNode(JoinNode joinobj)
	{
	 //     Return if joinnode equates to join.getJoinNode();
		   return (this.joinnode == joinobj.getJoinNode());
	}//end isJoinNode() function

}
