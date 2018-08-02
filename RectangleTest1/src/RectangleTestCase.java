import static org.junit.Assert.*;

import org.junit.Test;

import com.techlabs.RectangleTest1.Rectangle;

public class RectangleTestCase {

	@Test
	public void test() {
		Rectangle rectangle=new Rectangle();
		rectangle.setHeight(5);
		rectangle.setWidth(10);
		int setlength=rectangle.getHeight();
		int setbreadth=rectangle.getWidth();
		int area=rectangle.CalculateArea();
		assertEquals(50,area);
	}
	
	@Test
	public void testColor() {
		Rectangle rectangle=new Rectangle();
		rectangle.setColor("FaintYellow");
		String colour=rectangle.checkColor();
		assertTrue("red" == colour);
	}
	
	@Test
	public void testParrameter()
	{

		Rectangle rectangle=new Rectangle();
		rectangle.setHeight(5);
		rectangle.setWidth(10);
		int setlength=rectangle.getHeight();
		int setbreadth=rectangle.getWidth();
		assertEquals(5,setlength);
		assertEquals(10,setbreadth);
	}

	@Test
	public void BreadthLessThan100(){
		Rectangle rectangle=new Rectangle();
		rectangle.setWidth(10);
		assertTrue(rectangle.getWidth()>1 && rectangle.getWidth()<100);
	}
	
	@Test
	public void AreaShouldLessThan1000()
	{
		Rectangle rectangle=new Rectangle();
		rectangle.setHeight(5);
		rectangle.setWidth(10);
		assertTrue(rectangle.CalculateArea()<1000);
		
	}
}
