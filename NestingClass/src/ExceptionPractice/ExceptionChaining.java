package ExceptionPractice;

public class ExceptionChaining {
	static void f() throws ExceptionB{
		throw new ExceptionB("exception b");
	}
	
	static void g() throws ExceptionC{
		try {
			f();
		}catch(ExceptionB e) {
			ExceptionC c=new ExceptionC("ExceptionC c");
			c.initCause(e);
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