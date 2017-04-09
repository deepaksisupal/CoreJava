package classesandinterfaces;

public class OuterClass {
	private int y=11;
	
	class InnerClass{
		/*
		 * The inner class is just a way to cleanly separate some functionality
		 * that really belongs to the original outer class. They are intended to
		 * be used when you have 2 requirements:
		 * 
		 * 1) Some piece of functionality in your outer class would be most clear
		 * if it was implemented in a separate class. 
		 * 
		 * 2) Even though it's in a separate class, the functionality is very closely tied to way that
		 * the outer class works. 
		 * 
		 * Given these requirements, inner classes have
		 * full access to their outer class. Since they're basically a member of
		 * the outer class, it makes sense that they have access to methods and
		 * attributes of the outer class -- including privates.
		 */
        private int x=10;
        public  void innerMethod(String... args){
        	System.out.println("Hello :: "+y); 
        	main("abc");
        }
    }

    public static void main(String... args){
        OuterClass.InnerClass xx = new OuterClass().new InnerClass();
        //innerMethod("asd");
        System.out.println("Hello :: "+xx.x); ///Why is this allowed??
        
    }
}
