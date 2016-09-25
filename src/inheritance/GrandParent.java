package inheritance;

public class GrandParent {
	static {
		System.out.println("Inside static block in GrandParent");
	}

	GrandParent() {
		System.out.println("Inside GrandParent Class default constructor");
	}
	
	void trigger(){
		System.out.println("Inside trigger() in GrandParent class");
	}
}
