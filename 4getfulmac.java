import java.util.scanner;

public class 4getfulmac {
	public static void main( String[] args ) {
		Scanner keyboard = new scanner(System.in);
		
		System.out.println( "What city is the capital of France? ");
		keyboard.next();
		
		System.out.println( "What is 6 multiplied by 7?" );
		keyboard.nextint();
		
		System.out.println( "Enter a number 0.0 and 1.0." );
		keyboard.nextdouble();
		
		System.out.println( "Is there anything else you would like to say?" );
		keyboard.next();
	}
}