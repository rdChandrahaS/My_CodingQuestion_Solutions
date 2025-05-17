class usingConstructor{
    private int id;
    private String name;

    public usingConstructor(int a,String s) {  //this also supports constructor overloading
        this.id=a;
        this.name=s;
        System.out.println("This is in constructor.");
    }
    void display(){
        System.out.println("id :"+id+ " "+"Name : "+name);
    }
}
class ConstructorInJava{
    public static void main(String[] args) {
        usingConstructor us = new usingConstructor(3,"Rajdeep");
        us.display();

    }
}