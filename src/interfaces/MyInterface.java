package interfaces;

// an interface is declared using the Java interface keyword.
//declared public or package scope (no access modifier).

public abstract interface MyInterface extends MySuperInterface,MySuperSuperInterface{//interface can extend multiple interfaces
	public String hello = "Hello";
	public void sayHello();//by default, public and abstract
}
