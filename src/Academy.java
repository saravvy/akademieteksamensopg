import java.util.ArrayList;
import java.util.List;

public class Academy {

    private String name;
    List<Student> students = new ArrayList<>();

    List<Course> courses = new ArrayList<>();

    List<CourseRegistration> registrations = new ArrayList<>();

    public Academy(String name) {
        this.name = name;
    }

    public void printDiploma(Student b) {
        for(CourseRegistration cr : registrations){
            System.out.println("eksamenns becis for " + b.getName());
            if(b.getName().equals(cr.getStudent().getName())){
                System.out.println(cr.getCourse().getName() + " : "+cr.getGrade());

            }

        }
    }

    public List<Student> getHighest(int quantity) {

        return null;
    }

    public List<Student> getLowest(int quantity) {

        return null;
    }

    public void enroll(Student b) {

        students.add(b);
    }

    public void printAllStudents() {
        System.out.println("all students");
        for (Student student : students) {
            System.out.println(student.getName());

        }
    }

    //courses
    public void addCource(Course c) {
        courses.add(c);

    }

    public void printAllCourses() {

        System.out.println("alle kurser");
        for (Course c : courses) {
            System.out.println(c.getName());

        }
    }

    //registartitionsw

    public void registerStudentToCourse(Student e, Course k, int grade) {

        registrations.add(new CourseRegistration(e, k, grade));


    }

    public void registerStudentToCourse(String studentName, String courseName, int grade) {
        Student studentFound = null;
        for (Student s : students) {
            if (s.getName().equals(studentName)) {
                studentFound = s;
                break;

            }
        }
        for (Course c : courses) {
            Course courseFound = null;
            for (Course s : courses) {
                if (s.equals(courseName)) {
                    courseFound = c;
                    break;


                }
            }
            if (studentFound != null && courseFound != null) {
                registerStudentToCourse(studentFound, courseFound, grade);
            }
        }

    }

    public Student getStudentByName(String studentName) {
        Student studentFound = null;
        for (Student s : students) {
            if (s.getName().equals(studentName)) {
                return s;

            }
        }
        return null;
    }

}



