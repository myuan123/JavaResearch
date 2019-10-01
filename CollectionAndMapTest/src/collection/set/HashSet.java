package collection.set;

import java.util.Set;

public class HashSet {
	
	//����HashSet�д��Զ��������ʱ����Ҫ��дequals��hashcode����
	
	public static void main(String[] args) {
		Set<Cat> s=new java.util.HashSet<Cat>();
		s.add(new Cat("123"));
		s.add(new Cat("123"));
		Cat c=new Cat("123");
		s.add(c);
		Cat d=c;
		s.add(d);
		System.out.println("size of set that stores custom class "+s.size());
		
		Set<String> ss=new java.util.HashSet<String>();
		ss.add("123");
		ss.add("123");
		System.out.println("size of set that stores two similar String "+ss.size());
		
		//��Ȼ�������������󣬵���Ϊ���ǲ�����д�࣬����sizeֻ��1��set��ֻ����һ��Ԫ��
		Set sss=new java.util.HashSet<java.util.HashSet<Integer>>();
		Set s1=new java.util.HashSet<Integer>();
		s1.add(1);
		Set s2=new java.util.HashSet<Integer>();
		s2.add(1);
		sss.add(s1);
		sss.add(s2);
		System.out.println("size of set that stores two similar hashset "+sss.size());
	}
}

class Cat{
	String name;
	public Cat(String name) {
		this.name=name;
	}
}