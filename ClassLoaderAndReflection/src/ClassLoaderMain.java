import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
//
public class ClassLoaderMain {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		String classPath="G:\\Eclipseproject\\ClassLoaderAndReflection\\src\\Car.class";
		privateClassLoader myClassLoader=new privateClassLoader(classPath);
		Class<?> car=myClassLoader.loadClass("Car");
		
		System.out.println("¿‡º”‘ÿ∆˜ «"+car.getClassLoader());
		Method method=car.getDeclaredMethod("main",String[].class);
		Object object=car.newInstance();
		String[] arg= {"ad"};
		method.invoke(object, (Object)arg);

	}
}
