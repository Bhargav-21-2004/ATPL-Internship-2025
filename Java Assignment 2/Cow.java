class Animal {
    void makeSound(){
        System.out.println("Animal is sounding");
    }    
}
class Dog extends Animal{
    void makeSound(){
        System.out.println("dog is barking");
    }
}
class Cat extends Animal{
    void makeSound(){
        System.out.println("cat is sounding");
    }
}
public class Cow extends Animal{
    void makeSound(){
        System.out.println("cow is sounding");
    }
public static void main(String[]args){
    Animal obj1=new Dog();
    Animal obj2=new Cat();
    Animal obj3=new Cow();
    obj1.makeSound();
    obj2.makeSound();
    obj3.makeSound();
}
}

