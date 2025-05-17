abstract class SecretParent{ // a abstract class which holds the abstract method. only 1 abstract method transforms the whole class abstract. and we have to declare it
    abstract void display(int a); // a method is abstract which has no body

    void meth(){
        System.out.println("Parent class");
    }

    // abstract void NotOveridden(); ///here we have to override every abstract methods in the sub class or else have to declare the sub class as abstract
} 

class child extends SecretParent{
    void display(int a){
        System.out.println("Hi child");
    }
    void meth(){
        System.out.println("child class");
    }
    void extraClass(){
        System.out.println("Extra method in child class");
    }
}

class AbstractClassInJava{
    public static void main(String[] args) {
       // SecretParent obj = new SecretParent(); // we cant create object of abstract class
       child obj = new child();
       obj.display(5);
       obj.meth();


    }
}