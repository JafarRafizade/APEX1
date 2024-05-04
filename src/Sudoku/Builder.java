package Sudoku;

public class Builder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("My");
        String name= " name is Jafar";
        stringBuilder.append(name);
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.substring(0,8));

        System.out.println(stringBuilder.length());

        StringBuilder stringBuilder1 = new StringBuilder("Death smiles us at all, all a man can do is smile back");
        stringBuilder1.insert(0, "2024 ");
        stringBuilder1.append("------Marcus Aurelius");
        System.out.println(stringBuilder1);


    }
}
