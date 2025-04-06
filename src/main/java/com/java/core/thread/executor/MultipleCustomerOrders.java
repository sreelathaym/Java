package com.java.core.thread.executor;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;
/*
Key Takeaways
🔹 Use FixedThreadPool(n) → If you have a limited number of threads.
🔹 Use CachedThreadPool() → If tasks are short-lived and need quick execution.
🔹 Use SingleThreadExecutor() → If you want sequential execution.
🔹 Use ScheduledThreadPool() → If you need delayed or periodic execution.
🔹 Use Future → To retrieve results of asynchronous tasks.
🔹 Always shutdown() → To release resources properly.
 */

class OrderProcess implements Callable{
    private String orderId;
    OrderProcess(String orderId){
        this.orderId=orderId;
    }

    @Override
    public Object call() throws Exception {
        Thread.sleep((int)(Math.random() * 5000)); // Simulate processing time
        return "Order " + orderId + " processed by " + Thread.currentThread().getName();
    }
}
public class MultipleCustomerOrders {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor= Executors.newFixedThreadPool(3);
        Future<String> order1 = executor.submit(new OrderProcess("101"));
        Future<String> order2 = executor.submit(new OrderProcess("102"));
        Future<String> order3 = executor.submit(new OrderProcess("103"));
        System.out.println(order1.get());
        System.out.println(order2.get());
        System.out.println(order3.get());
        executor.shutdown();
    }
}

