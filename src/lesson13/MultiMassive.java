package lesson13;

public class MultiMassive {
    public static void main(String[] args) {
        int[][] numbers = {{1,3,5},
                           {2,4,6},
                           {12,16,20}};
        for(int i = 0; i<numbers.length; i++) {
            for(int j = 0; j<numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(numbers[1][1]);




       String[][] strings = new String[1][3];
       strings[0][2] = "Здраствуйте";
       System.out.println(strings[0][2]);
    }
}
