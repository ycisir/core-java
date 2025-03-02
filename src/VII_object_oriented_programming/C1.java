package VII_object_oriented_programming;

public class C1 extends C2 implements InterfaceOne, InterfaceTwo {
	public void m1() {
		System.out.println(x);
	}
	
	public void m2() {
		System.out.println(y);
	}
	
	public static void main(String[] args) {
		C1 cobjC1=new C1();
		cobjC1.m1();
		cobjC1.m2();
		cobjC1.m3();
	}

}
