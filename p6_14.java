public  class Main{
    public  static void main( String [] args){
        Book b = new Book();
        b.print();
    }
}
class Book{
    private String title;
    private int price;
    public  Book(){
        //  コードの挿入

    }
    public  Book(　String title , int price ) {
        this.title = title;
        this.price = price;
    }
    public void print( ){
        System.out.println( title + "," + price);
    }

}