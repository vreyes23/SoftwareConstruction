package cfg;

public class StartNode {
	private StartNode nodeA = null; //(Knows node A is null) No Entry, 1 Exit
	private StartNode startnode; //Start Node
	
	public StartNode()
	{
		this.startnode = nodeA;
	}//end StartNode constructor
	
	public StartNode(StartNode start) 
	{
	     //set startnode equals to start;
		startnode = start;
	}//end StartNode constructor
	
	public StartNode getStartNode()
	{
	      // Return the startnode variable;
		return startnode;
	}//end getStartNode() function

	public boolean isSameNode(StartNode st)
	{
	     //Return of startnode == st.StartNode()
		   return (startnode == st.getStartNode());
	}//end isSameNode() function	
}
