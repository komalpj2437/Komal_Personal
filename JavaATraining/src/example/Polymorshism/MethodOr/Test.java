package example.Polymorshism.MethodOr;

class Parent{
    void  display(){
        System.out.println("Hello i am  from parents friend");
    }
}
class Child extends Parent {
    void display() {
        System.out.println("Hello i am from child friend");
    }
}
    public class Test{
        public static void main(String[] args) {
        Parent p = new Parent();
        p.display();
    }
 }
