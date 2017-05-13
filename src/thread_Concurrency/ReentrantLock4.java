package thread_Concurrency;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.*;

class MyThread2 extends Thread{
	
	static ReentrantLock l = new ReentrantLock();
	MyThread2(String name){
		super(name);
	}
	
	public void run(){
		do{
			try{
				if(l.tryLock(5000, TimeUnit.MILLISECONDS)){
					System.out.println(Thread.currentThread().getName() + " ...got lock");
					Thread.sleep(30000);
					l.unlock();
					System.out.println(Thread.currentThread().getName() + " ... releasing lock");
					break;
				}
				else{
					System.out.println(Thread.currentThread().getName() + "..not able to get the lock");
				}
			}catch(InterruptedException e){
				System.out.println(e);
			}
		}while(true);
		
	}
	
}

public class ReentrantLock4 {
	
	public static void main(String args[]){
		
		MyThread2 t1=new MyThread2("First Thread");
		MyThread2 t2=new MyThread2("Second Thread");
		t1.start();
		t2.start();
	}

}
