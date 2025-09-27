class Solution {
    private int map(char s){
        return switch(s){
            case 'I'->1;
            case 'V'->5;
            case 'X'->10;
            case 'L'->50;
            case 'C'->100;
            case 'D'->500;
            default ->1000;
        };
    }

    public int romanToInt(String s) {
        if(s.length() < 2) return map(s.charAt(0));
        int sum = 0;
        for(int i = 0 ; i < s.length()-1 ; i++){
            char prev = s.charAt(i);
            char next = s.charAt(i+1);
            if(map(prev) >= map(next)) sum += map(prev);
            else{
                sum += (map(next) - map(prev));
                i++;
            }
        }
        if(map(s.charAt(s.length()-2)) >= map(s.charAt(s.length()-1))) sum += map(s.charAt(s.length()-1));
        return sum;
    }
}