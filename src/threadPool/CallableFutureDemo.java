package threadPool;
import java.util.concurrent.*;


public class CallableFutureDemo {

	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub

		MyCallable[] jobs={new MyCallable(10),
						new MyCallable(20),
						new MyCallable(30),
						new MyCallable(40),
						new MyCallable(50) };
	
		ExecutorService service=Executors.newFixedThreadPool(3);
		for(MyCallable job:jobs){
			@SuppressWarnings("unchecked")
			Future f= service.submit(job);
			System.out.println(f.get());
			
		}
		service.shutdown();
	}

}

class MyCallable implements Callable{
	int num;
	MyCallable(int num){
		this.num=num;		
	}
	@Override
	public Object call() throws Exception {
		// TODO Auto-generated method stub
		System.out.print(Thread.currentThread().getName()+  " is responsable to find suumof first " +num+ " numbers....:  ");
		int sum=0;
		for(int i=1;i<=num;i++){
			sum=sum+i;
		}			
		return sum;
	}
	
}