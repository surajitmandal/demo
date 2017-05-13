package SerializationExample;

import java.io.*;  
class Depersist{  
 public static void main(String args[])throws Exception{  
    
  ObjectInputStream in=new ObjectInputStream(new FileInputStream("D:\\testout.txt"));  
  Student s=(Student)in.readObject();  
  System.out.println(s.id+" "+s.name+" "+s.age);  
  
  in.close();  
 }  
}  