package edu.awt.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import edu.awt.db.DB;
import edu.awt.pojo.course;
import edu.awt.pojo.labschedule;

public class labscheduleDAO {
	
	public static int updateAllSch(String courID, String schID) {
		Connection conn = DB.getConnetion();
		try {
			Statement stmt = conn.createStatement();
			String sql = "UPDATE labschedule SET courseid="+ courID.toString() +" WHERE schid="+ schID.toString() +";";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			int result = pstmt.executeUpdate();
			//int result = stmt.executeUpdate(sql);
			return result;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}
	
	public ArrayList<labschedule> getAllSchForMonday(){
		ArrayList<labschedule> labschedules = new ArrayList<>();
		
		Connection conn = DB.getConnetion();
		try {
			Statement stmt = conn.createStatement();
			String sql = "SELECT * FROM labschedule WHERE dayid = 1";
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()){
				labschedule labschedule = new labschedule();
				labschedule.setCourseid(rs.getInt("courseid"));
				labschedule.setDayid(rs.getInt("dayid"));
				labschedule.setLabid(rs.getInt("labid"));
				labschedule.setSchid(rs.getInt("schid"));
				labschedule.setSlotid(rs.getInt("slotid"));
				labschedules.add(labschedule);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return labschedules;
	}
	
	public course getElementByIDs(String schID) {
		Connection conn = DB.getConnetion();
		try {
			Statement stmt = conn.createStatement();
			String sql = "SELECT C.sectionname, C.faculty, C.coursename FROM course C, labschedule L WHERE L.schid = '"+ schID +"' AND L.courseid = C.courseid;";
			ResultSet rs = stmt.executeQuery(sql);
			course course = new course();
			while(rs.next()){	
				course.setSectionname(rs.getString("C.sectionname"));
				course.setFaculty(rs.getString("C.faculty"));
				course.setCoursename(rs.getString("C.coursename"));
			}
			return course;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			course course = new course();	
				course.setCoursename("Null");
				course.setSectionname("Null");
				course.setFaculty("Null");
			
			return null;
		}
	}
	
	public ArrayList<labschedule> getAllSchForTuesday(){
		ArrayList<labschedule> labschedules = new ArrayList<>();
		
		Connection conn = DB.getConnetion();
		try {
			Statement stmt = conn.createStatement();
			String sql = "SELECT * FROM labschedule WHERE dayid = 2";
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()){
				labschedule labschedule = new labschedule();
				labschedule.setCourseid(rs.getInt("courseid"));
				labschedule.setDayid(rs.getInt("dayid"));
				labschedule.setLabid(rs.getInt("labid"));
				labschedule.setSchid(rs.getInt("schid"));
				labschedule.setSlotid(rs.getInt("slotid"));
				labschedules.add(labschedule);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return labschedules;
	}
	
	public ArrayList<labschedule> getAllSchForWednesday(){
		ArrayList<labschedule> labschedules = new ArrayList<>();
		
		Connection conn = DB.getConnetion();
		try {
			Statement stmt = conn.createStatement();
			String sql = "SELECT * FROM labschedule WHERE dayid = 3";
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()){
				labschedule labschedule = new labschedule();
				labschedule.setCourseid(rs.getInt("courseid"));
				labschedule.setDayid(rs.getInt("dayid"));
				labschedule.setLabid(rs.getInt("labid"));
				labschedule.setSchid(rs.getInt("schid"));
				labschedule.setSlotid(rs.getInt("slotid"));
				labschedules.add(labschedule);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return labschedules;
	}
	
	public ArrayList<labschedule> getAllSchForThursday(){
		ArrayList<labschedule> labschedules = new ArrayList<>();
		
		Connection conn = DB.getConnetion();
		try {
			Statement stmt = conn.createStatement();
			String sql = "SELECT * FROM labschedule WHERE dayid = 4";
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()){
				labschedule labschedule = new labschedule();
				labschedule.setCourseid(rs.getInt("courseid"));
				labschedule.setDayid(rs.getInt("dayid"));
				labschedule.setLabid(rs.getInt("labid"));
				labschedule.setSchid(rs.getInt("schid"));
				labschedule.setSlotid(rs.getInt("slotid"));
				labschedules.add(labschedule);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return labschedules;
	}
	
	public ArrayList<labschedule> getAllSchForFriday(){
		ArrayList<labschedule> labschedules = new ArrayList<>();
		
		Connection conn = DB.getConnetion();
		try {
			Statement stmt = conn.createStatement();
			String sql = "SELECT * FROM labschedule WHERE dayid = 5";
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()){
				labschedule labschedule = new labschedule();
				labschedule.setCourseid(rs.getInt("courseid"));
				labschedule.setDayid(rs.getInt("dayid"));
				labschedule.setLabid(rs.getInt("labid"));
				labschedule.setSchid(rs.getInt("schid"));
				labschedule.setSlotid(rs.getInt("slotid"));
				labschedules.add(labschedule);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return labschedules;
	}
	
	public ArrayList<labschedule> getAllSchForSaturday(){
		ArrayList<labschedule> labschedules = new ArrayList<>();
		
		Connection conn = DB.getConnetion();
		try {
			Statement stmt = conn.createStatement();
			String sql = "SELECT * FROM labschedule WHERE dayid = 6";
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()){
				labschedule labschedule = new labschedule();
				labschedule.setCourseid(rs.getInt("courseid"));
				labschedule.setDayid(rs.getInt("dayid"));
				labschedule.setLabid(rs.getInt("labid"));
				labschedule.setSchid(rs.getInt("schid"));
				labschedule.setSlotid(rs.getInt("slotid"));
				labschedules.add(labschedule);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return labschedules;
	}
	
	public ArrayList<labschedule> getAllSchForSunday(){
		ArrayList<labschedule> labschedules = new ArrayList<>();
		
		Connection conn = DB.getConnetion();
		try {
			Statement stmt = conn.createStatement();
			String sql = "SELECT * FROM labschedule WHERE dayid = 7";
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()){
				labschedule labschedule = new labschedule();
				labschedule.setCourseid(rs.getInt("courseid"));
				labschedule.setDayid(rs.getInt("dayid"));
				labschedule.setLabid(rs.getInt("labid"));
				labschedule.setSchid(rs.getInt("schid"));
				labschedule.setSlotid(rs.getInt("slotid"));
				labschedules.add(labschedule);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return labschedules;
	}
}
