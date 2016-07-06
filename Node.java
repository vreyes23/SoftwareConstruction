package cfg;

public abstract class Node {
	private StartNode nodeA; //(Knows node A)
	private EndNode nodeB; //(Knows node B)
	private  boolean isentry; //Start Node member
    private boolean isexit; //End Node member
    private int nodenumber; //Node Number
    
	public abstract Node getNode(); //Know its type
	//Knows the Node number
	public int getNodeNumber() {
		return 0;
	}
	//Tests if the object is a End Node type
	public boolean isExit(){
		return (false);
	}
	//Tests if the object is a Start Node type
	public boolean isEntry(){
		return (false);
	}
	public abstract boolean isSameNode(Node node); //Tests whether its the same Node
	public abstract void setExit(EndNode nd); //Set End Node
	public abstract void setEntry(StartNode sn); //Set Start Node
	public abstract void getisExit(); //Return End Node
	public abstract void getisEntry(); //Return Start Node
}
