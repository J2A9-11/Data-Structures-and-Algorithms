// Basic operations of singly linked list

import java.util.Scanner;
class Node{
    int data;
    Node next;
}
public class linkedlist {
    public Node head;
    public Node tail;


    // Creating a linked list


    public void insert(int data){
        Node ne=new Node();
        if(head==null)
        {
            head=ne;
            head.data=data;
            tail=head;
        }
        else{
        tail.next=ne;
        tail=ne;
        tail.data=data;
        }
        tail.next=null;
    }


    // Adding element at the last of a linked list


    public void addLast(int data)
    {
        Node ne =new Node();
        if (head==null)
        {
            head=ne;
            head.data=data;
            tail=head;
        }
        else 
        tail=head;
        {
            while(tail.next!=null)
            tail=tail.next;
            tail.next=ne;
            tail=ne;
            tail.data=data;
            tail.next=null;
        }
        
    }


    // Adding element at the beginning of a linked list


    public void addBegin(int data)
    {
        Node ne=new Node();
        if(head==null)
        {
            head=ne;
            head.data=data;
            tail=head;
        }
        else 
        {
            ne.next=head;
            head=ne;
            head.data=data;
        }
    }


    //Adding element after the given data in a linked list


    public void inbetween(int da,int a)
    {
        Node ne=new Node();
        if(head==null)
        {
            head=ne;
            head.data=da;
            tail=head;
        }
        else
        {
            tail=head;
            while(tail.data!=a && tail.next!=null)
            tail=tail.next;
            if (tail.next==null && tail.data!=a)
            System.out.println("Data not found");
            else{
            Node temp=tail.next;
            tail.next=ne;
            tail=ne;
            tail.data=da;
            tail.next=temp;
            }


        }
    }


    // Adding element after the given position in a linked list


    public void index(int index,int data)
    {
        Node ne=new Node();
        tail=head;
        if(index==0)
        {
            Node temp=tail.next;
            tail.next=ne;
            tail=ne;
            tail.data=data;
            tail.next=temp;
        }
        else
        {
        if(index>=1)
        {
            while(index--!=1 && tail!=null)
            {
                tail=tail.next;
            }
            if(tail==null)
            System.out.println("Position not found");
            else if(tail.next!=null)
            {
                Node temp=tail.next;
                tail.next=ne;
                tail=ne;
                tail.data=data;
                tail.next=temp;
            }
            else if(tail.next==null)
            {
                tail.next=ne;
                tail=ne;
                tail.data=data;
                tail.next=null;

            }
        }
        else 
        System.out.println("Position not found");
    }

    }


    // Adding a data at the given position in a given linked list
    

    public void atIndex(int index, int data)
    {
        Node ne= new Node();
        if (index==1)
        {
            ne.next=head;
            head=ne;
            head.data=data;
        }
        else
        {
        tail=head;
        if(index>=2)
        {        
            while(index-->2 && tail!=null)
            {
                tail=tail.next;
            }
            if(tail==null)
            System.out.println("Position not found");
            else if (tail.next!=null)
            {
                Node temp=tail.next;
                tail.next=ne;
                tail=ne;
                tail.data=data;
                tail.next=temp;
            }
            else if (tail.next==null){
                tail.next=ne;
                tail=ne;
                tail.data=data;
                tail.next=null;
            }
        }
        else
        System.out.println("Position not found");
        }

        
    }


    // Searching the data in linked list


    public void search(int da)
    {
        if(head==null)
        System.out.println("Linked list empty");
        else{
            int pos=1;
            tail=head;
            while(tail.next!=null && tail.data!=da){
            tail=tail.next;pos=pos+1;}
            if(tail.next==null && tail.data!=da)
            System.out.println("Data " +da+" is not present in linked list ");
            else 
            System.out.println("Data "+da+ " found at position "+pos+" in linked list");
        }
    }


    // Displaying a linked list


    public void display()
    {
        tail=head;
        while(tail!=null)
        {
            System.out.print(tail.data+"\t");
            tail=tail.next;
        }System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter number of nodes in a linked list-");
        int n=sc.nextInt();
        linkedlist obj=new linkedlist();
        System.out.println("Enter elements of linked list");
        for(int i=0;i<n;i++)
        {
            obj.insert(sc.nextInt());
        }
        System.out.println("Elements of linked list are-");
        obj.display();

        System.out.println("Adding element at the last of a linked list-");
        obj.addLast(80);
        obj.display();

        System.out.println("Adding element at the beginning of a linked list-");
        obj.addBegin(100);
        obj.display();

        System.out.println("Adding element after the given data in a linked list-");
        obj.inbetween(456, 50);
        obj.display();
        
        System.out.println("Adding element after the given position in a linked list-");
        obj.index(0,109);
        obj.display();

        System.out.println("Adding element at the given index in a linked list-");
        obj.atIndex(2,16);
        obj.display();

        System.out.println("Searching the data in linked list-");
        obj.search(50);
        obj.display();
    }
}
