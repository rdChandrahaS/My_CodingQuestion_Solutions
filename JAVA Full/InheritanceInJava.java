class parent{
    int id;
    String name;
    parent(){
        System.out.println("Parent constructor with no argument");
    }

    parent(int a, String b){
        id=a;
        name=b;
        System.out.println("In parent constructor. ");
    }

    public void display(){
        System.out.println("In Parent class."+id+name);
    } 
}
class child extends parent{ 
    int mobile;  
    String st; 
    child(int id,String name,int b){  //this will call 
        super(2,"hi"); // this is to call parent constructor with arguments  
        //super(id,name); // takes the value of id and name from parent class

        mobile=b;
        System.out.println("In child constructor");
        System.out.println("id and name in child from parent + extra integer"+id+" "+name+" "+mobile);
    }
    public void display(){
        System.out.println("In Child : "+ id + name + mobile);
    }

}


class InheritanceInJava{
    public static void main(String[] args) {
        parent p=new parent(20,"private");
        child cd=new child(1,"hi",3);
        p.display();
        cd.display();
    }
}