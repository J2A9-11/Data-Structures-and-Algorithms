class Salesman
{
    String product_name;
    float sales;
    Salesman(String product,float sale)
    {
        product_name=product;
        sales=sale;
    }
    public boolean equals(Salesman obj)
    {
        return this.sales==obj.sales && this.product_name==obj.product_name;
    }
}
public class Main {
    static int linearSearch (Salesman[]arr,Salesman target)
    {
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i].equals(target))
            return i;
        }
        return -1;
    } 
    public static void main(String args[])
    {
        Salesman obj1=new Salesman("ABC", 1000);
        Salesman obj2=new Salesman("XYZ", 2000);
        Salesman obj3=new Salesman("POR", 3000);
        Salesman obj4=new Salesman("MNO", 4000);
        Salesman [] salesman={obj1,obj2,obj3,obj4};
        Salesman target= new Salesman("MNO", 4000);
        System.out.println(linearSearch(salesman, target));

    }

}
