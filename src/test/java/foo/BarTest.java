package foo;

import org.junit.Test;
import static org.junit.Assert.*;

public class BarTest {
	
	@Test 
	public void testBar() {
		Bar b = new Bar("Progress");
		assertEquals("Progressbar",b.getText());
	}
	
	@Test 
	public void testCamelBar() {
		Bar b = new Bar("Progress",true,false);
		assertEquals("ProgressBar",b.getText());
	}

	@Test 
	public void testFrenchBar() {
		Bar b = new Bar("Progress",false,true);
		assertEquals("le Progressbar",b.getText());
	}	

	@Test 
	public void testFrenchBar() {
		Bar b = new Bar("Progress",true,true);
		assertEquals("le ProgressBar",b.getText());
	}

}