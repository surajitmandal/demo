class A{  
void m(){System.out.println("hello m");}  
  
@Deprecated  
void n(){System.out.println("hello n");}  
}  

class TestAnnotation2{  
	 int b=1;
public static void main(String args[]){  
  
A a=new A();  
a.n();  
}}  