public class MyRunnable2 implements Runnable{
    @Override
    public void run() {
        for (int i = 15; i>0; i--){
            System.out.println("Thread #3 : "+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        System.out.println("Thread #3 is finished...!!!");
    }
}
