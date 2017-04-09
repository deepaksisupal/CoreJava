package overloading;

interface Octopus {
    Object eat(int a);
    Object eat(Integer a);
}

public class BabyOctopus implements Octopus {
	
    public String eat(int a) {
        return "feed me!";
    }
    
	public Object eat(Integer a) {
		return "kill somebody";
	}
    public Object eat(Number a) {
		return "lazy me";
	}
    public static void main(String[] args) {
        BabyOctopus babyOctopus = new BabyOctopus();
        Octopus octopus = babyOctopus;
        String s = babyOctopus.eat(1);
        System.out.println(s);
        // this gives a compile error:
        // s = c.test();
        //
        // but this works:
         s = (String) octopus.eat(1);
         System.out.println(s);
    }
}
