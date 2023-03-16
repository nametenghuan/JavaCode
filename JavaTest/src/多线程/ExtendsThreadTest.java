package 多线程;

public class ExtendsThreadTest {
    public static void main(String[] args) {
        System.out.println("1我是" + Thread.currentThread().getName());
        MyThread myThread1 = new MyThread();
        myThread1.start();
        System.out.println("2我是" + Thread.currentThread().getName());
    }
}
class MyThread extends Thread {
    public void run() {
        System.out.println("MyThread.run()" + Thread.currentThread().getName());
    }
}
