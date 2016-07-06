package cfg;

public class RegularNode {

	//private RegularNode nodeB = null; //(Knows node B is null)
	private RegularNode regularnode;

	public RegularNode(RegularNode simplenode) 
	{
	      //Set regularnode equal to simplenode variable;
		  this.regularnode = null;
	}

	public void setRegularNode(RegularNode simple)
	{
	      //Set  regularnode equal to simplenode;
		this.regularnode = simple;
		
	}

	public RegularNode getRegularNode() 
	{
	          //Return  of regularnode private variable;
		  return (this.regularnode);
	}


}
