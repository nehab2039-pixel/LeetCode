class Solution {
    public int countWords(String[] words1, String[] words2) {
      
        HashMap<String, Integer> m1 = new HashMap<>();
        HashMap<String, Integer> m2 = new HashMap<>();

        for (String s : words1) {
            m1.put(s, m1.getOrDefault(s, 0) + 1);
        }

        for (String s : words2) {
            m2.put(s, m2.getOrDefault(s, 0) + 1);
        }

        int count = 0;

        for (String s : words1) {
            if (m1.get(s) == 1 && m2.getOrDefault(s, 0) == 1) {
                count++;
                m1.put(s, 0);
            }
        }

        return count;
        
    }
}