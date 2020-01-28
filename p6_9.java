public class Main{
     public static void main(String[] args) {
        ClassA classA = new ClassA();
        classA.doMethod(0);
    }
}
class ClassA{
    public void doMethod() {
        system.out.println( "doMethod-A");
    }
    public void doMethod( int a) {
        system.out.println("doMethod-B");
    }
}

public void Account( int balance ){
    this.balance = balance;
}

public Account( ){
    this.balance = 0;
}

public static Account( ){
    this.balance = 0;
}

public constractor(int balance){
    this
}