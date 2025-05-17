class CallByAndPassByReferance{

    //change an Integer
    static void changeInteger(int x){
        x=100;
    }

    //change an array
    static void changeArray(int[] arr){
        arr[0]=100;
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9,10}; // Here one array object creates. a is just a referance
        int b=10;
        changeInteger(b); /* here, the value of b will be copied , not the referance */

        changeArray(a); /* If we pass an object (ie. array,string etc) in java like this, the address(or referance)
        the main object will be denoted there. so any changes in the called function will remain same in the calling function too
        . just like pass by referance. here the whole object will not be copied in the called function, only the address 
        or the referance will be copied. because here both the arr and a are refering the same objecr*/

        System.out.println("Integer after change : "+b+ ", Array after change : "+a[0]);   
    }
}