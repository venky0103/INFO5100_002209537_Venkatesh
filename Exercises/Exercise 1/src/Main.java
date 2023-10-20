import sessions.Session;
import students.FullTime;
import students.PartTime;
import students.Student;

import java.util.Random;

public class Main {
    public static void main(String[] args){
        Random rand = new Random();
        Student[] students = new Student[20];
        for(int i = 0;i < 10;i++){
            int[] quizscores = new int[15];

            for(int j = 0;j < 15;j++){
                quizscores[j] = 6 + rand.nextInt(5);
            }
            students[i] = new PartTime("Venky", "a1" + i, quizscores);
        }
        for(int i = 0;i < 10;i++){
            int[] quizscores = new int[15];
            for(int j = 0;j < 15;j++){
                quizscores[j] = 6 + rand.nextInt(5);
            }
            students[10 + i] = new FullTime("Manoj", "f1" + i, 70 + rand.nextInt(31), 70 + rand.nextInt(31), quizscores);
        }
        Session s = new Session(students);
        //s.describeSession();
        s.getEachStudentAverage();

        int[] scores = s.getOrderedQuizScores();
        for(int i = 0;i < 300;i++){
            System.out.print(scores[i] + ", ");
        }

        s.printPartTimeStudents();

        s.getExamScores();
    }
}
