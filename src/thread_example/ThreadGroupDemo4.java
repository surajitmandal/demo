package thread_example;

class MyThread extends Thread{
	public MyThread(ThreadGroup g, String name) {
		super(g,name);
	}
	public void run(){
		System.out.println("Child Thread");
		try{
			Thread.sleep(2000);
		}catch (InterruptedException e) {
			System.out.println("I am interupted  "+e);
		}
	}
}

public class ThreadGroupDemo4 {

	public static void main(String args[]) throws InterruptedException{
		ThreadGroup pg =new ThreadGroup("ParentGroup");
		ThreadGroup cg =new ThreadGroup(pg, "ChildGroup");
		MyThread t1 = new MyThread(pg,"ChildThread1");
		MyThread t2 = new MyThread(pg,"ChildThread2");
		t1.start();
		//t1.interrupt();
		t2.start();
		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
		pg.list();
		Thread.sleep(5000);
		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
		System.out.println(cg.getName());
		pg.list();
		
	}
}
