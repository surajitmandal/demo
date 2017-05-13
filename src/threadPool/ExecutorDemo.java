package threadPool;
import java.util.concurrent.*;


public class ExecutorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrintJob[] jobs= {  new PrintJob("RunnableJob-1"),
							new PrintJob("RunnableJob-2"),
							new PrintJob("RunnableJob-3"),
							new PrintJob("RunnableJob-4"),
							new PrintJob("RunnableJob-5"),
							new PrintJob("RunnableJob-6")  };
		
		ExecutorService service=Executors.newFixedThreadPool(3);
		for(PrintJob job: jobs){
			service.submit(job);
		}
		service.shutdown();

	}
	
}


class PrintJob implements Runnable{

	String name;
	PrintJob(String name){
		this.name=name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(name+"  ..Job started by " +Thread.currentThread().getName());
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(name + "job completed by "+Thread.currentThread().getName());
		
	}
	
}