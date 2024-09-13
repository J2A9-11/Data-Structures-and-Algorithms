class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
    }
}
public class Queue {
    Node front; 
    Node rear;
    public void Enqueue(int data)
    {
        Node ne=new Node(data);
        if(front==null)
        {
            front=ne;
            rear=front;
        }
        else 
        {
            ne.next=front;
            front=ne;
        }
    }
    public void Dequeue()
    {
        if(front==null)
        System.out.println("Queue is empty");
        else if(front.next==null){
        front=null;
        }
        else
        {
            rear=front;
            while(rear.next.next!=null)
            {
                rear=rear.next;
            }
            rear.next=null;
        }
    }
    public void display()
    {
        if(front==null)
        System.out.println("Queue is empty");
        rear=front;
        while(rear!=null)
        {
            System.out.print(rear.data+"\t");
            rear=rear.next;
        }System.out.println("\n");
    }
    public static void main(String args[])
    {
        Queue obj=new Queue();
        obj.Enqueue(54);
        obj.Enqueue(56);
        obj.Enqueue(57);
        obj.Enqueue(58);
        obj.Enqueue(59);
        obj.display();
        obj.Dequeue();
        obj.display();
    }

}
