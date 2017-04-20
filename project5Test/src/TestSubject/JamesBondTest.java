package TestSubject;

import org.junit.*;
import static org.junit.Assert.*;

import java.util.Scanner;

/**
 * The class <code>JamesBondTest</code> contains tests for the class <code>{@link JamesBond}</code>.
 *
 * @generatedBy CodePro at 4/19/17 11:27 PM
 * @author Hai Tran
 * @version $Revision: 1.0 $
 */
public class JamesBondTest {

	/**
	 * Run the Boolean bondRegex(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/17 11:52 PM
	 */
	@Test
	public void testCase0(){
	String a ="1 1 1 2 3";
	assertEquals( false, bondRegex(a));
	}
	@Test
	public void testCase1(){
	String a ="1 1 2 3";
	assertEquals( false, bondRegex(a));
	}
	@Test
	public void testCase2(){
	String a ="1 2 3";
	assertEquals( false, bondRegex(a));
	}
	@Test
	public void testCase3(){
	String a ="1 3";
	assertEquals( false, bondRegex(a));
	}
	@Test
	public void testCase4(){
	String a ="2 1 1 2 3";
	assertEquals( false, bondRegex(a));
	}
	@Test
	public void testCase5(){
	String a ="2 1 2 3";
	assertEquals( false, bondRegex(a));
	}
	@Test
	public void testCase6(){
	String a ="2 2 3";
	assertEquals( false, bondRegex(a));
	}
	@Test
	public void testCase7(){
	String a ="2 3";
	assertEquals( false, bondRegex(a));
	}
	@Test
	public void testCase8(){
	String a ="3";
	assertEquals( false, bondRegex(a));
	}
	@Test
	public void testCase9(){
	String a ="3 1 1 1 1 1 2 3";
	assertEquals( true, bondRegex(a));
	}
	@Test
	public void testCase10(){
	String a ="3 1 1 1 1 2 3";
	assertEquals( false, bondRegex(a));
	}
	@Test
	public void testCase11(){
	String a ="3 1 1 1 2 3";
	assertEquals( false, bondRegex(a));
	}
	@Test
	public void testCase12(){
	String a ="3 1 1 1 3";
	assertEquals( false, bondRegex(a));
	}
	@Test
	public void testCase13(){
	String a ="3 1 1 2 1 1 1 2 3";
	assertEquals( true, bondRegex(a));
	}
	@Test
	public void testCase14(){
	String a ="3 1 1 2 1 1 2 3";
	assertEquals( true, bondRegex(a));
	}
	@Test
	public void testCase15(){
	String a ="3 1 1 2 1 2 3";
	assertEquals( true, bondRegex(a));
	}
	@Test
	public void testCase16(){
	String a ="3 1 1 2 1 3";
	assertEquals( true, bondRegex(a));
	}
	@Test
	public void testCase17(){
	String a ="3 1 1 2 2 1 1 2 3";
	assertEquals( true, bondRegex(a));
	}
	@Test
	public void testCase18(){
	String a ="3 1 1 2 2 1 2 3";
	assertEquals( true, bondRegex(a));
	}
	@Test
	public void testCase19(){
	String a ="3 1 1 2 2 2 3";
	assertEquals( true, bondRegex(a));
	}
	@Test
	public void testCase20(){
	String a ="3 1 1 2 2 3";
	assertEquals( true, bondRegex(a));
	}
	@Test
	public void testCase21(){
	String a ="3 1 1 2 3";
	assertEquals( true, bondRegex(a));
	}
	@Test
	public void testCase22(){
	String a ="3 1 1 2 3 1 1 2 3";
	assertEquals( true, bondRegex(a));
	}
	@Test
	public void testCase23(){
	String a ="3 1 1 2 3 1 2 3";
	assertEquals( true, bondRegex(a));
	}
	@Test
	public void testCase24(){
	String a ="3 1 1 2 3 2 3";
	assertEquals( true, bondRegex(a));
	}
	@Test
	public void testCase25(){
	String a ="3 1 1 2 3 3";
	assertEquals( true, bondRegex(a));
	}
	@Test
	public void testCase26(){
	String a ="3 1 1 2 4 1 1 2 3";
	assertEquals( true, bondRegex(a));
	}
	@Test
	public void testCase27(){
	String a ="3 1 1 2 4 1 2 3";
	assertEquals( true, bondRegex(a));
	}
	@Test
	public void testCase28(){
	String a ="3 1 1 2 4 2 3";
	assertEquals( true, bondRegex(a));
	}
	@Test
	public void testCase29(){
	String a ="3 1 1 2 4 3";
	assertEquals( true, bondRegex(a));
	}
	@Test
	public void testCase30(){
	String a ="3 1 1 3";
	assertEquals( false, bondRegex(a));
	}
	@Test
	public void testCase31(){
	String a ="3 1 1 3 1 1 2 3";
	assertEquals( false, bondRegex(a));
	}
	@Test
	public void testCase32(){
	String a ="3 1 1 3 1 2 3";
	assertEquals( false, bondRegex(a));
	}
	@Test
	public void testCase33(){
	String a ="3 1 1 3 2 3";
	assertEquals( false, bondRegex(a));
	}
	@Test
	public void testCase34(){
	String a ="3 1 1 3 3";
	assertEquals( false, bondRegex(a));
	}
	@Test
	public void testCase35(){
	String a ="3 1 1 4 1 1 2 3";
	assertEquals( true, bondRegex(a));
	}
	@Test
	public void testCase36(){
	String a ="3 1 1 4 1 2 3";
	assertEquals( false, bondRegex(a));
	}
	@Test
	public void testCase37(){
	String a ="3 1 1 4 2 3";
	assertEquals( false, bondRegex(a));
	}
	@Test
	public void testCase38(){
	String a ="3 1 1 4 3";
	assertEquals( false, bondRegex(a));
	}
	@Test
	public void testCase39(){
	String a ="3 1 2 1 1 2 3";
	assertEquals( true, bondRegex(a));
	}
	@Test
	public void testCase40(){
	String a ="3 1 2 1 2 3";
	assertEquals( false, bondRegex(a));
	}
	@Test
	public void testCase41(){
	String a ="3 1 2 2 3";
	assertEquals( false, bondRegex(a));
	}
	@Test
	public void testCase42(){
	String a ="3 1 2 3";
	assertEquals( false, bondRegex(a));
	}
	@Test
	public void testCase43(){
	String a ="3 1 3";
	assertEquals( false, bondRegex(a));
	}
	@Test
	public void testCase44(){
	String a ="3 1 3 1 1 2 3";
	assertEquals( false, bondRegex(a));
	}
	@Test
	public void testCase45(){
	String a ="3 1 3 1 2 3";
	assertEquals( false, bondRegex(a));
	}
	@Test
	public void testCase46(){
	String a ="3 1 3 2 3";
	assertEquals( false, bondRegex(a));
	}
	@Test
	public void testCase47(){
	String a ="3 1 3 3";
	assertEquals( false, bondRegex(a));
	}
	@Test
	public void testCase48(){
	String a ="3 1 4 1 1 2 3";
	assertEquals( true, bondRegex(a));
	}
	@Test
	public void testCase49(){
	String a ="3 1 4 1 2 3";
	assertEquals( false, bondRegex(a));
	}
	@Test
	public void testCase50(){
	String a ="3 1 4 2 3";
	assertEquals( false, bondRegex(a));
	}
	@Test
	public void testCase51(){
	String a ="3 1 4 3";
	assertEquals( false, bondRegex(a));
	}
	@Test
	public void testCase52(){
	String a ="3 2 1 1 2 3";
	assertEquals( true, bondRegex(a));
	}
	@Test
	public void testCase53(){
	String a ="3 2 1 2 3";
	assertEquals( false, bondRegex(a));
	}
	@Test
	public void testCase54(){
	String a ="3 2 2 3";
	assertEquals( false, bondRegex(a));
	}
	@Test
	public void testCase55(){
	String a ="3 2 3";
	assertEquals( false, bondRegex(a));
	}
	@Test
	public void testCase56(){
	String a ="3 3";
	assertEquals( false, bondRegex(a));
	}
	@Test
	public void testCase57(){
	String a ="3 3 1 1 2 3";
	assertEquals( false, bondRegex(a));
	}
	@Test
	public void testCase58(){
	String a ="3 3 1 2 3";
	assertEquals( false, bondRegex(a));
	}
	@Test
	public void testCase59(){
	String a ="3 3 2 3";
	assertEquals( false, bondRegex(a));
	}
	@Test
	public void testCase60(){
	String a ="3 3 3";
	assertEquals( false, bondRegex(a));
	}
	@Test
	public void testCase61(){
	String a ="3 4 1 1 2 3";
	assertEquals( true, bondRegex(a));
	}
	@Test
	public void testCase62(){
	String a ="3 4 1 2 3";
	assertEquals( false, bondRegex(a));
	}
	@Test
	public void testCase63(){
	String a ="3 4 2 3";
	assertEquals( false, bondRegex(a));
	}
	@Test
	public void testCase64(){
	String a ="3 4 3";
	assertEquals( false, bondRegex(a));
	}
	@Test
	public void testCase65(){
	String a ="4 1 1 2 3";
	assertEquals( false, bondRegex(a));
	}
	@Test
	public void testCase66(){
	String a ="4 1 2 3";
	assertEquals( false, bondRegex(a));
	}
	@Test
	public void testCase67(){
	String a ="4 2 3";
	assertEquals( false, bondRegex(a));
	}
	@Test
	public void testCase68(){
	String a ="4 3";
	assertEquals( false, bondRegex(a));
	}

	private Boolean bondRegex(String a) {
		Scanner scan = new Scanner(a);
		int i=0;
		while(scan.hasNextInt()){
			i++;
		}
		if(i>=5) return true;
		return false;
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/19/17 11:52 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 4/19/17 11:52 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 4/19/17 11:27 PM
	 */
	
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(JamesBondTest.class);
	}
}