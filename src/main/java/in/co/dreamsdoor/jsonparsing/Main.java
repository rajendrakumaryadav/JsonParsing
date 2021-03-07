package in.co.dreamsdoor.jsonparsing;

import com.google.gson.Gson;
import in.co.dreamsdoor.jsonparsing.pojo.Course;
import in.co.dreamsdoor.jsonparsing.pojo.Student;
import in.co.dreamsdoor.jsonparsing.pojo.Students;

public class Main {
    public static void main(String[] args) {
        String jsonData = JsonProvider.getJsonDataString("./src/main/resources/course_student.json");
        Gson gson = new Gson();
        Students students = gson.fromJson(jsonData, Students.class);
        
        for(Student student : students.getStudents()) {
            System.out.println(student.getId() + " : " + student.getFirstname() + " " + student.getLastname() + " (" + student.getEmail() + ")");
            for(Course course : student.getCourses()) {
                System.out.println("\t\t -  " + course.getName() + " [ " + course.getDuration() + " Hours ]");
            }
        }
    }
}
