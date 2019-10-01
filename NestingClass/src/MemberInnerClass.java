
public class MemberInnerClass {
	private static int i=100;
	private int s=1;
	public static void main(String[] args) {
		MemberInnerClass nct=new MemberInnerClass();
		//如果要访问局部内部类，只能访问函数，不能访问函数中的类
		nct.value(10);
	}
	
	public void value(final int k) {
		final int s=2;
		int i=1;
		//不能使用静态变量
		//static c=10;
		final int j=10;
		//only use default access modifier
		//只能使用默认修饰符
		class inner{
			int s=300;
			//can not use static field name
			//不能使用static 去修饰
			//static int m=20;
			inner(int k){
				System.out.println("constructor function");
			}
			int i=100;
			void f() {
				System.out.println(j);
				//访问静态变量
				System.out.println(MemberInnerClass.i);
				//访问外类非静态变量
				System.out.println(MemberInnerClass.this.s);
				//静态变量也可以这样访问
				System.out.println(MemberInnerClass.this.i);
			}
		}
		inner inner=new inner(k);
		//调用局部类中的函数只能在外部类中的方法中调用
		inner.f();
	}
}
