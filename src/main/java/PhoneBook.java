import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class PhoneBook {
    private List<Human> phoneBookSet;

    public PhoneBook() {
        phoneBookSet = new ArrayList<>();
    }

    public void add(String surname, String number) {
        Human human = new Human(surname, number);
        phoneBookSet.add(human);
    }

    public List<Human> get(String surname) {
        List<Human> list = new ArrayList<>();
        for (Human human : phoneBookSet) {
            if (human.getSurname().equals(surname))
                list.add(human);
        }

        return list;
    }

    public void printPeopleBySurname(String surname) {
        List<Human> list = get(surname);
        if (list.size() == 0)
            System.out.println("The list for " + surname + " is empty");
        else {
            System.out.println("Number for " + surname + ":");
            list.forEach(x -> System.out.print(x.getNumber() + " "));
            System.out.println();
        }
    }
}
