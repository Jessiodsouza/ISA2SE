import static org.junit.Assert.*;

import org.junit.Test;

public class oversTest {

	@Test
	public void testSetBall() {
		//
	}

	@Test
	public void testGetBall() {
		int[] s= new int[6];
		int sum=0;
		s[0]=1;
		s[1]=1;
		s[2]=1;
		s[3]=1;
		s[4]=1;
		s[5]=1;
		overs over=new overs(s);
		sum=over.getBall();
		assertEquals(6,sum);
		System.out.println("6");
	}

}
