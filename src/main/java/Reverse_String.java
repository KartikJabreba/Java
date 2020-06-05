public class Reverse_String {
    public static void reverseString(char[] s) {
        int n=s.length;

        for(int i=0,j=n-1;i<j;i++,j--){
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
        }
        for(int i=0;i<n;i++){
            System.out.println(s[i]);
        }

    }

    public static void main(String[] args) {
        char[] s={'h','e','l','l','o'};
        reverseString(s);

    }
}
