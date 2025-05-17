// string is immutable in java.so we use string builder
class StringBuilderInJava{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Sony");
        System.out.println(sb);

    //character at 0
        System.out.println(sb.charAt(0));

    //change character in string at any index
        sb.setCharAt(0,'T'); //cant add word because we're replacing a character with character only
        System.out.println(sb);

    //insert character in string at any index
        sb.insert(3,"nig"); // we can insert character as well as word here too
        System.out.println(sb);

    //delete character in string at any index
        sb.delete(2,3);
        System.out.println(sb);

    //append character in string 
        sb.append(" Stark"); // append means basically adding in the end
        System.out.println(sb);
/*
String st = "H";       for string builder.. and its fast too  
st = st + "e";       st.append("e");
st = st + "l";       st.append("l");
st = st + "l";       st.append("l");
st = st + "o";       st.append("o");
*/

        
    
    }
}