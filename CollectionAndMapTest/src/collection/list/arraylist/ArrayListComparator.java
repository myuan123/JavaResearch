package collection.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListComparator {
	protected class Car{
		String licenseNumber;

		double length;
		int doorCount;
		public Car() {
		}
		public Car(String licenseNumber, double length, int doorCount) {
			this.licenseNumber=licenseNumber;

			this.length=length;
			this.doorCount=doorCount;
		}
	}
	
	public static void main(String[] args) {
		List<Car> list=new ArrayList<Car>();
		ArrayListComparator ac=new ArrayListComparator();
		list.add(ac.new Car("123456",1.23456,4));
		list.add(ac.new Car("123789",1.3421,4));
		list.add(ac.new Car("789456",1.221,5));
		
		//按照汽车长度排序
		Collections.sort(list,new Comparator<Car>() {
			public int compare(Car o1, Car o2) {
				// TODO Auto-generated method stub
				if(o1.length-o2.length<0) {
					return -1;
				}
				if(o1.length-o2.length>0) {
					return 1;
				}
				if(o1.length==o2.length) {
					return 0;
				}
				return 0;
			}
		});
		for(Car a:list) {
			System.out.println(a.length);
		}
	}
}
