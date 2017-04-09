interface Octopus {
	    public void munch(String s);
	}
public class OverRiding implements Octopus{
	 public void munch(Object s) {
	        System.out.println("munched an object");
	    }

	@Override
	public void munch(String s) {
		// TODO Auto-generated method stub
		
	}
}
