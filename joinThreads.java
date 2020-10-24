package com.company;

public class joinThreads {

    private static int count = 0;
  /* the synchornized makes a lock on the fucntion which provides the enterence of only one thread entries
  as thread are used for multi purposes at the same time
  */
    private static synchronized void incount(){
        count++;
    }

    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i =0; i<= 10;i++)
                {
                    incount();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int j = 0; j<= 10;j++)
                {
                    incount();
                }
            }
        });
        t1.start();
        t2.start();

        try{ //t=Java Thread join method can be used to payse the current thread execution until unless the  specified thread is dead
            t1.join();
            t2.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(count);//if we dont join statement then the start and the print statment work simultaneously
    }


}
