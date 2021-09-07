package week1.day3;

public class FrequencyOfNumber {

	public static void main(String[] args) {
		int arr[]={3,4,2,5,1,2,6,3,6,2,4,7,1};
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			System.out.println("the frequency count of "+arr[i]+" is "+count);
		}

	}

}
