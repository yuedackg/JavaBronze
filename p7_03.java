public class SuperClass {
    private int num;
    public void setNum( int num){
        this.num = num;
    }
}

public class SubClass extends SuperClass{
    private int num;
    public int getNum(){
        return this.num;
    }
}

public class Main{
    public static void main( String [] args) {
        SubClass sub = new SubClass();
        sub.setNum( 10);
        System.out.println( sub.getNum());
    }
}