public class Threadsafe1 
{
    public static void main(String[] args) throws InterruptedException 
    {
        Counter c = new Counter();

        Runnable obj = () -> 
        {
            for(int i=0;i<1000;i++)
            {
                c.Increment();
            }
        }; 
        
        Runnable obj1 = () ->
        {
            for(int i=0;i<1000;i++)
            {
                c.Increment();
            }
        };
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj1);
        
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(c.count);

    }
}

class Counter
{
    int count;
    public synchronized void  Increment()
    {
        count++;   
    }
}
