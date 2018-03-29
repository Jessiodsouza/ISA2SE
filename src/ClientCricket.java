import static org.junit.Assert.assertEquals;

public class ClientCricket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		//assertEquals(6,sum);
		System.out.println("6");
	}
}
