//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Academy hogwarts = new Academy("Hogwarts");
        hogwarts.enroll(new Student("Harry"));
        hogwarts.enroll(new Student("Ron"));
        hogwarts.enroll(new Student("Hermione"));
        hogwarts.enroll(new Student("Malfoy"));

        hogwarts.printAllStudents();

        hogwarts.addCource(new Course("hej"));
        hogwarts.addCource(new Course("hej2"));

        hogwarts.addCource(new Course("hej1"));

        hogwarts.printAllCourses();
        hogwarts.registerStudentToCourse("Harry","hej",7);
        hogwarts.registerStudentToCourse("Harry","hej2",9);
        hogwarts.registerStudentToCourse("Harry","hej1",9);

        Student s = hogwarts.getStudentByName("Harry");
        hogwarts.printDiploma(s);


    }
}