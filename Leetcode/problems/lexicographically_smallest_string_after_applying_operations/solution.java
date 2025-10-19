class Solution {
    private char add(int n,int a){
        int ans = (n + a) % 10;
        return (char)(ans + '0');
    }
    public String findLexSmallestString(String s, int a, int b) {
        int len = s.length();
        TreeSet<String> set = new TreeSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.add(s);

        while (!queue.isEmpty()) {
            s = queue.poll();
            if (set.contains(s)) continue;
            set.add(s);

            StringBuilder sb;
            for(int n = 0 ; n < 10 ; n++){
                sb = new StringBuilder(s);
                for (int i = 1; i < len; i += 2) {
                    sb.setCharAt(i, add(sb.charAt(i) - '0', a));
                }
                if (!set.contains(sb.toString())) queue.offer(sb.toString());
            }
            sb = new StringBuilder(s);
            String rotated = sb.substring(len - b) + sb.substring(0, len - b);
            if (!set.contains(rotated)) queue.offer(rotated);
        }
        return set.first();
    }
}
