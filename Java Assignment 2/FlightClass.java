public class FlightClass {
    long flightNumber;
    String destination;
    int duration;
    public FlightClass(){
        System.out.println("Destination is Arrived");
    }
    public FlightClass(long fno,String des,int dur){
        flightNumber=fno;
        destination=des;
        duration=dur;
        System.out.println(fno+" Flight will arrive at "+des+" in "+dur+" Hours");
    }
    public static void main(String[]args){
        FlightClass obj2=new FlightClass(242237,"hyderabad",2);
        FlightClass obj1= new FlightClass();
    }
}
