package thread_example;

public class ThreadLocalDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadLocal<String> tl =new ThreadLocal<String>(){
			public String initialValue(){
				return "abc";
			}
		};
		System.out.println(tl.get());
		tl.set("Durga");
		System.out.println(tl.get());
		tl.remove();
		System.out.println(tl.get());

	}

}
