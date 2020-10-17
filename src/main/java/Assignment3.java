public class Assignment3 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,7,8,9,10,11};
        int num=0;
        for(int i=0,j=1;j<arr.length;i++,j++){
            if(arr[i]==arr[j]){
                num=arr[i];
                break;
            }
        }
        System.out.println(num);
    }
}
