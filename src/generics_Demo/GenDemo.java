package generics_Demo;

public class GenDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gen <String> g1=new Gen<String>("Durga");
		g1.show();
		System.out.println(g1.getob());
		
		Gen <Integer> g2=new Gen<Integer>(10);
		g2.show();
		System.out.println(g2.getob());
		
		Gen <Double> g3=new Gen<Double>(10.5);
		g3.show();
		System.out.println(g3.getob());

	}

}

class Gen<T>{
	T ob;
	Gen(T ob){
		this.ob=ob;
		}
	public void show(){
		System.out.println("The type of ob is"+ ob.getClass().getName());
	}
	public T getob(){
		return ob;
	}
}
