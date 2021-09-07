package week1.day2;

public class armstrong {

	public static void main(String[] args) {
		int n=407;
		int val=n;
		int q,r,sum=0;
		while(n!=0)
		{
			q=n/10;
			r=n%10;
			sum+=r*r*r;
			n=q;
		}
		//System.out.println(val);
		if(val==sum)
		{
			System.out.println("Armstrong Nuumber");
		}
		else
		{
			System.out.println("non-Armstrong");
		}

	}

}
