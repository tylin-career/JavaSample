package tw.com.lccnet.web.dao;

import java.util.List;

import tw.com.lccnet.web.entity.Student;

public interface StudentDao {
	
	public List<Student> getAll();
	
	public  void addStudent(Student student);
	
	public void deleteStudent(int stu_id);
	
	public List<Student> serchStudentByName(String stu_name);
	
	public List<Student> serchStudentByEmail(String stu_email);
	
	public List<Student> serchStudentByAge(String stu_age);
	 
}
