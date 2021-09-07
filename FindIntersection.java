package week1.day3;

public class FindIntersection {

	public static void main(String[] args) {
		int arr1[]= {2,3,6,7,11,10,9};
		int arr2[]= {2,3,5,7,8,10,9};
		int len1=arr1.length;
		int len2=arr2.length;
		for(int i=0;i<len1;i++)
		{
			for(int j=0;j<len2;j++)
			{
				if(arr1[i]==arr2[j])
				{
					System.out.println(arr1[i]);
				}
				if(arr1[i]!=arr2[j])
				{
					continue;
				}
			}
		}
		
		

	}

}
