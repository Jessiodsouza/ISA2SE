
public class overs {
	
	int[] ball= {0,0,0,0,0,0};//6balls in an over
	int sum=0;
	
	//function to take score and assign to the over
	public overs(int[] s) {
		// TODO Auto-generated constructor stub
		int i;
		for(i=0;i<6;i++)
		ball[i]=(s[i]);
	}

	//Gets score of all 6 balls
	public int getBall() {
		int i;
		
		for(i=0;i<6;i++)
			sum=sum+ball[i];
		return sum;
	}
	
	//get score of an individual ball
	public int getballscore(int i) {
			sum=sum+ball[i];
		return sum;
		
	}
	
}