package tw.com.lccnet.web.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import tw.com.lccnet.web.dao.StudentDao;
import tw.com.lccnet.web.entity.Student;
import tw.com.lccnet.web.utils.DBUtils;

public class StudentDaoImpl implements StudentDao {
	
	@Override
	public List<Student> getAll() {
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		List<Student> list=new ArrayList<Student>();
		try {
			conn=DBUtils.getDBUtils().getConnection();
			String sql="select stu_id,stu_name,stu_age,stu_pass,stu_email from student";
			ps=conn.prepareStatement(sql);
			System.out.println(" getAll()----");
			rs=ps.executeQuery();
			while(rs.next()) {
				int stu_id=rs.getInt(1);
				String stu_name=rs.getString(2);
				String stu_age=rs.getString(3);
				String stu_pass=rs.getString(4);
				String stu_email=rs.getString(5);
				
				Student student=new Student(stu_id, stu_name, stu_age, stu_pass, stu_email);
				list.add(student);
				System.out.println(" getAll()");
			}
			
			
			
		} catch (Exception e) {
			
		}finally {
			DBUtils.getDBUtils().getClose(rs);
			DBUtils.getDBUtils().getClose(ps);
			DBUtils.getDBUtils().getClose(conn);
		}

		
		return list;
	}

	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteStudent(int stu_id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Student> serchStudentByName(String stu_name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> serchStudentByEmail(String stu_email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> serchStudentByAge(String stu_age) {
		// TODO Auto-generated method stub
		return null;
	}


}
