
//Member Inner Class
public class LocalInnerClass {
	private static int i=1;
	private int j=20;
	private int k=20;
	
	public static void main(String[] args) {
		LocalInnerClass nct=new LocalInnerClass();
		//can only use innerClass reference in its nesting class
		//ֻ����Ƕ������ʹ��innerClass ����
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
	//����ʹ�þ�̬�����;�̬����Ƕ������
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
		//�����ⲿ��Ķ��󲢵������еĺ���
		void innerf2() {
			LocalInnerClass test1=new LocalInnerClass();
			test1.function2();
		}
		
		//using object.static call outer class function or directly call outer class function
		//ʹ�� object.static �ķ��������ⲿ�����ֱ�ӵ����ⲿ����
		
		void innerf3() {
			LocalInnerClass.function1();
			function1();
			function2();
		}
		
		void innerf4() {
			//call local variable
			//�����ڲ������
			System.out.println(j);
			System.out.println(this.j);
			
			//call outer class variable
			//�����ⲿ����
			LocalInnerClass NCT=new LocalInnerClass();
			System.out.println(NCT.j);
			System.out.println(LocalInnerClass.this.j);
			
		}
	}
}
class Test{
	//can use this way to call inner class's function;
	//����ʹ�����ַ��������ڲ���
	void c() {
		LocalInnerClass n=new LocalInnerClass();
		System.out.println(n.new innerClass().innerf1());
	}
	
}