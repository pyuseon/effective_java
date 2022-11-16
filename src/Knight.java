import java.util.Scanner;

public class Knight {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println(input);

        int col = input.charAt(0) - 'a';
        int row = input.charAt(1) - '1';
        System.out.println("col number : " + col);
        System.out.println("row number : " + row);

        int result = 0;
        int[][] direction = {{-2, 1}, {-2, -1}, {2, 1}, {2, -1}, {-1, -2}, {-1, 2}, {1, -2}, {1, 2}};


        for (int i =0;  i < 8 ; i ++){
            int nr = row + direction[i][0];
            int nc = col + direction[i][1];

            if(nr < 0 || nr > 7 || nc < 0 || nc > 7)
                 continue;
            result++;
        }
        System.out.println(result);
    }
}