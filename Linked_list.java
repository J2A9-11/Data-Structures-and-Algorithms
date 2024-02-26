 class Student{
    String name;
    int age;
    double cpi;
    Student(String name,int age,double cpi)
    {
        this.name=name;
        this.age=age;
        this.cpi=cpi;
    }
}
class Node
{
    Student data;
    Node next;
    Node prev;
}
public class Linked_list {
    Node head,tail;


    public void addFirst(Student data)
    {
        Node ne=new Node();
        if(head==null)
        {
            head=ne;
            head.data=data;
            head.prev=null;
            head.next=null;
        }
        else
        {
            ne.next=head;
            head.prev=ne;
            head=ne;
            head.data=data;
            head.prev=null;
        }
    }

    public void sort()
    {
       tail=head;
       while(tail!=null)
       {
        Node t =head;
        while(t.next!=null)
        {
            if(t.data.cpi > t.next.data.cpi)
            {
                double c=t.data.cpi;
                t.data.cpi=t.next.data.cpi;
                t.next.data.cpi=c;
            }
            t=t.next;
        }
        tail=tail.next;
       } 
    }


    public void display()
    {
        if(head==null)
        System.out.println("Linked list is empty");
        else{
            tail=head;
            while(tail!=null)
            {

                System.out.print("Name-"+tail.data.name+"\t");
                System.out.print("Age-"+tail.data.age+"\t");
                System.out.print("Cpi-"+tail.data.cpi+"\t");
                tail=tail.next;
                System.out.println();

            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Student s1=new Student("Govind",20,9.5);
        Student s2=new Student("Jai",18,8.0);
        Student s3=new Student("Shubham",21,8.5);
        Student s4=new Student("Manoj",22,9.0);
        Linked_list obj=new Linked_list();
        obj.addFirst(s1);
        obj.addFirst(s2);
        obj.addFirst(s3);
        obj.addFirst(s4);
        obj.display();
        obj.sort();
        obj.display();
    }

}
