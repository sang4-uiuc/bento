import java.util.*; 
  
public class FindAnagrams { 
  
    private static void printAnagrams(String arr[]) 
    { 
        HashMap<Integer, List<String> > map = new HashMap<>(); 
        for (String word: arr) {
            char[] w = word.toCharArray();
            Arrays.sort(w);
            String newWord = new String(w);
            int n = newWord.hashCode(); 
            if (map.containsKey(n)) { 
                List<String> words = map.get(n); 
                words.add(word); 
                map.put(n, words); 
            } 
            else { 
                List<String> words = new ArrayList<>(); 
                words.add(word); 
                map.put(n, words); 
            } 
        }

        for (Integer i : map.keySet()) { 
            List<String> values = map.get(i); 
            if (values.size() > 1) { 
                System.out.println(values); 
            } 
        } 
    } 
  
    public static void main(String[] args) 
    { 
        String arr[] = { "vase", "bat", "gods", "latte", "name", "apres", "spit", 
        "joke", "ham", "dog", "act", "tale", "parse", "pits", "asper", "tab",
        "table", "mane", "late", "god", "cat", "table", "save", "spare"
    };
        printAnagrams(arr); 
    } 
} 