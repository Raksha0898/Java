
class Arraylargest {

	public static void main(String[] args) 
	{
		int[] arr= {5,3,10,25,2};
		int largest=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				largest=arr[i];
			}
		}
			System.out.println(largest);
	}
}
