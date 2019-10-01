
//candy.java
class Candy {
    static {
        System.out.println("loading Candy");
    }
}
//cookie.java
class Cookie {
    static {
        System.out.println("loading Cookie");
    }
}
//Gum.java
class Gum {
    static {
        System.out.println("loading Gum");
    }
}
//TestMain.java
public class TestMain {
    public static void main(String[] args) {
        System.out.println("inside main");
        new Candy();
        System.out.println("After create Candy");
        try {
            Class.forName("com.RuntimeTypeInformation.Gum");
        } catch (ClassNotFoundException e) {
            System.out.println("Could not find Class");
        }
        System.out.println("After Class.forName");
        new Cookie();
        System.out.println("After new Cookie()");
    }
    static void printClassInfo(Class c){
        System.out.println("Class Name :"+c.getName()
                    +"is interface? :" + c.isInterface()
                    +"simple Name "+ c.getSimpleName()
                    );       
        
    }
}