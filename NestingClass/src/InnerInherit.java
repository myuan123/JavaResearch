
public class InnerInherit extends WithInner.Inner{
	
	InnerInherit(WithInner wi){
		wi.super();
		System.out.println("this is a constructor in InheritInner");
	}
	
	public static void main(String[] args) {
		WithInner wi=new WithInner();
		InnerInherit ii=new InnerInherit(wi);
	}
}

class WithInner{
	class Inner{
		Inner(){
			System.out.println("this is a constructor in WithInner.Inner");
		}
	}
}
