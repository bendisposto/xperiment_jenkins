package foo;

import org.junit.Test;
import static org.junit.Assert.*;

public class BarTest {
	
	@Test 
	public void testBar() {
		Bar b = new Bar("Progress");
		assertEquals("Progressbar",b.getText());
	}
	
}