class ArrayInJava{
    public static void main(String[] args) {
        int a[] ;
        a = new int[10] ; //new keyword creates object.you can write it as
        /* int a[]=new int[10] */
        int b[]={1,2,3,4,5,6}; 
        for (int i = 0; i < 10; i++) { //Dynamic initialisation of array
            a[i]=i;
        }
        System.out.println(b.length); // length peoperty returns array length
    }
    }