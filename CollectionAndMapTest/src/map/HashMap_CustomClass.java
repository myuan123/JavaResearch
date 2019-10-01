package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.Vector;


public class HashMap_CustomClass {
	
	//�Զ���class��Ҫ��дequals��hashCode�ķ���,��û����д����֮ǰ��map��keyֵ���п���������һģһ���Ķ���,����дequals��hashCode����֮��keyֵ�䲻��Ϊһģһ������������
	//Map��keyֵ��ò�Ҫ�Ƕ��󣬴˷���ֻ��������д����
	
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