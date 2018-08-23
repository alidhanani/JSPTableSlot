package edu.awt.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import edu.awt.db.DB;
import edu.awt.pojo.slots;

public class slotsDAO {
	public ArrayList<slots> getAllSlots(){
		ArrayList<slots> slots = new ArrayList<>();
		
		Connection conn = DB.getConnetion();
		try {
			Statement stmt = conn.createStatement();
			String sql = "SELECT * FROM slots";
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()){
				slots slot = new slots();
				slot.setSlotid(rs.getInt("slotid"));
				slot.setTiming(rs.getString("timing"));
				slots.add(slot);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return slots;
	}
}
