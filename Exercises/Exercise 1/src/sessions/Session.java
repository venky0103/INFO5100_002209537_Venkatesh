package sessions;

import students.FullTime;
import students.Student;

import java.util.Arrays;

public class Session {
    Student[] students = new Student[20];

    public Session(Student[] students){
        this.students = students;
    }

    public Student[] getStudents(){
        return this.students;
    }

    public void setStudents(Student[] students){
        this.students = students;
    }

    public int[] getOrderedQuizScores(){
        int[] temp = new int[300];
        for(int i = 0;i < 20;i++){
            int[] tempStudentScore = this.students[i].getQuizScores();
            for(int j = 0;j < 15;j++){
                temp[i*15 + j] = tempStudentScore[j];
            }
        }
        Arrays.sort(temp);
        return temp;
    }

    public void getEachStudentAverage(){
        for(int i = 0;i < 20;i++){
            System.out.println("Name: " + students[i].getName());
            System.out.println("StudentId: " + students[i].getStudentId());
            System.out.print("QuizScores: ");
            int[] quizScores = students[i].getQuizScores();
            for(int j = 0;j < 15;j++){
                System.out.print(quizScores[j] + ", ");
            }
            System.out.println();
            System.out.println("Average: " + students[i].getAverageQuizScore());
        }
    }

    public void describeSession(){
        for(int i = 0;i < 20;i++){
            students[i].describeStudent();
        }
    }

    public void printPartTimeStudents() {
        for (int i = 0; i < 20; i++) {
            if (students[i].getClass().getSimpleName().equals("PartTime")) {
                System.out.println(students[i].getName());
            }
        }
    }
    public void getExamScores() {
        for (int i = 0; i < 20; i++) {
            if (students[i].getClass().getSimpleName().equals("FullTime")) {
                FullTime s = (FullTime) students[i];
                System.out.println(s.getExam1() + ", " + s.getExam2());
            }
        }
    }

}
