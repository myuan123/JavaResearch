package collection.list.vector;

import java.util.List;
import java.util.Vector;

// ��ԭvector�е�һ��ֵ�ı��ˣ�sublist���γɵ�һ���µ�ֵҲ��ı�
public class SublistTest {
	public static void main(String[] args) {
		Vector<Integer> v=new Vector<Integer>();
		v.add(1);
		v.add(2);
		v.add(3);
		List<Integer> sublistResult=new Vector<Integer>();
		sublistResult=v.subList(0, 2);
		v.set(0, 4);
		System.out.println("sublistResult value in index 0 "+sublistResult.get(0));
		System.out.println("previous sublistResult value in index 1 "+sublistResult.get(1));
		v.set(1, 5);
		System.out.println("afterwards sublistResult value in index 1 "+sublistResult.get(1));
	}
}
