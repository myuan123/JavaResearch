package ExceptionPractice;
//我们可以看到exceptionB是被new 出来了，并且被执行，但是打印路径的时候少了一个exceptionB
//这种情况我们称为异常丢失情况，需要用异常链来保存异常信息
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
