public class Main {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();

        MyRunnable runnable1 = new MyRunnable();
        MyRunnable2 runnable2 = new MyRunnable2();

        Thread thread2 = new Thread(runnable1);
        Thread thread3 = new Thread(runnable2);


        thread1.start();
        thread2.start();
        thread3.start();


    }
}