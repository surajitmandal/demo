package mypack;
class TestStringConcatenation1{  
	 public static void main(String args[]){  
	   String s="Sachin"+" Tendulkar";  
	   System.out.println(s);//Sachin Tendulkar  
	   s=(new StringBuilder()).append("Sachin").append(" Tendulkar 1").toString(); 
	   System.out.println(s);//Sachin Tendulkar 
	 }  
	}  