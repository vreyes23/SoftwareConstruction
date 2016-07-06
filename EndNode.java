package cfg;

public class EndNode {

	private EndNode nodeB = null; //(Knows node B is null) No Exit
	private EndNode endnode; //Start Node
	
	public EndNode()
	{
	      this.endnode = nodeB;	
	}
	
	public EndNode(EndNode endnd) 
	{
	     //set startnode equals to start;
		this.endnode = endnd;
	}//end StartNode constructor
	
	public EndNode getEndNode()
	{
	      // Return the startnode variable;
		return endnode;
	}//end getStartNode() function

	public boolean isSameNode(EndNode e)
	{
	       //Return of startnode == st.StartNode()
		return (this.endnode == e.getEndNode());
	}//end isSameNode() function

	public boolean isExit() {
		// TODO Auto-generated method stub
		return false;
	}

}
