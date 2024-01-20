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

    //Adding element in between of a linked list after a given data


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
    public void index(int index,int data)
    {
        Node ne=new Node();
        tail=head;
        while(tail.next!=null && index-->=0)
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
        else if(tail.)
        {
            tail.next=ne;

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
        /*head.next=new Node(40);
        head.next.next=new Node(60);
        Node temp= head.next.next;
        head.next.next=new Node(50);
        head.next.next.next=temp;*/
        //Node head;
        Scanner sc=new Scanner (System.in);
        linkedlist obj=new linkedlist();
        System.out.println("enter elements of linked list");
        for(int i=0;i<4;i++)
        {
            obj.insert(sc.nextInt());
        }
        System.out.println("Elements of linked list are-");
        obj.display();
        obj.addLast(80);
        System.out.println("Adding element at the last of a linked list-");
        obj.display();
        obj.addBegin(100);
        System.out.println("Adding element at the beginning of a linked list-");
        obj.display();
        obj.inbetween(456, 30);
        System.out.println("Adding element in between of a linked list-");
        obj.display();
    }
}
