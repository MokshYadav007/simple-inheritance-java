package multithreading;

class PS5 implements Runnable
{
     public void run()
    {
        try {
            System.out.println(Thread.currentThread().getName()+"Has entered the room");
            Thread.sleep(2000);
            synchronized(this)
            {
            System.out.println(Thread.currentThread().getName()+"started playing the game");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+"got bored and put the controller down");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+"Has left the room with");
            Thread.sleep(2000);
            }
        } 
        
        catch (Exception e) {
           
            System.out.println(" There is a problem");
        }
    }
}

public class syncronisation65 {
    public static void main(String[] args) {
        PS5 p1= new PS5();
        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p1);
        Thread t3 = new Thread(p1);

        t1.setName("Walter ");
        t2.setName("Gustavo ");
        t3.setName("Mike ");

        t1.start();
        t2.start();
        t3.start();

    }
    
}
