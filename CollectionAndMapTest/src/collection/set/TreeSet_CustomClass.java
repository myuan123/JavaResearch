package collection.set;

import java.util.Iterator;
import java.util.TreeSet;

//在TreeSet中放入自定义类需要实现Comparable的接口
public class TreeSet_CustomClass {
	public static void main(String[] args) {
		Integer i=new Integer(1);
		Car benz=new Car(123456);
		Car toyota=new Car(654321);
		Car chevron=new Car(321456);
		TreeSet<Car> set=new TreeSet<Car>();
		set.add(benz);
		set.add(toyota);
		set.add(chevron);
		Iterator it=set.iterator();
		while(it.hasNext()) {
			System.out.println(((Car)it.next()).licenseNumber);
		}
	}
}

class Car implements Comparable<Car>{
	int licenseNumber;
	public Car(int licenseNumber) {
		this.licenseNumber=licenseNumber;
	}
	public int compareTo(Car o) {
		// TODO Auto-generated method stub
		if(this.licenseNumber>o.licenseNumber) {
			return 1;
		}
		if(this.licenseNumber<o.licenseNumber) {
			return -1;
		}
		if(this.licenseNumber==o.licenseNumber) {
			return 0;
		}
		return 0;
	}
}