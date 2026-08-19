class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<HashMap<Character, Integer>, ArrayList<String>> bmap = new HashMap<>();

        for(String s : strs){
            HashMap<Character, Integer> map = new HashMap<>();
            for(char c : s.toCharArray()){
                map.put(c, map.getOrDefault(c, 0) + 1);
            }

            if(bmap.containsKey(map) == false){
                ArrayList<String> list = new ArrayList<>();
                list.add(s);
                bmap.put(map, list);
            }else{
                ArrayList<String> list = bmap.get(map);
                list.add(s);
            }
        }

        List<List<String>> res = new ArrayList<>(); 
        for(ArrayList<String> l : bmap.values()){
            res.add(l);
        }

        return res;
    }
}
