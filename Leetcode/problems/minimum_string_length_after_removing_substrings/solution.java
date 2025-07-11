class Solution {
    public int minLength(String s) {
        StringBuilder str = new StringBuilder(s);

        int indexAB = str.indexOf("AB");
        if(indexAB != -1) str.delete(indexAB, indexAB+2);

        int indexCD = str.indexOf("CD");
        if(indexCD != -1) str.delete(indexCD, indexCD+2);

        return s.equals(str.toString())?s.length():minLength(str.toString());
    }
}