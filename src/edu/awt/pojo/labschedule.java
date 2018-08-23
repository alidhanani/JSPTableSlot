package edu.awt.pojo;

public class labschedule {
	int schid;
	int dayid;
	int slotid;
	int labid;
	int courseid;
	public int getSchid() {
		return schid;
	}
	public void setSchid(int schid) {
		this.schid = schid;
	}
	public int getDayid() {
		return dayid;
	}
	public void setDayid(int dayid) {
		this.dayid = dayid;
	}
	public int getSlotid() {
		return slotid;
	}
	public void setSlotid(int slotid) {
		this.slotid = slotid;
	}
	public int getLabid() {
		return labid;
	}
	public void setLabid(int labid) {
		this.labid = labid;
	}
	public int getCourseid() {
		return courseid;
	}
	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}
	public labschedule(int schid, int dayid, int slotid, int labid, int courseid) {
		super();
		this.schid = schid;
		this.dayid = dayid;
		this.slotid = slotid;
		this.labid = labid;
		this.courseid = courseid;
	}
	public labschedule() {
		super();
	}
	
	
}
