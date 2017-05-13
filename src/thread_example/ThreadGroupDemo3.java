package thread_example;

public class ThreadGroupDemo3 {
	public static void main(String args[]){
	ThreadGroup g1 = new ThreadGroup("First Group");
	System.out.println(g1.getParent().getName());
	ThreadGroup g2 = new ThreadGroup(g1,"second Group");
	System.out.println(g2.getParent().getName());
	}

}
