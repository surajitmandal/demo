package thread_Concurrency;
import java.util.concurrent.locks.*;

class MyThread1 extends Thread{
	static ReentrantLock l=new ReentrantLock();
	MyThread1(String name){
		super(name);
	}
	
	public void run(){
		if(l.tryLock()){
			System.out.println(Thread.currentThread().getName() + " Got lock and performing safe operation");
			try{
				Thread.sleep(2000);
			}catch(InterruptedException e){
				l.unlock();
			}
			
		}else {
			System.out.println(Thread.currentThread().getName() + " Not able to get the lock hence performing alternative operations");
		}
	}
}

public class ReentrantLock3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread1 t1=new MyThread1("First Thread");
		MyThread1 t2=new MyThread1("Second Thread");
		t1.start();
		t2.start();
	}

}
