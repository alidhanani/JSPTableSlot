package edu.awt.pojo;

public class slots {
	int slotid;
	String timing;
	public int getSlotid() {
		return slotid;
	}
	public void setSlotid(int slotid) {
		this.slotid = slotid;
	}
	public String getTiming() {
		return timing;
	}
	public void setTiming(String timing) {
		this.timing = timing;
	}
	public slots(int slotid, String timing) {
		super();
		this.slotid = slotid;
		this.timing = timing;
	}
	public slots() {
		super();
	}
	
	
}
