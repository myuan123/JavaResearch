
public class MyClassLoader {
	public static void main(String[] args) {
		//当前类加载器,为AppClassLoader
		System.out.println(Thread.currentThread().getContextClassLoader());
		//System上面的类由Bootstrap的类加载器写的
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
