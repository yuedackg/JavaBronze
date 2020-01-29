public  class A{
    public void methodA() {
        System.out.println( "A");
    }
}

public class B{
    public void methodB(){
        System.out.println( "c");
    }
}

public class C extends A{
    public void methodC(){
        System.out.println( "C");
    }
}

public class Sample extends C {
    //  no more code.
    
}