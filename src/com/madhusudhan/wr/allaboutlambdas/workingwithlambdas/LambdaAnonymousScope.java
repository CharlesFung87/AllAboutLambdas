package com.madhusudhan.wr.allaboutlambdas.workingwithlambdas;

public class LambdaAnonymousScope {

    private void execute() {

        new Thread(() -> System.out.println("Lambda hashcode:" + this.hashCode())).start();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable's hashcode(this):" + this.hashCode());
            }
        };
        Thread t = new Thread(runnable);

        t.start();
        System.out.println("\nThread's hashcode:" + t.hashCode());
        System.out.println("Runnable's hashcode:" + runnable.hashCode());
        System.out.println("Instance hadhcode: " + this.hashCode());
    }

    public static void main(String[] args) {
        new LambdaAnonymousScope().execute();
    }
}
