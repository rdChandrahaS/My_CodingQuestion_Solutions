class animalia{
    public void display(){
        System.out.println("Parent class display ");
    }
    public int show(){
        System.out.println("Parent class show");
        return 0;
    }
}

class mamal extends animalia{
    @Override //only allowed when override is happening . its not mandetory, its just a notation to see if overrde happens or not
    public void display(){
        System.out.println("Child class display ");
    }

    @Override
    public int show(){
        System.out.println("Child class show");
        return 0;
    }

    void meth(){
        System.out.println("Hi");
    }
}

class DynamicMethodDispatchInJava{
    public static void main(String[] args) {
/*      mamal obj = new mamal();
        animalia obj = new animalia(); 
          
        mamal obj = new mamal(); not possible*/

// super obj = new sub 
        animalia obj = new mamal(); // super class referance obj =  new referance mamal which is child class
        obj.display(); // here object is created of sub class. so the output will be from sub class

        // obj.meth(); not possible because it only calls override methods
/* Here its called Dynamic Method Dispatch because here the object willcreate on the runtime of the code */
    }
}