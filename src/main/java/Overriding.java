class Child{
    static void  print(){
        System.out.println("child_class");
    }
}
class Parent extends Child{
    static void print(){
        System.out.println("parent class");
    }
}
public class Overriding {
    public static void main(String[] args){
        Child child=null;
        child.print();
    }

}
