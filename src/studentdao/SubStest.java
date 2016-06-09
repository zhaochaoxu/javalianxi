package studentdao;

import java.util.List;

import student.entity.Student;
import subject.dao.SubjectDao;
import subject.entity.Subject;

public class SubStest {

	public static void main(String[] args) {
		
		StudentDao stu = new StudentDao();
		Student s= stu.Qureystudent("200803058");
		System.out.println(s);
		
		
		/*SubjectDao sub = new SubjectDao();
		Subject su= sub.QuerySubject(2);
		System.out.println(su);
		List<Subject> lis= sub.showAll();
		for (Subject subject : lis) {
			System.out.println(subject);
		}*/

	}

}
