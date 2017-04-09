package overloading;

public class OverloadingCalculation {
	void sum(String a,long b){System.out.println("a method invoked");}  
	  void sum(long a,int b){System.out.println("b method invoked");}  
	  
	  public static void main(String args[]){  
	  OverloadingCalculation obj=new OverloadingCalculation();  
	  //obj.sub(20,20);
	  }  
	  
	  public String sub(float a, int b){
		  return "";
	  }
	  public int sub(int a, float b){
		  return 1;
	  }
}
