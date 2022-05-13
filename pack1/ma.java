// MULTI THREADING

import java.lang.Thread;
class ma
{
public static void main(String[] args) throws InterruptedException
{
    System.out.println("Main thread starts");
    MyThread t1 = new MyThread(); 
    MyThread t2 = new MyThread(); // MyThread extends Thread
    t2.setPriority(9);
    t1.setPriority(3);
    t1.start();
    t2.start();
    t1.join();
    System.out.println(t1.isAlive());        // true
    //t.join();                               // main method waits for thread t to complete
    //Thread.yield()
    System.out.println(t2.isAlive()); // main method sleeps for 3 seconds
    if(MyThread.num==10)
    {
    	System.out.println("Flight Takeoff");
    }
    else
    {
    	System.out.println("Flight takeoff failed");
    }
    System.out.println("End of thread");
}
}

class MyThread extends Thread
{
    public static int num=0;
    @Override
    public void run()
    {
        System.out.println("Flight taking  off");
        //System.out.println(Thread.currentThread());
        for(int i=0;i<5;i++)
        {
            try {
				Thread.sleep(1000);
				num+=1;
				 System.out.println(Thread.currentThread());
				 System.out.println("countdown T-"+num);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            
        }
       
    }
    
}

