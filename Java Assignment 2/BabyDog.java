class Dog {
    Dog(){
        System.out.println("dog is Barking");
    }
}
class BabyDog extends Dog{
    BabyDog(){
        super();
        System.out.println("Babydog is Sleeping");
    }
    public static void main(String[] args) {
        BabyDog bd=new BabyDog();
    }
}
