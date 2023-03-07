public class Test extends Thread{
    @Override
    public void run(){
        for(int i= 1; i<10; i++) {
            System.out.println("Thread #1 is created ....!!!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread #1 is completed.");

    }

    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        thread1.start();
    }

}
