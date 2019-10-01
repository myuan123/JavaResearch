

public class MutilpleInnerClass {
	public static void main(String[] args) {
		MNA test=new MNA();
		
		//直接访问访问不到
		//test.function1();
		MNA.A a=test.new A();
		MNA.A.C c=a.new C();
		
		//利用内部函数可以访问原来是private 的变量和函数
		c.transparent();
	
		//可以直接访问静态函数中的静态变量
		MNA.D.DD();
	}
}

class MNA{
	private void function1() {
		System.out.println("function 1");
	}
	class A{
		private void function2() {
			System.out.println("function 2");
		}
		public class C{
			void transparent() {
				function1();
				function2();
			}
		}
	}
	
	static class D{
		void D(){
			System.out.println("visit D inner Class");
		}
		static void DD() {
			System.out.println("this is static function");
		}
	}
}