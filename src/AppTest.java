import org.junit.Test;
import org.junit.Assert;

public class AppTest {
	@Test
	public void firstTest(){
		System.out.println("checking first test...");
		Assert.assertEquals(45, 65-15);
	}
	@Test
	public void secondTest(){
		System.out.println("checking second test...");
		Assert.assertTrue(49==49);
	}
}
