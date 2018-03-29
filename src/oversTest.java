import static org.junit.Assert.*;

import org.junit.Test;

public class oversTest {

	@Test
	public void testGetBall() {
		int[] s= new int[6];//score to be sent for an over
		int score=0;
		s[0]=1;
		s[1]=2;
		s[2]=1;
		s[3]=2;
		s[4]=1;
		s[5]=2;
		
		overs over=new overs(s);
		score=over.getBall();
		assertEquals(9,score);
		System.out.println("Score is "+score+" Runs");
	}
	
	@Test
	public void testGetballscore() {
		int score;
		int[] s= new int[6];//score to be sent for an over
		s[0]=1; //1st ball
		s[1]=2;	//2nd ball
		s[2]=5;	//3rd ball
		s[3]=0;	//4th ball
		s[4]=0;	//5th ball
		s[5]=0;	//6th ball
		
		int n=3;//ball
		overs over=new overs(s);
		score=over.getballscore(n);
		assertEquals(5,score);
		System.out.println("Score for "+n+" ball is "+score+" Runs");
	}
	
}
