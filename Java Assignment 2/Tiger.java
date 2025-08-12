class Lion {
    final void sound()
    {
        System.out.println("Lion is roaring");
    }
}
class Tiger extends Lion{
    void sound(){
        System.out.println("Tiger is roaring");
    }
    public static void main(String[]args){
        Tiger t=new Tiger();
        t.sound();
    }
}

