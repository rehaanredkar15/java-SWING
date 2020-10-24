package com.company;

/* we use interface for performing multiple inheritance  , the interface used here is runnable which is functional */
class Hello implements Runnable {

    public void run()
    {
        for (int j = -1; j <= 5; j++) {
            System.out.println("hello");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}


class Hi implements Runnable
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
public class Multithreading2 {
    public static void main(String[] args) {
        Runnable obj1 = new Hello();  // the objects here are of runnable
        Runnable obj2 = new Hi();

        Thread t1 = new Thread(obj1);  //bcoz here we call the start through thread as start isnt avilable in runnable interface
        Thread t2 = new Thread(obj2);

        t1.start();  //here thread isnt used ,
        try{Thread.sleep(10);} catch(Exception e){}
        t2.start();


        }
    }
