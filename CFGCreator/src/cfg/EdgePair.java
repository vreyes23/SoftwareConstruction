package cfg;

public class EdgePair {

	//(A,B,C): A = start, B = middle, C=end
	private int start_point; // Edge start point
	private int middle_point; //Edge middle point
	private int end_point;  //Edge end point
	
	
	public EdgePair() 
	{
		//constructor that initializes start_point, middle_point, end_point
		this.start_point = 0;
		this.middle_point = 0;
		this.end_point = 0;
	}//end constructor
	
	
	public EdgePair(int startp,int middlep, int endp)
	{
		//constructor that sets the private fields with the parameters: startp, middlep, endp
		this.start_point = startp;
		this.middle_point = middlep;
		this.end_point = endp;
	}//end constructor
	
	
	public int getStartPoint()
	{
		//returns the start point of an EdgePair
		return (this.start_point);
	}//end getStartPoint() function
	
	
	public int getMiddlePoint()
	{
		//returns the middle point of an EdgePair
		return (this.middle_point);
	}//end getMiddlePoint() function
	
	
	public int getEndPoint()
	{
		//returns the End Point of an EdgePair
		return (this.end_point);
	}//end getEndpoint() function
	
	
	public void EdgePairCompatible(EdgePair e1, EdgePair e2)
	{
		//Testing to see if the Edge Pair e1 & e2 are compatible
		// (A,B), (B,C): Then we can generate an edge pair
		if (e1.getEndPoint() != e2.getStartPoint())
		{
			System.out.println("Cannot generate an edge pair with this combination");
		}//end if
		
		this.start_point = e1.getStartPoint(); //assign start point for Edge e1
		this.middle_point = e1.getEndPoint(); //assign middle point for Edge e1
		this.end_point = e2.getEndPoint(); //assign end point for Edge e2 
	}//end EdgePairCompatible(param1,param2) procedure
	
	public String toString()
	{
		//Prints the String "EdgePair(start_point,middle_point,end_point)"
		return ("EdgePair(" + this.start_point + "," + this.middle_point + "," + this.end_point + ")");
	}//end toString() function
	
	
	public boolean isSameEdgePair(EdgePair ep)
	{
		//Testing whether it's an EdgePair
		return (this.start_point == ep.getStartPoint() && this.middle_point == ep.getMiddlePoint() && this.end_point == ep.getEndPoint());
	}//end isSameEdgePair(param) function

}
