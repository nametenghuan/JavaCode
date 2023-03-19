package 多线程;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class CallableDemo01 {

    /**
     * 创建线程的第三种实现方式：
     *    Callable方式
     */
    public static void main(String[] args) throws  Exception {
        // 创建一个Callable实例
        Callable<Integer> callable = new MyCallable();
        FutureTask<Integer> futureTask = new FutureTask<>(callable);
        // 获取一个线程 肯定是要先创建一个Thread对象  futureTask本质上是Runable接口的实现
        Thread t1 = new Thread(futureTask);
        System.out.println("main方法start....");
        t1.start(); // 本质还是执行的 Runable中的run方法，只是 run方法调用了call方法罢了
        // 获取返回的结果
        System.out.println(futureTask.get()); // 获取开启的线程执行完成后返回的结果
        System.out.println("main方法end ....");
    }
}


/**
 * 创建Callable的实现类
 *    我们需要指定Callable的泛型，这个泛型是返回结果的类型
 */
class MyCallable implements Callable<Integer> {
    /**
     * 线程自动后会执行的方法
     * @return
     * @throws Exception
     */
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for(int i = 1 ; i <= 100 ; i ++){
            sum += i;
        }
        return sum;
    }
}