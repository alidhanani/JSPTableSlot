package edu.awt.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import edu.awt.db.DB;
import edu.awt.pojo.days;

public class daysDAO {
	public ArrayList<days> getAllDays(){
		ArrayList<days> days = new ArrayList<>();
		
		Connection conn = DB.getConnetion();
		try {
			Statement stmt = conn.createStatement();
			String sql = "SELECT * FROM days";
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()){
				days day = new days();
				day.setDayid(rs.getInt("dayid"));
				day.setDayname(rs.getString("dayname"));
				days.add(day);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return days;
	}
}
