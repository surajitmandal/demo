package thread_example;

class TestJoinMethod1 extends Thread{  
	TestJoinMethod1(String s){
		super(s);
	}
	TestJoinMethod1(){};
	
	 public void run(){  
	  for(int i=1;i<=5;i++){  
	   try{  
	    Thread.sleep(500);  
	   }catch(Exception e){System.out.println(e);}  
	  System.out.println(i+" value "+this.getName()+this.getPriority() );  
	  }  
	 }  
	 
	public static void main(String args[]){  
	 TestJoinMethod1 t1=new TestJoinMethod1("Thread1");  
	 TestJoinMethod1 t2=new TestJoinMethod1("Thread2");  
	 TestJoinMethod1 t3=new TestJoinMethod1("Thread3");  
	 t1.start();  
	 t1.setPriority(MIN_PRIORITY);
	 try{  
	  t1.join();  
	 }catch(Exception e){System.out.println(e);}  
	 
	 
	 t2.start();  
	 t2.setPriority(MIN_PRIORITY); 
	 t3.start();  
	 t3.setPriority(MAX_PRIORITY); 
	 }  
	}  