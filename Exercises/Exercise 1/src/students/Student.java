package students;

public class Student {

    private String name;
    private String studentId;
    private int[] quizScores;

    public Student(String name, String studentId, int[] quizScores){
        this.name = name;
        this.studentId = studentId;
        this.quizScores = quizScores;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getStudentId(){
        return this.studentId;
    }

    public void setStudentId(String studentId){
        this.studentId = studentId;
    }

    public int[] getQuizScores(){
        return this.quizScores;
    }

    public void setQuizScores(int[] quizScores){
        this.quizScores = quizScores;
    }

    public double getAverageQuizScore(){
        double total = 0;
        for(int i = 0;i < 15;i++){
            total += quizScores[i];
        }
        total = total/15;
        return total;
    }

    public void describeStudent(){
        System.out.println("Name: " + name + ", StudentId: " + studentId);
        System.out.print("QuizScores: ");
        int[] quizScores = this.getQuizScores();
        for(int i = 0;i < 15;i++){
            System.out.print(quizScores[i] + ", ");
        }
        System.out.println();
    }


}
