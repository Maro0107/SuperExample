public class Student extends Person {
    private int grade;

    Student(){

    }
    Student(String name, String surname, int grade){
        super(name, surname);
        this.setType("Student");
        this.setGrade(grade);

    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if(grade > 0 && grade < 8)
        this.grade = grade;

    }
}