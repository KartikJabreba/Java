import java.util.*;
class Linear
{
	public static int Search(int arr[],int num,int left,int right, int size)
	{
		while(right<=size){
		if(arr[right]==num)
		{return 0;}
		if(arr[right]>num)
		{
			right=right/2;
			return Search(arr,num,left,right,size);}
		if(arr[right]<num)
		{
			left=right;
			right=2*left;
			return Search(arr,num,left,right,size);}
		}
		return 1;
	
	}
	
	public static void main(String[] args)
	{
		//Linear linear=new Linear(System.in);
		int arr[]={3,6,9,12,15,18,21,24,27,30};
		int num=7;
		int left=0;
		int right= arr.length/4;
		int size= arr.length-1;
		int result= Search(arr,num,left,right,size);
			if(result==0)
				System.out.print("Present");
	}
}