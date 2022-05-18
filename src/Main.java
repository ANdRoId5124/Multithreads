public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread2 = new Thread(new Thread2());
        Thread thread3 = new Thread(new Thread3());
        Thread thread1 = new Thread(new Thread1());

       thread3.start();
       thread3.join();


        thread2.start();
        thread2.join();

        thread1.start();
        thread1.join();





    }
}
