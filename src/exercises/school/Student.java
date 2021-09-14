package exercises.school;

public class Student {
    Student Henry = new Student();
    private String name;
    private  int studentId;
    private double gpa = 4.0;
    private int numberOfCredits = 1;


    public void setName(String name) {
        this.name = name;
    }

    public  void  setStudentId(int studentId){
        this.studentId = studentId;
    }

    public  void setGpa(double gpa){
        this.gpa = gpa;
    }

    private  void  setNumberOfCredits(int numberOfCredits){
        this.numberOfCredits = numberOfCredits;
    }

    public String getName(){
        return  name;
    }
    
    public  int getStudentId(){
        return  studentId;
    }
    
    public  int getNumberOfCredits(){
        return numberOfCredits;
    }
    public  double getGpa(){
        return gpa;
    }

}