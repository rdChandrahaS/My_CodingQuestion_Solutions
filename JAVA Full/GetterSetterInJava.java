class GetterSetter{
    private int id;
    private String name;

    public void setName(String a){
        this.name=a;
    }
    public String getName(){
        return name;
    }

    public void setId(int n){
        this.id=n;
    }
    public int getId(){
        return id;
    }

}
class GetterSetterInJava{
    public static void main(String[] args){
        GetterSetter s = new GetterSetter();
        s.setName("Rajdeep");
        System.out.println(s.getName());
        s.setId(100);
        System.out.println(s.getId());
    }
}