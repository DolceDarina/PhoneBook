import java.util.*;

public class PhoneBook {
    private HashMap<String, HashSet<Integer>> phoneBook = new HashMap<>();

    public void add(String name, Integer phoneNum) {
        HashSet<Integer> phoneNumbers = phoneBook.getOrDefault(name, new HashSet<>());
        phoneNumbers.add(phoneNum);
        phoneBook.put(name, phoneNumbers);
    }

    public HashMap<String, HashSet<Integer>> getPhoneBook() {
        return phoneBook;
    }

    public void printSortedByPhoneCount() {
        List<Map.Entry<String, HashSet<Integer>>> entries = new ArrayList<>(phoneBook.entrySet());
        Collections.sort(entries, (a, b) -> Integer.compare(b.getValue().size(), a.getValue().size()));
        for (Map.Entry<String, HashSet<Integer>> entry : entries) {
            System.out.println(entry.getKey() + " - " + entry.getValue().size());
        }
    }
}
