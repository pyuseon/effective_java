import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortList {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for(int i = 0; i < n; i++){
            String tmp = sc.nextLine();
            int value = Integer.parseInt(tmp);
            list.add(value);
        }
        sc.close();

        Collections.sort(list);
        Collections.reverse(list);

        for(Integer value : list){
            System.out.print(value + " ");
        }
    }

}
