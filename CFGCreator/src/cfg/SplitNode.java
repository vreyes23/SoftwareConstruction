package cfg;

public class SplitNode {

	private SplitNode splitnode;

	public SplitNode() 
	{
	    //Set splitnode equal to null
		this.splitnode = null;
	}
	
	public SplitNode(SplitNode split) 
	{
	      //Set splitnode equal to split;
		  this.splitnode = split;
	}
	
	public SplitNode getSplitNode()
	{
	      //Return of splitnode private variable;
		  return (this.splitnode);
		  
	}
	
	public boolean isSplitNode(SplitNode splitn)
	{
	       //Return  test if splitnode equates to  splitn.getSplitNode();
		  return (this.splitnode == splitn.getSplitNode());
		   
	}
}
