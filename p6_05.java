public  class A{
    public A(){
        System.out.println( "A");
    }
}

public  class B extends A {
    public B(){
        System.out.println( "B");
    }
}

public  class Main{
    public static void main( String[] args){
        B b = new B();
    }
}