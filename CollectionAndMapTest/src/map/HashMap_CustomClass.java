package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.Vector;


public class HashMap_CustomClass {
	
	//自定义class需要重写equals和hashCode的方法,在没有重写方法之前，map的key值会有可能是两个一模一样的对象,在重写equals和hashCode方法之后，key值变不能为一模一样的两个对象
	//Map的key值最好不要是对象，此方法只是试验重写功能
	
	public static void main(String[] args) {
		Map<Car, Integer> map;
		Car chevron=new Car(123456);
		Car benz=new Car(123456);
		map=new HashMap<Car,Integer>();
		map.put(chevron, 0);
		map.put(benz, 1);
		System.out.println(map.size());
		Vector<Integer> v=new Stack<Integer>();
	}
}

class Car{
	int licenseNumber;
	public Car(int licenseNumber) {
		this.licenseNumber=licenseNumber;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj==null) {
			return false;
		}
		if(this==obj) {
			return true;
		}
		if(obj instanceof Car) {
			if(this.licenseNumber==((Car)obj).licenseNumber) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		int result=17;
		result=result*31+(licenseNumber==0?0:licenseNumber^(licenseNumber>>16));
		return result;
	}
}