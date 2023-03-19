package 多线程;

/**
 * 调用某线程的该方法，将当前线程和该线程合并，即等待该线程结束，在恢复当前线程的运行
 */
public class FunDemo05 {

    /**
     * 线程的合并
     *     join方法
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("main  start ...");
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0 ; i < 6; i++){
                    System.out.println(Thread.currentThread().getName() + " 子线程执行了...");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        t1.start();
        try {
            t1.join(); // 线程的合并，和主线程合并  相当于我们直接调用了run方法
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main end ...");
    }
}
