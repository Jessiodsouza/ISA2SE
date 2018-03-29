
public class overs {
	int[] ball=new int[6];

	
	
	public overs(int[] s) {
		// TODO Auto-generated constructor stub
		int i;
		for(i=0;i<6;i++)
		ball[i]=(s[i]);
		System.out.println(ball[i]);
	}

	/*
	//Gets score to all 6 balls
	public void setBall(int s[]) {
		int i;
		for(i=0;i<6;i++)
			ball[i].score=s[i];
	}
	*/
	
	//Gets score of all 6 balls
	public int getBall() {
		int i;
		int sum=0;
		for(i=0;i<6;i++)
			sum=ball[i];
		return sum;
	}
	
}