package abstractClasses;

public abstract class Cat {
	Integer COUNT = 10;
	 abstract void clean();
}
/*
 * An abstract class may contain any number of methods including zero. 
 * 
 * The methods can be abstract or concrete. 
 * Abstract methods may not appear in a class that is not abstract. 
 * 
 * The first concrete subclass of an abstract class is required to implement all abstract methods that were not implemented by a
 * superclass. 
 * 
 * Notice that we said three ways. There are plenty of other ways.
 * For example, you could have the clean() method throw a RuntimeException.
 */
