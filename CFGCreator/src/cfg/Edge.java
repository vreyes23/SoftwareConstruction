package cfg;

public class Edge {

	private int start; //Edge start point
	private int end; //Edge end point
	
	public Edge()
	{
		this.start = 0;
		this.end = 0;
	}//end constructor with no parameters
	
	//constructor that assigns the start and end point of edge
	public Edge(int st, int e) 
	{
		this.start = st;
		this.end = e;
	}//end constructor with parameters 
	
	//gets the edge start point (int)
	public int getStart()
	{
		return (this.start);
	}//end getStart() function
	
	
	//gets the edge end point (int)
	public int getEnd()
	{
		return (this.end);
	}//end getEnd() function
	
	//Overridden toString() function that prints Edge(start_point,end_point)
	public String toString()
	{
		return ("Edge(" + this.start + "," + this.end + ")");
	}//end toString() function
	
	//check whether Edge "ed" is the same as the current one
	public boolean isSameEdge(Edge ed)
	{
		return (this.start == ed.getStart() && this.end == ed.getEnd());
	}//end isSameEdge() function
}
