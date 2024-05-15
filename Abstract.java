// abstract class Car
// {
//     public abstract void drive();
//     public void Music()
//     {
//         System.out.println("Playing Music");
//     }
// }

 class Nissan
{


    public int sum(int a, int B)
    {
        int result=Math.addExact(a, B);
        return result;


    }
}

public class Abstract
{
    public static void main(String[] args)
    {
        Nissan obj = new Nissan();
        int r=obj.sum(1,2);
        System.out.println(r);
    }
}
