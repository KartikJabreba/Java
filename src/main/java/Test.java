import java.util.*;
class Test
{
	public static void rev(char[] str)
	{
		int right = str.length-1;
		int left =0;
		//char temp="";
		for(left=0;left<right;left++)
		{
			if(!Character.isAlphabetic(str[left]))
			left++;
		else if (!Character.isAlphabetic(str[right]))
			right--;
		else{
		char temp= str[left];
		str[left]=str[right];
		str[right]=str[left];
		left++;
		right--;
		}
		}
	}	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		char[] str2= str.toCharArray();
		rev(str2);
		String str3=   new String(str2);
		System.out.println(str3);
	}
		
}