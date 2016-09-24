package iPlusPlus;

public class TrickyCases {
	public static void main(String[] args){
		case2();
	}

	public static void case1(){
		int i = 1;
		int j = 1;
		/**i++ assigns or uses the the value in i then it performs i = i+1**/
		System.out.println("i++ = "+ i++);//Prints : i++ = 1
		/**++i increments first then it uses/assigns the incremented value**/
		System.out.println("++j = "+ ++j);//Prints : ++j = 2
		
		System.out.println();
		System.out.println("i = "+ i);//i = 2
		System.out.println("j = "+ j);//j = 2
	}
	
	public static void case2(){
		int i = 1;
		int j = 1;
		/**i-- assigns or uses the the value in i then it performs i = i-1**/
		System.out.println("i-- = "+ i--);// Prints : i-- = 1 
		/**--i does i = i -1 first then it uses/assigns the incremented value**/
		System.out.println("--j = "+ --j);//Prints : ++j = 2
		
		System.out.println();
		System.out.println("i = "+ i);//i = 2
		System.out.println("j = "+ j);//j = 2
	}
}
