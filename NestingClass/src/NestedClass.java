

public class NestedClass {
	private static int i=1;
	private int j=10;
	public static void main(String[] args) {
		Inner i=new Inner();
		NestedClass nestedClass=new NestedClass();
		System.out.println("run test class ");
		Test1 t=new Test1();
		t.test(); 
	}
	public static void function1() {
		int j=10;
	}
	public void function2() {
	}
	
	public void function3_outer() {
		//外部类可以访问内部类的静态成员
		System.out.println(Inner.i);
		//外部类可以访问内部类的非静态成员，实例化即可
		System.out.println(new Inner().j);
	}
	public Inner vistInnerClass() {
		return new Inner();
	}
	//静态内部类可以用public, protected, private修饰
	static class Inner{
		static int i=10;
		int j=100;
		//可以与外部类的名称相重合
		//静态内部类只能访问静态成员
		static void f1() {
			System.out.println(NestedClass.i);
		}
		public void f2(){
		//静态内部类不能访问外部类的非静态成员
		//System.out.println(NestedClass.j);
		//function2();
			function1();
		}
	}
}
class Test1{
	//提供一个visitInnerClass 的接口可以让其他类访问内部类
	void test() {
		NestedClass nc=new NestedClass();
		nc.vistInnerClass().f1();
		nc.vistInnerClass().f2();
	}
	void test1() {
		NestedClass nc=new NestedClass();
	}
	
}
