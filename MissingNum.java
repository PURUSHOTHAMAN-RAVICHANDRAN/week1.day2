package week1.day2;
public class MissingNum {

	public static void main(String[] args) {
		int arr[]= {0,1,2,3,4,6,7,8,9};
		int len=arr.length;
		for(int i=0;i<len;i++)
		{
			if(i!=arr[i])
			{
				System.out.println(i);
				break;
			}
			
		}
		
		

	}

}
