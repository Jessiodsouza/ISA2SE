
public class Score {
	overs[] over=new overs[3];
	
	public int getOverScore() {
		int i;
		int sum=0;
		for(i=0;i<6;i++)
			sum=over.getBall();
		return sum;
	}
}

