class parent{
   parent(){
       System.out.println("In parent constructor");
   }
}
class child extends parent{
    child(){
        System.out.println("In child constructor");
    }
}
class Inheritance2InJava{
    public static void main(String[] args) {
       parent pt = new parent();
       child cd = new child(); 
    }
}