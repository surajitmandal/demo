
public class TestThreadgroup extends Thread {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName()  );
	//	System.out.println(Thread.currentThread().getThreadGroup().getParent().list());
		TestThreadgroup t1 = new TestThreadgroup();
		
		t1.start();
		System.out.println(t1.getThreadGroup().getName() + t1.getName());
		TestThreadgroup t2 = new TestThreadgroup();
		
		t2.start();
		System.out.println(t2.getThreadGroup().getName() + t2.getName());
	}

	public void run(){
		
		for(int x=0;x<10;x++){

			System.out.println(x);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
