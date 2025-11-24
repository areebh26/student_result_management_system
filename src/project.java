import java.util.ArrayList;

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
        return totalCourse;
    }

    public static void setTotalCourses(int totalCourses) {
        Course.totalCourse = totalCourses;
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
interface resultCal{
    static double passingMarks=50;
    double calculateTotal();
    double calculatePercentage();
    double calculateGrade();
}
class ResultEntry{
    private Course course;
    private double marksObtianed;

    public ResultEntry(Course course, double marksObtianed) {
        this.course = course;
        this.marksObtianed = marksObtianed;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public double getMarksObtianed() {
        return marksObtianed;
    }

    public void setMarksObtianed(double marksObtianed) {
        this.marksObtianed = marksObtianed;
    }

    @Override
    public String toString() {
        return "Result : " +
                "\ncourse : " + course.getTitle() +
                "\nmarksObtianed=" + marksObtianed;
    }
}
class Transcript{
    private ArrayList<ResultEntry> list ;

    public Transcript(ArrayList<ResultEntry> list) {
        this.list = new ArrayList<>();

    }
    public void addResultEntry(ResultEntry r) {
        list.add(r);
    }
    public double getGPA() {
        double totalWeightedPoints = 0;
        int totalCredits = 0;
        for (int i = 0; i < list.size(); i++) {
            ResultEntry entry = list.get(i);
            double marks = entry.getMarksObtianed();
            int credits = entry.getCourse().getCreditHours();
            double gradePoint = 0;
            if (marks >= 85) {
                gradePoint = 4.0;
            } else if (marks >= 80) {
                gradePoint = 3.7;
            } else if (marks >= 75) {
                gradePoint = 3.3;
            } else if (marks >= 70) {
                gradePoint = 3.0;
            } else if (marks >= 60) {
                gradePoint = 2.0;
            } else if (marks >= 50) {
                gradePoint = 1.0;
            } else {
                gradePoint = 0.0;
            }
            totalWeightedPoints = totalWeightedPoints + (gradePoint * credits);
            totalCredits = totalCredits + credits;
        }
        if (totalCredits == 0) {
            return 0.0;
        }
        return totalWeightedPoints / totalCredits;
    }
}








public class project {
    static void main(String[] args) {

    }

}
