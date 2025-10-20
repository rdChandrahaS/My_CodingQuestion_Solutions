class Solution {
    private String morse(char a){
        return switch(a){
            case 'a'->".-";
            case 'b'->"-...";
            case 'c'->"-.-.";
            case 'd'->"-..";
            case 'e'->".";
            case 'f'->"..-.";
            case 'g'->"--.";
            case 'h'->"....";
            case 'i'->"..";
            case 'j'->".---";
            case 'k'->"-.-";
            case 'l'->".-..";
            case 'm'->"--";
            case 'n'->"-.";
            case 'o'->"---";
            case 'p'->".--.";
            case 'q'->"--.-";
            case 'r'->".-.";
            case 's'->"...";
            case 't'->"-";
            case 'u'->"..-";
            case 'v'->"...-";
            case 'w'->".--";
            case 'x'->"-..-";
            case 'y'->"-.--";
            case 'z'->"--..";
            default ->"";
        };
    }
    public int uniqueMorseRepresentations(String[] words) {
        if(words.length==1)return 1;
        HashSet<String> set = new HashSet<>();
        for(String word : words){
            StringBuilder str = new StringBuilder();
            for(char ch : word.toCharArray()){
                str.append(morse(ch));
            }
            set.add(str.toString());
        }
        return set.size();
    }
}