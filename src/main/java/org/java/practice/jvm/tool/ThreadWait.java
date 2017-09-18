package org.java.practice.jvm.tool;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by yang.jin on 18/09/2017.
 *
 * 线程等待演示代码
 */
public class ThreadWait {

    /**
     *线程死循环演示
     */
    public static void createBusyThread(){
        Thread thread=new Thread(new Runnable(){
            @Override
            public void run(){
                while(true)//第41行
;
            }
        },"testBusyThread");
        thread.start();
    }
    /**
     *线程锁等待演示
     */
    public static void createLockThread(final Object lock){
        Thread thread=new Thread(new Runnable(){
            @Override
            public void run(){
                synchronized(lock){
                    try{
                        lock.wait();
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        },"testLockThread");
        thread.start();
    }
    public static void main(String[]args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        createBusyThread();
        br.readLine();
        Object obj=new Object();
        createLockThread(obj);
    }
}
