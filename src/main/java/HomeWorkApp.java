public class HomeWorkApp {

    public static void main(String[] args) {
        Employee[] employees = new Employee[Constants.FIVE];

        employees[0] = new Employee("Blair", "Eric", "Arthur", "Writer",
                "GeorgeOrwell1984@gmail.com", "+25061903", "Infinity", 46);

        employees[1] = new Employee("Bulgakov", "Anatoliy", "Anatolievich", "Software Engineer",
                "blgkv1995@gmail.com", "+77472362954", "250000$", 27);

        employees[2] = new Employee("Bulgakov", "Mikhail", "Afanasyevich", "Writer",
                "masterisalive@gmail.com", "+15051981", "Infinity", 48);

        employees[3] = new Employee("Agüero del Castillo", "Sergio", "Leonel", "Footballer",
                "sergioaguero@gmail.com", "+9320", "4000000$", 33);

        employees[4] = new Employee("Nepomniachtchi", "Ian", "Alexandrovich", "chess player",
                "worldchampion2022@gmail.com", "+14071990", "1000000$", 31);

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}