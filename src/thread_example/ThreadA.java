package thread_example;

public class ThreadA {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ThreadB b=new ThreadB();
		b.start();
		synchronized (b) {
			System.out.println("Main Thread trying to call wait method on objject B");
			b.wait();
		}
		System.out.println("Main Thread got notification");
		System.out.println(b.total);

	}

}

class ThreadB extends Thread
{
	int total = 0;
	public void run(){
		
		synchronized(this){
		for(int i=1; i<=1000; i++){
			total = total+i;
			
		}
		System.out.println("Child Thread trying to give notification");
		this.notify();
		}
	}
}