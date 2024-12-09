
public class Sam12 
{
	
		static String reverse(String s) {
			String rev="";
			for(int i=s.length()-1;i>=0;i--)
			{
				rev=rev+s.charAt(i);
			}
			return rev;	
		}
		public static void main(String[] args) {
			String s="hi my name is shiva";
			String[] arr=s.split(" ");
			for(int i=arr.length-1;i>=0;i--)			
			{
				System.out.print(reverse(arr[i]+" "));
			}
		}
		
	}



