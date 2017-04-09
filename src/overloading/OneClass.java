package overloading;

public class OneClass {

	 public Object r(Number a) {
	        return new String("hi number");
	    }

	    public Object r(Integer a) {
	        return "hi Integer";//covariant
	    }
	    
	    public String r(int a) throws CloneNotSupportedException {
	    	throw new CloneNotSupportedException();
	        //return "hi int";//covariant
	        
	    }
	    
	    
	    public static void main(String...a) throws CloneNotSupportedException{
	    	System.out.println(new OneClass().r(1));
	    	
	    }
}
