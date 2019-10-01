package VolatileTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicInteger;

public class TestAtomatic {
	public AtomicInteger inc=new AtomicInteger();
	
	public void increase() {
		inc.getAndIncrement();
	}
	
	
	
	public static void main(String[] args) {
		ArrayList<Integer> array=new ArrayList<Integer>();
		ArrayList<Integer> array1=new ArrayList<Integer>();
		System.out.println(array.equals(array1));
		
		final TestAtomatic ta=new TestAtomatic();
		for(int i=0;i<10;i++) {
			new Thread() {
				public void run() {
					for(int j=0;j<1000;j++) {
						ta.increase();
					}
				}
			}.start();
		}
		while(Thread.activeCount()>1) {
			Thread.yield();
		}
		System.out.println(ta.inc);
	}
}

class Node{
	int i=0;
	int j=0;
	public Node() {
		
	}
}
