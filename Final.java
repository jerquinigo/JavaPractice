//creating a class with final has its limits. You cannot create a subclass of a class thats final. 
//final public class Final {}

public class Final {
    // its good practice to have final variables capitalized so we dont confuse them with regular variables
    //final is like const in javascript
    final int MIN = 0;
    final int MAX = 5;
    static final double PI = 3.14159;

    //method using the final keyword
    final public void sayHi() {
        System.out.println("Hello world");
    }
    public static void main(String[] arg) {
        Final f = new Final();
        System.out.println(f.MAX);
        f.sayHi();
    }
}

// deleting public from this class so it can be in the same file
// class OtherClass extends Final {
    //this method will not work because you cant overwrite a method that has final. The only way this will work will be
    //to change the method name
//     public void sayHi() {
//         System.out.println("hello from the extended class");
//     }
// }