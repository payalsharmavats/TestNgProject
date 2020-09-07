import org.testng.annotations.Test;

public class GroupingDemo {
	@Test(groups="smoke")
public void m1() {
	System.out.println("m1-smoke");
}
	@Test(groups="sanity")
	public void m2() {
		System.out.println("m2-sanity");
	}
	@Test(groups="regression")
	public void m3() {
		System.out.println("m3-regression");
	}
	@Test(groups="smoke")
	public void m4() {
		System.out.println("m4-smoke");
	}
	@Test(groups="sanity")
	public void m5() {
		System.out.println("m5-sanity");
	}
	@Test(groups="functional")
	public void m6() {
		System.out.println("m6-functional");
	}
}
