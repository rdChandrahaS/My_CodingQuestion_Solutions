class RandomizedSet {
    List<Integer> temp = new ArrayList<>();
    public RandomizedSet() {
        
    }
    
    public boolean insert(int val) {
        if(temp.contains(val)) return false;
        else {
            temp.add(val);
            return true;
        }
    }
    
    public boolean remove(int val) {
        if(temp.contains(val)){
            temp.remove(Integer.valueOf(val));
            return true;
        }else return false;
    }
    
    public int getRandom() {
        Random rand = new Random();
        int randomNum = rand.nextInt(temp.size());
        return temp.get(randomNum);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */