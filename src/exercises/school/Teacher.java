package exercises.school;

public class Teacher {

    private String firstName;
    private String lastName;
    private String Subject;
    private int yearsTeaching;

    public  void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void  setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setSubject(String Subject){
        this.Subject = Subject;
    }

    public void setYearsTeaching(int yearsTeaching){
        this.yearsTeaching = yearsTeaching;
    }
    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getSubject(){
        return Subject;
    }

    public int getYearsTeaching(){
        return yearsTeaching;
    }

}
