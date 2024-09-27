import java.util.HashMap;

public class CourseService {
    HashMap<String, Student> students = new HashMap<>();
    HashMap<String, Course> courses = new HashMap<>();
    public CourseService(){
        students.put( "120120", new Student( "Santiago", "120120" ) );
        students.put( "884545", new Student( "Kate", "884545" ) );
        students.put( "458787", new Student( "Alejandra", "458787" ) );
        students.put( "135464", new Student( "Maria", "135464" ) );
        students.put( "778979", new Student( "Peter", "778979" ) );

        courses.put( "math_01", new Course( "Mathematics 1", "math_01", 8 ) );
        courses.put( "biol_01", new Course( "Biology 1", "biol_01", 8 ) );
        courses.put( "phys_01", new Course( "Physics 1", "phys_01", 8 ) );
        courses.put( "art_01", new Course( "Arts 1", "art_01", 8 ) );
        courses.put( "chem_01", new Course( "Chemistry 1", "chem_01", 8 ) );
        courses.put( "sport_01", new Course( "Sports 1", "sport_01", 8 ) );
    }//constructor

    public void enrollStudent(String studentId, String courseId){
        //TODO implement so it adds the given course form the student (get id y enroll) (Llamar a la función de la clase Students)
    }

    public void unEnrollStudent(String studentId, String courseId){
        //TODO implement so it removes the given course form the student (get id y unroll)
    }

    public void displayCourseInformation(String courseId){
    	courses.forEach((k,v)->mostrar(k,v));
        //TODO implement so it shows the course name, id and credits (ir y buscar cursos y despues mandar a imprimir)
    }

    private static void mostrar(String k, Course v) {
    	System.out.println("======================== Courses Information ===========0========");
    	System.out.println(k + " -> " + v);
		// TODO Auto-generated method stub
	
	}//Courses Information

	public void displayStudentInformation(String studentId){
    	students.forEach((k,v)->mostrar(k,v));
        //TODO implement so it shows the student name, id and list of enrolled courses (tomar el id del estudiante, buscarlo y poner un sysout)
    }//displayStudentInformation

	private static void mostrar(String k, Student v) {
		System.out.println("======================== Students Information ===========0========");
		System.out.println(k + " -> " + v);
		// TODO Auto-generated method stub
		
	}//Students Information


}//class CourseService