package Bridge;

public class Test {
	static {
    	int x=5;
    }
    static int x,y;
	    public static void main(String args[]) {
	        int i = 0;
	        i = i++ + i;
	        System.out.println("I = " + i);
	        int[] a=new int[] {1,2};
	        int[] b=new int[] {1,2};
	        System.out.println(a.equals(b));
	        System.out.println(x);
	        int x=0;
	        int y=0;
	    }
	    
	    
}
