interface Bike{  //Its abstract by default. even all the methods. It's called as one interface, mutiple uses
    void applyBreak(int a);
    void speedUp(int b);
}
class Pulsar implements Bike{
    @Override
    public void applyBreak(int a){
        System.out.println("implimented class...break applied");
    }
    @Override
    public void speedUp(int b){
        System.out.println("implimented class...speed up");
    }

}
/* In English, interface is a point where two system meets and interacts. 
But in Java, interface is na group of related methods with empty bodies */

class InterfaceInJava{
    public static void main(String[] args){
        Pulsar obj = new Pulsar();
        obj.speedUp(5);
    }
}

/* You can implement one or more than interface by a class, but it's not possible for class. one class can't 
extend more than one class*/