class Solution {
    public String sortVowels(String s) {
        Queue<Character> loc = new PriorityQueue<>(); 
        StringBuilder sb = new StringBuilder();
        char[] temp = s.toCharArray();
        for(char ch: temp){
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                loc.offer(ch);
            }
        }
        for(char ch: temp){
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                char t = loc.poll();
                sb.append(t);
            }else sb.append(ch);
        }
        return sb.toString();
    }
}