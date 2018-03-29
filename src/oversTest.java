import static org.junit.Assert.*;

import org.junit.Test;

public class oversTest {
	overs over;
	@Test
	public void testSetBall() {
		//
	}

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
		
		over=new overs(s);
		score=over.getBall();
		assertEquals(9,score);
		System.out.println("Score is "+score+" Runs");
	}

	public void testgetballscore() {
		int score;
			score=over.getballscore(2);
			assertEquals(2,score);
			System.out.println("Score for 2nd ball is "+score+" Runs");
			
	}
	
}
