

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
		//�ⲿ����Է����ڲ���ľ�̬��Ա
		System.out.println(Inner.i);
		//�ⲿ����Է����ڲ���ķǾ�̬��Ա��ʵ��������
		System.out.println(new Inner().j);
	}
	public Inner vistInnerClass() {
		return new Inner();
	}
	//��̬�ڲ��������public, protected, private����
	static class Inner{
		static int i=10;
		int j=100;
		//�������ⲿ����������غ�
		//��̬�ڲ���ֻ�ܷ��ʾ�̬��Ա
		static void f1() {
			System.out.println(NestedClass.i);
		}
		public void f2(){
		//��̬�ڲ��಻�ܷ����ⲿ��ķǾ�̬��Ա
		//System.out.println(NestedClass.j);
		//function2();
			function1();
		}
	}
}
class Test1{
	//�ṩһ��visitInnerClass �Ľӿڿ���������������ڲ���
	void test() {
		NestedClass nc=new NestedClass();
		nc.vistInnerClass().f1();
		nc.vistInnerClass().f2();
	}
	void test1() {
		NestedClass nc=new NestedClass();
	}
	
}
