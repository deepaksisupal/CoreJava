package exceptions;

public class TEst {

	static void display(){
		throw new RuntimeException();
	}
	public static void main(String[] args) {
		try{
			display();
		}catch(Exception e){
			throw new NullPointerException();
		}finally{
			try{
				display();
			}catch(NullPointerException e){
				System.out.println("caught");
			}
			System.out.println("exit");
		}

	}

}
