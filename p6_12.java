public class Main{
    public  static void main( String[] args){
        Document d = new Document( "James");
        d.printOwner();
    }
}
class Document {
    private String owner;

    public Document(){
        this.owner = "none";
    }
    public Document( String name){
        this.owner = owner;
    }
    public void printOwner( ){
        System.out.println( owner);
    }
}