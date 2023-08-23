package lesson12;

public class Massive_string {
    public static void main(String[] args) {
        int[] numbers = new int[4];
        numbers[0] = 10;
        String[] strings = new String[3];
        strings[0] = "Hello ";
        strings[2] = "Goodbye";
        for(int i = 0; i<strings.length; i++) {
            System.out.println(strings[i]);
        }
        System.out.println();
        for(String string:strings){
            System.out.println(string);
        }
    }
}
