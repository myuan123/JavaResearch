
public class MyClassLoader {
	public static void main(String[] args) {
		//��ǰ�������,ΪAppClassLoader
		System.out.println(Thread.currentThread().getContextClassLoader());
		//System���������Bootstrap���������д��
		System.out.println(System.class.getClassLoader());
		//
		System.out.println(ClassLoader.getSystemClassLoader());
		if(ClassLoader.getSystemClassLoader().getParent()!=null) {
			System.out.println(ClassLoader.getSystemClassLoader().getParent());
		}
		System.out.println(ClassLoader.getSystemClassLoader().getParent().getParent());
		try {
			System.out.println(ClassLoader.getSystemClassLoader().getParent().getParent().getParent());
		}catch(NullPointerException e) {
			System.out.println("there is not parent anymore");
		}
	}
}
