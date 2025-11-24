  class CourseInstructor{
    private String name;
    private String qualification;

    public CourseInstructor(String name, String qualification) {
         this.name = name;
         this.qualification = qualification;
    }
    public CourseInstructor() {
         this.name = "tanveer";
         this.qualification = "phd in Mathematics";
    }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public String getQualification() {
         return qualification;
     }

     public void setQualification(String qualification) {
         this.qualification = qualification;
     }

     @Override
     public String toString() {
         return "Instructor : " +
                 "\nname : " + name  +
                 "\nqualification : " + qualification;
     }
 }
class Course{
    private String courseID;
    private String title;
    private int creditHours;
    private CourseInstructor instructor;
    private static int totalCourse=0;

    public Course(String courseID, String title, int creditHours, CourseInstructor instructor) {
        this.courseID = courseID;
        this.title = title;
        this.creditHours = creditHours;
        this.instructor = instructor;
        totalCourse++;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public CourseInstructor getInstructor() {
        return instructor;
    }

    public void setInstructor(CourseInstructor instructor) {
        this.instructor = instructor;
    }

    public static int getTotalCourses() {
        return totalCourses;
    }

    public static void setTotalCourses(int totalCourses) {
        Course.totalCourses = totalCourses;
    }

    @Override
    public String toString() {
        return "Course : " +
                "\nID : " + courseID  +
                "\ntitle : " + title +
                "\ncreditHours : " + creditHours +
                "\ninstructor : " + instructor.getName();
    }
}








public class project {
    static void main(String[] args) {

    }

}
