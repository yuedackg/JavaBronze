public  class Main{
    public static void main( String[] args){
        ClassA.doMethod();
    }
}
class ClassA{
    [[1]] void doMethod(){
        System.out.println( "do something.");
    }
}