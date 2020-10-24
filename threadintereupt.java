package com.company;

public class threadintereupt extends Thread {
    public void run() {
        try {
            Thread.sleep(1000);  //mostly when the porgram is in sleep it is interrupted
            System.out.println("TASk");
        } catch (InterruptedException e) {
            System.out.println("Exception handled" + e);  //here we handle the exception
        }
        System.out.println("THREAD IS RUNNING");
    }

    public static void main(String[] args) {
        threadintereupt thread1 = new threadintereupt();
        thread1.start();  //so start here is triggered so there should be a run process

        thread1.interrupt();  //object of the class is used to interrupt the programs

    }
}
