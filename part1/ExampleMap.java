// import java.util.LinkedList;
// import java.util.List;
// import java.util.Map;

// class ExampleMap
// {
//    public static List<String> highEnrollmentStudents(
//       Map<String, List<Course>> courseListsByStudentName, int unitThreshold)
//    {
//       List<String> overEnrolledStudents = new LinkedList<>();

//       /*
//          Build a list of the names of students currently enrolled
//          in a number of units strictly greater than the unitThreshold.
//       */

//       return overEnrolledStudents;      
//    }
// }



import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class ExampleMap
{
   public static List<String> highEnrollmentStudents(
      Map<String, List<Course>> courseListsByStudentName, int unitThreshold)
   {
      // for (String key : courseListsByStudentName.keySet())
      // {
      //    List course_list = courseListsByStudentName.get(key);

      //    new Map<String, int> courseEnrollmentNum;

      //    for (Course course_name : course_list)
      //    {
      //       if (courseEnrollmentNum.contains(course_name))
      //          oldValue = courseEnrollmentNum.replace(course_name, courseEnrollmentNum.get(course_name)+1)
         
      //       else
      //          courseEnrollmentNum.put(course_name, 1)

      //    }
      // }
      List<String> overEnrolledStudents = new LinkedList<>();

     for (String studentName : courseListsByStudentName.keySet()) {
     int units = 0;
     List<Course> courses = courseListsByStudentName.get(studentName);
     for (Course course : courses) {
         units += course.getNumUnits();
     }
     if (units > unitThreshold) {
         overEnrolledStudents.add(studentName);
     }
 

      /*
         Build a list of the names of students currently enrolled
         in a number of units strictly greater than the unitThreshold.
      */

      return overEnrolledStudents;      
   }
}
}
