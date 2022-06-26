class Teacher
 {
   String designation = "Teacher";
   String collegeName = "Beginnersbook";
   void does()
   {
	System.out.println("Teaching");
   }
}

public class javaTeacher extends Teacher{
   String mainSubject = "java";
   public static void main(String args[]){
	javaTeacher obj = new javaTeacher();
	System.out.println(obj.collegeName);
	System.out.println(obj.designation);
	System.out.println(obj.mainSubject);
	obj.does();
   }
}