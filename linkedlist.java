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


    public void inbetween(int data,int a)
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
            tail=head;
            while(tail.data!=a)
            tail=tail.next;
            Node temp=tail.next;
            tail.next=ne;
            tail=ne;
            tail.data=data;
            tail.next=temp;


        }
    }


    // Adding element after the given index in a linked list


    public void index(int index,int data)
    {
        Node ne=new Node();
        tail=head;
        if(index==0)
        {
            ne.next=head;
            head=ne;
            head.data=data;
        }
        while(index--!=0)
        {
            tail=tail.next;
        }
        if(tail.next!=null)
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


    // Displaying a linked list


    public void display()
    {
        Node tail =head;
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

        obj.addLast(80);
        System.out.println("Adding element at the last of a linked list-");
        obj.display();

        System.out.println("Adding element at the beginning of a linked list-");
        obj.addBegin(100);
        obj.display();

        System.out.println("Adding element after the given data in a linked list-");
        obj.inbetween(456, 30);
        obj.display();
        
        System.out.println("Adding element after the given index in a linked list-");
        obj.index(4,109);
        obj.display();
    }
}
