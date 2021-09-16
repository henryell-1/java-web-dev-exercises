package exercises.school;

public class Student {

    private int nextStudentId;
    private String name;
    private  int studentId;
    private double gpa ;
    private int numberOfCredits = 1;


    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    //public Student(String name) {
        //this(name, nextStudentId);
        //nextStudentId++;
    //}

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
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

    public void addGrade(int courseCredits, double grade) {
        // Update the appropriate fields: numberOfCredits, gpa
            double totalQualityScore = this.gpa * this.numberOfCredits;
            totalQualityScore += courseCredits * grade;
            this.numberOfCredits += courseCredits;
            this.gpa = totalQualityScore/this.numberOfCredits;

    }

    public String getGradeLevel(int numberOfCredits) {
        // Determine the grade level of the student based on numberOfCredits
        if (this.numberOfCredits <= 29){
            return "freshman";
        } else if (this.numberOfCredits <= 59){
            return "sophomore";
        } else if (this.numberOfCredits <= 89) {
            return "junior";
        } else {
            return "senior";
        }
    }

    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public int getNextStudentId() {
        return nextStudentId;
    }

    public void setNextStudentId(int nextStudentId) {
        this.nextStudentId = nextStudentId;
    }

    public String toString() {
        String studentReport = String.format("%s is a %s with %d credits and a GPA of %.2f", this.name, this.getGradeLevel(this.numberOfCredits), this.getNumberOfCredits(), this.getGpa());
        return studentReport;
    }

    public boolean equals(Object toBeCompared) {
        if (toBeCompared == this) {
            return true;
        }

        if (toBeCompared == null) {
            return false;
        }

        if (toBeCompared.getClass() != getClass()) {
            return false;
        }

        Student theStudent = (Student) toBeCompared;
        return theStudent.getStudentId() == getStudentId();
    }
}
