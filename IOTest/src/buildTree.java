import java.util.ArrayList;

public class buildTree {
	public static void main(String[] args) {
		buildTree b=new buildTree();
		TreeNode t=new TreeNode(1);
		t.left=new TreeNode(2);
		t.right=new TreeNode(3);
		t.left.left=new TreeNode(4);
		t.left.right=new TreeNode(5);
		t.right.left=new TreeNode(6);
		t.right.right=new TreeNode(7);
		ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
		
		b.print(t,1,list);
		for(ArrayList<Integer> level:list) {
			for(Integer i:level) {
				System.out.print(i+"  ");
			}
			System.out.println();
		}
	}

	private void print(TreeNode root,int index,ArrayList<ArrayList<Integer>> list) {
		// TODO Auto-generated method stub
		ArrayList<Integer> level=new ArrayList<Integer>();
		if(list.size()<index) {
			list.add(level);
		}else {
			level=list.get(index-1);
		}
		level.add(root.value);
		if(root.left!=null) {
			print(root.left,index+1,list);
		}
		if(root.right!=null) {
			print(root.right,index+1,list);
		}
	}
}

class TreeNode{
	int value;
	TreeNode left=null;
	TreeNode right=null;
	public TreeNode(int value){
		this.value=value;
	}
	public TreeNode(){};
}