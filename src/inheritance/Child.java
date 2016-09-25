package inheritance;

public class Child extends Parent{
	static {
		System.out.println("Inside static block in Child");
		//new Child().trigger(); Possible, just like main method execution
	}

	Child() {
		System.out.println("Inside Child Class default constructor");
	}
	
	void trigger(){
		System.out.println("Inside trigger() in Child class");
	}
	
	public static void main(String[] args){
		new Child().trigger();
	}
}
/**
With out any parent:
Inside static block in Child
Inside Child Class default constructor
Inside trigger() in Child class
 * */
/**
with extends Parent:
Inside static block in parent
Inside static block in Child
Inside Parent Class default constructor
Inside Child Class default constructor
Inside trigger() in Child class
 * */
/**
Child extends Parent, Parent extends GrandParent
Inside static block in GrandParent
Inside static block in parent
Inside static block in Child
Inside GrandParent Class default constructor
Inside Parent Class default constructor
Inside Child Class default constructor
Inside trigger() in Child class
**/