import java.util.ArrayList;
import java.util.LinkedList;

//Nesting class can implement multiple extends
//嵌套类可以实现多继承
public class InnerClass extends B{
	public static void main(String[] args) {
		InnerClass n=new InnerClass();
		A a=n.new A();
		n.BB();
		a.CC();
	}
	class A extends C{
		
	}
}

class B{
	int i=0;
	int j=1;
	B(){
		System.out.println("B class");
	}
	void BB() {
		System.out.println("running BB function");
	}
}
class C{
	int i=11;
	int j=12;
	C() {
		System.out.println("C class");
	}
	void CC() {
		System.out.println("running CC function");
	}
}