
public class MemberInnerClass {
	private static int i=100;
	private int s=1;
	public static void main(String[] args) {
		MemberInnerClass nct=new MemberInnerClass();
		//���Ҫ���ʾֲ��ڲ��ֻ࣬�ܷ��ʺ��������ܷ��ʺ����е���
		nct.value(10);
	}
	
	public void value(final int k) {
		final int s=2;
		int i=1;
		//����ʹ�þ�̬����
		//static c=10;
		final int j=10;
		//only use default access modifier
		//ֻ��ʹ��Ĭ�����η�
		class inner{
			int s=300;
			//can not use static field name
			//����ʹ��static ȥ����
			//static int m=20;
			inner(int k){
				System.out.println("constructor function");
			}
			int i=100;
			void f() {
				System.out.println(j);
				//���ʾ�̬����
				System.out.println(MemberInnerClass.i);
				//��������Ǿ�̬����
				System.out.println(MemberInnerClass.this.s);
				//��̬����Ҳ������������
				System.out.println(MemberInnerClass.this.i);
			}
		}
		inner inner=new inner(k);
		//���þֲ����еĺ���ֻ�����ⲿ���еķ����е���
		inner.f();
	}
}
