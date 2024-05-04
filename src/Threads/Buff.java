package Threads;

public class Buff {

    StringBuffer name;
    StringBuffer surname;
    String birthYear;

    public Buff(StringBuffer name, StringBuffer surname, String birthYear) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
    }


    public void nickname(StringBuffer name, String surname, String birthYear){
        name.append(" ").append(surname).append(" ").append(birthYear);
        System.out.println(name);

    }
}
