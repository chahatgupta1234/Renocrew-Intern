// prac4.java
import basepackage.BaseClass;

public class prac4 extends BaseClass {
    void accessProperties() {
        // Uncommenting the next line will result in a compilation error:
        System.out.println(defaultProperty);
        
        // Accessing the protected property is allowed
        System.out.println(protectedProperty);
    }

    public static void main(String[] args) {
        prac4 subClassInstance = new prac4();
        subClassInstance.accessProperties();
    }
}
