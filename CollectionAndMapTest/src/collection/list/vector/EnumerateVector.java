package collection.list.vector;

import java.util.Enumeration;
import java.util.Vector;

//����ʹ��enumerateȥ����vector
public class EnumerateVector {
	public static void main(String[] args) {
		Vector<Integer> v=new Vector<Integer>();
		v.add(1);
		v.add(2);
		Enumeration<Integer> e=v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}
}
