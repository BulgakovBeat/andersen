import java.util.HashMap;

public class HomeWorkApp {

    public static void main(String[] args) {
        firstTask();

        secondTask();
    }

    private static void secondTask() {
        System.out.println("Second Task: ");
        PhoneBook phoneBook = new PhoneBook();

        ///////////////////
        phoneBook.add("Bulgakov", "+77477777777");
        phoneBook.add("Esenin", "+7701555555");
        phoneBook.add("Bulgakov", "+870777750520");

        ///////////////////
        phoneBook.printPeopleBySurname("Bulgakov");

        ///////////////////
        phoneBook.printPeopleBySurname("Esenin");

        ///////////////////
        phoneBook.printPeopleBySurname("Karyakin");
        System.out.println();
    }

    private static void firstTask() {
        System.out.println("First Task: ");
        String[] mas = new String[] {"a", "b" , "c", "d", "e", "aa", "bb", "a", "ee", "d", "r", "q","z"};

        uniqueElements(mas);
        System.out.println();
    }

    private static void uniqueElements(String[] mas) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String i : mas) {
            map.put(i, 1 + map.getOrDefault(i, 0));
        }

        map.forEach((key, value) -> System.out.println("key: " + key + " amount: " + value));
    }
}

