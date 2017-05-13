package mypack;

class Testarray{  
static void max(int arr[]){
	int Max =arr[0];
	for(int i=0;i<arr.length;i++){
		if(Max<arr[i])
			Max=arr[i];
	}
	System.out.println("Max number in Array is :"+Max);
}
public static void main(String args[]){  
  
	int a[]={33,3,4,5,19,1,0,35,87,654,253};
	max(a);
  
//printing array  
for(int i=0;i<a.length;i++)//length is the property of array  
System.out.println(a[i]);  
  
for(int i=0;i<args.length;i++)  
System.out.println(args[i]);


}
}  