package collection.set;

import java.util.Set;

public class HashSet {
	
	//当在HashSet中存自定义变量的时候，需要重写equals和hashcode函数
	
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
		
		//虽然创建了两个对象，但因为他们不是自写类，所以size只有1，set中只存在一个元素
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