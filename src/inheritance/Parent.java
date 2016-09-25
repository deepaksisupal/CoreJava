package inheritance;

public class Parent extends GrandParent{
	static {
		System.out.println("Inside static block in parent");
	}

	Parent() {
		System.out.println("Inside Parent Class default constructor");
	}
	
	void trigger(){
		System.out.println("Inside trigger() in Parent class");
	}
}
