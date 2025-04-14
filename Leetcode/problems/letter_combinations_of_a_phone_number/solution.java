class Solution {
    public static List<String> stringRepresentation(String s){
        List<String> str = new LinkedList<>();
        switch(s){
            case "2":str.addAll(Arrays.asList("a","b","c"));
                break;
            case "3":str.addAll(Arrays.asList("d","e","f"));
                break;
            case "4":str.addAll(Arrays.asList("g","h","i"));
                break;
            case "5":str.addAll(Arrays.asList("j","k","l"));
                break;
            case "6":str.addAll(Arrays.asList("m","n","o"));
                break;
            case "7":str.addAll(Arrays.asList("p","q","r","s"));
                break;
            case "8":str.addAll(Arrays.asList("t","u","v"));
                break;
            case "9":str.addAll(Arrays.asList("w","x","y","z"));
                break;
        }
        return str;
    }

    public static List<String> possibilities(LinkedList<String> answer,LinkedList<String> digits){
        List<String> final_ans = new LinkedList<String>();
        List<String> digit_replaced=stringRepresentation(digits.removeFirst());
        for(int i=0;i<answer.size();i++){
            for(int j=0;j<digit_replaced.size();j++){
                final_ans.add(answer.get(i)+digit_replaced.get(j));
            }
        }        
        if(digits.isEmpty()){return final_ans;}
        else {return possibilities(new LinkedList<>(final_ans),digits);} 
    }
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0){return new LinkedList<>();}

        List<String> digit = new LinkedList<String>();
        digit.addAll(Arrays.asList(digits.split("")));

        List<String> ans = stringRepresentation(digit.removeFirst());
        if(digits.length()==1){return ans;}
        else{return possibilities(new LinkedList<>(ans),new LinkedList<>(digit));}
    }
}