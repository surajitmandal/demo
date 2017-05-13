package thread_Concurrency;

public class SynchronizedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display d=new Display();
		//Display d2=new Display();
		MyThread t1=new  MyThread(d,"Dhoni");
		MyThread t2=new  MyThread(d,"Yuvraj");
		t1.start();
		t2.start();

	}

}
