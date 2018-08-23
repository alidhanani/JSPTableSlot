package edu.awt.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import edu.awt.db.DB;
import edu.awt.pojo.course;

public class courseDAO {
	public ArrayList<course> getAllCourse(){
		ArrayList<course> courses = new ArrayList<>();
		
		Connection conn = DB.getConnetion();
		try {
			Statement stmt = conn.createStatement();
			String sql = "SELECT * FROM course";
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()){
				course course = new course();
				course.setCourseid(rs.getInt("courseid"));
				course.setCoursename(rs.getString("coursename"));
				course.setFaculty(rs.getString("faculty"));
				course.setSectionname(rs.getString("sectionname"));
				courses.add(course);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return courses;
	}
}
