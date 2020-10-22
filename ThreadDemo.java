package com.company;

class hi extends Thread  //here extending the thread facilates the operations through thread
{
    public void run()    //here first we wrote show which led to first printing hi first then hello so for multithreading we used run  and start
    {
        for(int i = -1 ;i<= 5; i++)
        {
            System.out.println("hi");
            try{ Thread.sleep(1000);} catch (Exception e ){}  // try block helps in viewing better and how the hi and hello printed alternately
        }
    }
}
class Hello extends Thread
{
    public void run()
    {
        for(int j = -1 ; j <= 5 ;j++)
        {
            System.out.println("hello");
            try{Thread.sleep(1000);} catch(Exception e){}
        }
    }
}
public class ThreadDemo {

    public static void main(String[] args) {

        hi obj = new hi();
        Hello obj2 = new Hello();

        obj.start();
        obj2.start();

    }
}
