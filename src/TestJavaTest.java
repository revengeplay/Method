
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestJavaTest {


//	@Test
//	public void getFileDatatTest() {
//	    
//		String path = "C:\\pleiades\\2023-06\\workspace\\Method\\src\\test.txt";
//	    
//		String result = Utill.getFileData(path);
//		
//	    assertEquals("testtest", result);
//	}
//	
//
//	@Test
//	public void getTodayTostringTest() {
//	    
//		String format = "yyyy/MM/dd";
//	    
//		String result = Utill.getTodayTostring(format);
//		
//		
//		assertEquals("2023/10/04" ,result);
//	}
//	
//	@Test
//	public void getReverseStringTestNormal() {
//	    
//		String inputStr = "abc";
//	    
//		String result = Utill.getReverseString(inputStr);
//		
//		assertEquals("cba" ,result);
//	}
//	
//	@Test
//	public void getReverseStringTestNull() {
//	    
//		String inputStr = ;
//	    
//		String result = Utill.getReverseString(inputStr);
//		
//		assertEquals("cba" ,result);
//	}
    @Before
    public void setUp() throws Exception {
        System.out.println("@Before");
    }
    
    @After
    public void tearDown() throws Exception {
        System.out.println("@After");
    }
	@Test
	public void getLeftPadTestNormal() {
	    
		String inputStr = "abc";
		String length = "5";
	    
		String actualValue = Utill.getLeftPad(inputStr,length);
		
		assertEquals("  abc" ,actualValue);
		System.out.println("getLeftPadTestNormalTest");
	}
	
	@Test
	public void getLeftPadTestNull() {
	    
		String inputStr = null;
		String length = "5";
	    
		String actualValue = Utill.getLeftPad(inputStr,length);
		
		assertEquals("",actualValue);
		System.out.println("getLeftPadTestNullTest");
	}
	
	@Test
	public void getLeftPadTestLowLength() {
	    
		String inputStr = "abc";
		String length = "2";
	    
		String actualValue = Utill.getLeftPad(inputStr,length);
		
		assertEquals("ab" ,actualValue);
		System.out.println("getLeftPadTestLowLengthTest");
	}
	
	@Test
	public void getLeftPadTestEmpty() {
	    
		String inputStr = "";
		String length = "5";
	    
		String actualValue = Utill.getLeftPad(inputStr,length);
		
		assertEquals("" ,actualValue);
		System.out.println("getLeftPadTestEmptyTest");
	}


}