import java.util.*;

class Student implements Comparable<Student>{
    private String name;
    private int score;


    public String getName(){
        return this.name;
    }

    public int getScore(){
        return this.score;
    }

    public Student(String name, int score){
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(Student s){
//        return s.getScore() - getScore();
        return getScore() - s.getScore();
    }
}


class StudentSort {

    public static void main(String[] args){
        List<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for(int i = 0; i < n; i++){
            String tmp = sc.nextLine();
            String[] input = tmp.split(" ");
            String name = input[0];
            int score = Integer.parseInt(input[1]);
            list.add(new Student(name, score));
        }
        sc.close();

        Collections.sort(list);

        for(Student student: list){
            System.out.print(student.getName() + " ");
        }
    }
}
