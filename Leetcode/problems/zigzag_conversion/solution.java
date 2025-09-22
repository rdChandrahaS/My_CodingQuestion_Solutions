class Solution {
    public String convert(String s, int numRows) {
        int len = s.length();
        if(numRows == 1 || numRows >=len)return s;
        char[][] ch = new char[numRows][len];
        int chPos = 0;
        int row = 0;
        int col = 0;
        while(chPos < len){
            // Vertical Down
            while(chPos < len && row < numRows){
                ch[row][col] = s.charAt(chPos);
                chPos++;
                row++;
            }
            row = numRows-2;
            col += 1;

            // Diagonal up
            while(chPos < len && row >= 0){
                ch[row][col] = s.charAt(chPos);
                chPos++;
                row--;
                col++;
            }
            row = 1;
            col--;
        }
        StringBuilder sb = new StringBuilder();
        for(char[] a : ch){
            for(char b : a){
                if(b != '\0'){
                    sb.append(b);
                }
            }
        }
        return sb.toString();
    }
}

/**
3--->14
3

 */