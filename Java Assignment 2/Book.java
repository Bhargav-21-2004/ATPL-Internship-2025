class Book
{
    String title;
    String author;
    int price;
    void discount(String title,String author,int price,double Discount)
    {
        double finalprice=price-(price*(Discount/100));
        System.out.println("the final price:"+finalprice);
    }
        public static void main(String[]args)
    {
        Book obj1=new Book();
        Book obj2=new Book();
        Book obj3=new Book();
        obj1.discount("java","james gosling",500,15);
        obj2.discount("python","ganvadio rasum",400,10); 
        obj3.discount("wings of fire","APJ abdul kalam",200,10);
    }
}
