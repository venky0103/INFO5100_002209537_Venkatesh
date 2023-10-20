package students;

public class FullTime extends Student {
    private int exam1, exam2;
    public FullTime(String name, String studentId, int exam1, int exam2, int[] quizScores){
        super(name, studentId, quizScores);
        this.exam1 = exam1;
        this.exam2 = exam2;
    }

    public int getExam1(){
        return this.exam1;
    }

    public void setExam1(int exam1){
        this.exam1 = exam1;
    }

    public int getExam2(){
        return this.exam2;
    }

    public void setExam2(int exam2){
        this.exam2 = exam2;
    }

    @Override
    public void describeStudent() {
        super.describeStudent();
        System.out.println("Exam1: " + exam1 + ", Exam2: " + exam2);
    }
}
