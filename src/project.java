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









public class project {
    static void main(String[] args) {

    }

}
