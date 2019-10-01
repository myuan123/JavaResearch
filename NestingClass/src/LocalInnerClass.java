
//Member Inner Class
public class LocalInnerClass {
	private static int i=1;
	private int j=20;
	private int k=20;
	
	public static void main(String[] args) {
		LocalInnerClass nct=new LocalInnerClass();
		//can only use innerClass reference in its nesting class
		//只能在嵌套类中使用innerClass 引用
		innerClass ic=nct.new innerClass();
		System.out.println("this is innerf1 function");
		ic.innerf1();
		System.out.println("this is innerf2 function");
		ic.innerf2();
		System.out.println("this is innerf3 function");
		ic.innerf3();
		System.out.println("this is innerf4 function");
		ic.innerf4();
	}
	
	public static void function1() {
	}
	
	public void function2() {
	}
	//can not use static function in nesting class
	//不能使用静态函数和静态类在嵌套类中
	class innerClass{
		//static int i=0;
		//static void f(){}
		int j=100;
		public int innerf1() {
			System.out.println(i);
			System.out.println(j);
			return 1;
		}
		
		//create an outer class object and call function
		//创建外部类的对象并调用其中的函数
		void innerf2() {
			LocalInnerClass test1=new LocalInnerClass();
			test1.function2();
		}
		
		//using object.static call outer class function or directly call outer class function
		//使用 object.static 的方法调用外部类或者直接调用外部函数
		
		void innerf3() {
			LocalInnerClass.function1();
			function1();
			function2();
		}
		
		void innerf4() {
			//call local variable
			//访问内部类变量
			System.out.println(j);
			System.out.println(this.j);
			
			//call outer class variable
			//访问外部变量
			LocalInnerClass NCT=new LocalInnerClass();
			System.out.println(NCT.j);
			System.out.println(LocalInnerClass.this.j);
			
		}
	}
}
class Test{
	//can use this way to call inner class's function;
	//可以使用这种方法调用内部类
	void c() {
		LocalInnerClass n=new LocalInnerClass();
		System.out.println(n.new innerClass().innerf1());
	}
	
}