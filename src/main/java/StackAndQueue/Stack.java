package StackAndQueue;


import java.util.Scanner;

public class Stack {
    int stack_size=5;
    int stack[]=new int[stack_size];
    int top=-1;
    public void push(int data){
        top++;
        if(top>stack_size){
            System.out.println("stack overflow");
        }
        else{
            stack[top]=data;
            System.out.println("pushed");
        }

    }
    public void pop(){
        if(top<0){
            System.out.println("stack empty");
        }
        else{
            stack[top]=0;
            top--;
        }
    }

    public void printStack(){
        for(int i=0;i<=top;i++){
            try{
                System.out.println(i+" "+stack[i]);
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.exit(0);
            }

        }
        System.out.println("stack printed succesfully");
    }

    public static void main(String[] args) {
        //int arr[]={12,2,45,4,5,23,7,8,9,10};
        Scanner scan=new Scanner(System.in);
        Stack st=new Stack();
        int tab=0;
        while(tab!=5){
            System.out.println("1 for push\n2 for pop\n4 for print\n5 for exit");
            tab=scan.nextInt();
            if(tab==1)st.push(scan.nextInt());
            if(tab==2)st.pop();
            if(tab==4)st.printStack();
        }

    }
}
