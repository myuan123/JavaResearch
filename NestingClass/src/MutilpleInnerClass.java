

public class MutilpleInnerClass {
	public static void main(String[] args) {
		MNA test=new MNA();
		
		//ֱ�ӷ��ʷ��ʲ���
		//test.function1();
		MNA.A a=test.new A();
		MNA.A.C c=a.new C();
		
		//�����ڲ��������Է���ԭ����private �ı����ͺ���
		c.transparent();
	
		//����ֱ�ӷ��ʾ�̬�����еľ�̬����
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