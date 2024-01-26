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
        display();
        
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
        display();
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
            display();
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
            display();
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
            display();
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
            display();
        }
        else 
        System.out.println("Position not found");
    }

    }


    // Adding a data at the given position in a given linked list
    

    public void atIndex(int index, int data,int n)
    {
        Node ne= new Node();
        if (index==1)
        {
            ne.next=head;
            head=ne;
            head.data=data;
            display();
        }
        else
        {
        tail=head;
        if(index>=2 && index<=n+1)
        {        
            while(index-->2 && tail!=null)
            {
                tail=tail.next;
            }
            if (tail.next!=null)
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
            display();
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
            else{ 
            System.out.println("Data "+da+ " found at position "+pos+" in linked list");
            display();
            }
        }
    }


    //Deleting the last node from a linked list


    public void delLast()
    {
        if(head==null)
        display();
        else if(head.next==null){
        head=null;
        display();
        }
        else
        {
            tail=head;
            while(tail.next.next!=null)
            {
                tail=tail.next;
            }
            tail.next=null;
            display();
        }
    }


    //Deleting the first node from a linked list


    public void delFirst()
    {
        if(head==null)
        display();
        else if(head.next==null)
        {
            head=null;
            display();
        }
        else
        {
            tail=head;
            head=tail.next;
            display();

        }
    }


    // Deleting the node after the given data in a linked list


    public void delafter(int da)
    {
        if(head==null)
        display();
        else{
            tail=head;
            while(tail.data!=da && tail.next!=null)
            {
                tail=tail.next;
            }
            if(tail.data!=da && tail.next==null)
            System.out.println("Data not found");
            else if(tail.data==da && tail.next==null)
            System.out.println("This is the last node ");
            else{
                Node temp=tail.next;
                tail.next=temp.next;
                temp=null;
                display();
            }
        }
    }


    // Deleting the node after the given position in a linked list


    public void delposition(int pos)
    {
        if(head==null)
        display();
        else{
            if(pos>=0)
            {
                tail=head;
                if(pos==0)
                {
                    head=head.next;
                    display();
                }
                else
                {
                    while(pos--!=1 && tail!=null)
                    tail=tail.next;
                    if(tail==null)
                    System.out.println("Position not found");
                    else if(tail.next==null)
                    System.out.println("This is the last node of linked list");
                    else
                    {
                        Node temp=tail.next;
                        tail.next=temp.next;
                        temp=null;
                        display();
                    }
                }
            }
            else
            System.out.println("Position not found");
        }
    }


    // Deleting a node at the given position in a linked list


    public void delatposition(int pos,int n)
    {
        if (head==null)
        display();
        else{
            if(pos>=1 && pos<=n)
            {
                tail=head;
                if(pos==1)
                {
                    head=head.next;
                    display();
                }
                else
                {
                    while(pos--!=2 && tail!=null){
                    tail=tail.next;}                  
                    Node temp=tail.next;
                    tail.next=temp.next;
                    display();
                }
            }
            else
            System.out.println("Position not found");
        }
    }



    // Displaying a linked list


    public void display()
    {
        if(head==null)
        System.out.println("Linked list is empty");
        tail=head;
        while(tail!=null)
        {
            System.out.print(tail.data+"\t");
            tail=tail.next;
        }System.out.println("\n");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter number of nodes in a linked list-");
        int n=sc.nextInt();
        linkedlist obj=new linkedlist();
        if(n>0){
        System.out.println("Enter elements of linked list");
        for(int i=0;i<n;i++)
        {
            obj.insert(sc.nextInt());
        }
        System.out.println("Elements of linked list are-");
        obj.display();

        System.out.println("Adding element at the last of a linked list-");
        obj.addLast(80);

        System.out.println("Adding element at the beginning of a linked list-");
        obj.addBegin(100);

        System.out.println("Adding element after the given data in a linked list-");
        obj.inbetween(456, 50);
        
        System.out.println("Adding element after the given position in a linked list-");
        obj.index(0,109);

        System.out.println("Adding element at the given index in a linked list-");
        obj.atIndex(4,16,n);

        System.out.println("Searching the data in linked list-");
        obj.search(50);

        System.out.println("Deleting the last node from a linked list-");
        obj.delLast();

        System.out.println("Deleting the first node from a linked list-");
        obj.delFirst();

        System.out.println("Deleting the node from a linked list after a given data-");
        obj.delafter(30);

        System.out.println("Deleting the node from a linked list after a given position-");
        obj.delposition(0);

        System.out.println("Deleting the node from a linked list at a given position-");
        obj.delatposition(5,n);
        }
        else 
        obj.display();
    }
}
