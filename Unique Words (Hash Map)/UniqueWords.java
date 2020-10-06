import java.util.HashMap;
import java.util.Map;

public class UniqueWords {

	public static void main(String[] args) {

		String str = "\"The quick brown fox jumps over the lazy dog\" is LOREM IPSUM an English-language pangram—a sentence that contains all of the letters of the alphabet. It is commonly used for touch-typing practice, testing typewriters and computer keyboards, displaying examples of fonts, and other applications involving text where the use of all letters in the alphabet is desired. Owing to its brevity and coherence, it has become widely known. \"The quick brown fox jumps over the lazy dog\" is an English-language pangram—a sentence that contains all of the letters of the alphabet. It is commonly used for touch-typing practice, testing typewriters and computer keyboards, displaying examples of fonts, and other applications involving text where the use of all letters in the alphabet is desired. Owing to its brevity and coherence, it has become widely known.";
		System.out.println("Starting....\n");
		
		String[] arr = str.toLowerCase().split("\\W+");

				
		HashMap<String, Integer> unique = new HashMap<>();
		for (String w : arr) {

			if (!unique.containsKey(w) && !w.isEmpty()) { 
				unique.put(w, 1);
			} else if (unique.containsKey(w)) {
				int old_value = unique.get(w) + 1;
				unique.put(w, old_value);
				
			}
		}
				
		System.out.println("NON unique words:");
		System.out.println("-----------------");
		for (Map.Entry entry : unique.entrySet()) {
			if ((Integer) entry.getValue() != 1) {
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}
		}
		
		Boolean flag = true;
		System.out.println("\nUnique words:");
		System.out.println("-------------");

		
		for (Map.Entry entry : unique.entrySet()) {
			if ((Integer) entry.getValue() == 1) {
				System.out.println(entry.getKey() + " : " + entry.getValue());
				flag = false;
			}
		}
		
		System.out.println("\nSearch is completed.");
		if (flag) {System.out.println("No unique word found.");}

	}

}
