/**
 * The Student class holds data about a student.
 * The fields are firstName, lastName, and grade.
 */
public class Student
{
    private String firstName;
    private String lastName;
    private int gradeLevel;
    
    public Student(String firstName, String lastName, int gradeLevel)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradeLevel = gradeLevel;
    }
    
    public String toString()
    {
        return firstName + " " + lastName + " is in grade: " + gradeLevel;
    }
}

