package ExceptionPractice;
//���ǿ��Կ���exceptionB�Ǳ�new �����ˣ����ұ�ִ�У����Ǵ�ӡ·����ʱ������һ��exceptionB
//����������ǳ�Ϊ�쳣��ʧ�������Ҫ���쳣���������쳣��Ϣ
public class ExceptionPractice{
	static void f() throws ExceptionB {
		throw new ExceptionB("exception b");
	}
	static void g() throws ExceptionC{
		try {
			f();
		}catch(Exception B){
			ExceptionC c=new ExceptionC("exception a");
			throw c;
		}
	}
	public static void main(String[] args) {
		try {
			g();
		}catch(ExceptionC e) {
			e.printStackTrace();
		}
	}
}

class ExceptionA extends Exception{
	public ExceptionA(String str) {
		System.out.println("enter exception area A");
	}
}

class ExceptionB extends ExceptionA{
	public ExceptionB(String str) {
		super(str);
		System.out.println("enter exception area B");
	}
}

class ExceptionC extends ExceptionB{
	public ExceptionC(String str) {
		super(str);
		System.out.println("enter exception area C");
	}
}
