package interfaces;

// an interface is declared using the Java interface keyword.
//declared public or package scope (no access modifier).

public abstract interface MyInterface extends MySuperInterface,MySuperSuperInterface{//interface can extend multiple interfaces
	//The return types are incompatible for the inherited methods MySuperInterface.blinker(String), MySuperSuperInterface.blinker(String)
	//interface can extend multiple interfaces
	
	public String hello = "Hello";//In the implementing class we cannot change the variable value which is declared in the interface as it is final by default
	
	public void sayHello();//by default, public and abstract
}
