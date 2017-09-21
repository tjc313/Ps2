package pkgMain;

public class MyInterger {
	
	private int iValue;
	public Object isEven;
	

	public MyInterger(int iValue) {
		this.iValue = iValue;
	}
	public boolean isEven() {
		return (iValue % 2 == 0 ? true : false);
		// 		evaluates this    returns 1st if true and 2nd if false
		// replaces if else statement
	}
	
	public static boolean isEven(int iValue) {
		MyInterger myInt = new MyInterger(iValue);
		return myInt.isEven();
		
	}
	
	public boolean isOdd() {
		return !isEven(iValue);
	}
	
	public boolean isEquals(int iValue) {
		if (iValue == iValue)
			return true;
		else
			return false;
	}

	
}
