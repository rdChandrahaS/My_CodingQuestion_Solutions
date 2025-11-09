class Pair{
    String name;
    int height;
    public Pair(String name,int height){
        this.name = name;
        this.height = height;
    }
}
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Pair[] pairs = new Pair[names.length];
        for(int i = 0 ; i < names.length ; i++){
            pairs[i] = new Pair(names[i],heights[i]);
        }
        Arrays.sort(pairs, (a,b)->b.height-a.height);
        for(int i = 0 ; i < names.length ; i++){
            names[i] = pairs[i].name;
        }
        return names;
    }
}