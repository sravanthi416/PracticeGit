package second;

import com.alacriti.StringManipulation;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	StringManipulation sm=new StringManipulation();
    	sm.concatinting("Sravanthi");
    	System.out.println("is string equal "+ sm.equal("sravanthi","sravanthi"));
    	sm.length("nimmi");
        System.out.println( "Hello World!" );
    }
}
