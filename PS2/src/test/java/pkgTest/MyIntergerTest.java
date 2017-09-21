package pkgTest;

import org.junit.Test;

import pkgMain.MyInterger;

public class MyIntergerTest {

	@Test
	public void isEven() {
		MyInterger myInt = new MyInterger(6);
		assertTrue(myInt.isEven,true);
	}

}
