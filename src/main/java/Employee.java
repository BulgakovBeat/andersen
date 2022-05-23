import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Employee {
    private String surName;
    private String Name;
    private String middleName;
    private String jobPosition;
    private String mail;
    private String number;
    private String salary;
    private Integer age;

    @Override
    public String toString() {
        return "Employee{" +
                "surName='" + surName + '\'' +
                ", Name='" + Name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", jobPosition='" + jobPosition + '\'' +
                ", mail='" + mail + '\'' +
                ", number='" + number + '\'' +
                ", salary='" + salary + '\'' +
                ", age=" + age +
                '}';
    }
}

