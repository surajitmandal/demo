package thread_Concurrency;
import java.util.concurrent.locks.*;

class Display{
	
	ReentrantLock l =new ReentrantLock();
	
	public synchronized void wish(String name){
		
		l.lock();
		for(int i=0;i<=10;i++){
			System.out.print("Good Morning : ");
			try{
				Thread.sleep(2000);
			}catch(InterruptedException e){
				System.out.println("Exception is handaled  "+e);
			}
			System.out.println(name);
		}
		l.unlock();
	}
	
}