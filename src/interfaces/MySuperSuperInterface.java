package interfaces;

public interface MySuperSuperInterface {

	void blink();// If two interface have methods with same signature and same
					// return type then the implementing class can implement any
					// one of those.

	//String blinker(String a);// The return types are incompatible for the
								// inherited methods
								// MySuperInterface.blinker(String),
								// MySuperSuperInterface.blinker(String)
	// If two interface have methods with same signature and different return
	// type cannot be implemented at the same time
}
