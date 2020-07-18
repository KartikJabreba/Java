package StackAndQueue;

import java.util.Scanner;

public class Queue {
    int head=0,tail=-1;
    int queue_size=10;
    int queue[]= new int[queue_size];
    public void enque(int data){
        if(head>queue_size-1){
            System.out.println("queue is full");
        }
        else{
            tail++;
            queue[tail]=data;
        }
    }

    public void dequeue(){
        if(head==tail){
            System.out.println("Empty Queue");
        }
        else{
            head++;
        }
    }

    public void printQueue(){
        if(head<0){
            System.out.println("Queue is empty");
        }
        else{
            for(int i=head;i<=tail;i++){
                System.out.println(i+" "+queue[i]);
            }
        }
    }
    public static void main(String[] args){
        Queue q=new Queue();
        Scanner scan=new Scanner(System.in);
        int tab=0;
        while(tab!=6){
            System.out.println("1 for enque\n2 for deque\n3 for back\n4 for front\n5 for print\n6 for exit");
            tab=scan.nextInt();
            if(tab==1)q.enque(scan.nextInt());
            if(tab==2)q.dequeue();
            if(tab==5)q.printQueue();
        }
    }
}
