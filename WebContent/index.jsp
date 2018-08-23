<%@page import="edu.awt.DAO.labscheduleDAO"%>
<%@page import="edu.awt.DAO.courseDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Iterator"%>
<%@page import="edu.awt.DAO.daysDAO"%>
<%@page import="edu.awt.DAO.slotsDAO"%>
<%@page import="edu.awt.pojo.days"%>
<%@page import="edu.awt.pojo.course"%>
<%@page import="edu.awt.pojo.labschedule"%>
<%@page import="edu.awt.pojo.slots"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Time Table</title>
<script type="text/javascript" src="js/jquery-1.10.2.min.js"></script>
<script type="text/javascript">

	function getId(schID) {
		document.getElementById("schId").value = schID;
		document.frmList.submit();
	}
	
	function pageSubmit() {
		document.frmList.submit();
		document.frmList.submit();
	}
	
	/* function getSelectId(selectID) {
		document.getElementById("selectUse").value = selectID;
		document.frmList.submit();
	} */
	
</script>
<style>
table, th, td {
    border: 1px solid black;
}
</style>
</head>
<body>
	<%
	/*
		Iterator itDay = new daysDAO().getAllDays().iterator();
		Iterator itSlots = new slotsDAO().getAllSlots().iterator();
		Iterator itCourse = new courseDAO().getAllCourse().iterator();
		Iterator itSchMon = new labscheduleDAO().getAllSchForMonday().iterator();
		Iterator itSchTue = new labscheduleDAO().getAllSchForTuesday().iterator();
		Iterator itSchWed = new labscheduleDAO().getAllSchForWednesday().iterator();
		Iterator itSchThu = new labscheduleDAO().getAllSchForThursday().iterator();
		Iterator itSchFri = new labscheduleDAO().getAllSchForFriday().iterator();
		Iterator itSchSat = new labscheduleDAO().getAllSchForSaturday().iterator();
		Iterator itSchSun = new labscheduleDAO().getAllSchForSunday().iterator();
	*/
		ArrayList<days> arrayDay = new daysDAO().getAllDays();
		ArrayList<slots> arraySlot = new slotsDAO().getAllSlots();
		ArrayList<course> arrayCourse = new courseDAO().getAllCourse();
		ArrayList<labschedule> arraySchMon = new labscheduleDAO().getAllSchForMonday();
		ArrayList<labschedule> arraySchTue = new labscheduleDAO().getAllSchForTuesday();
		ArrayList<labschedule> arraySchWed = new labscheduleDAO().getAllSchForWednesday();
		ArrayList<labschedule> arraySchThu = new labscheduleDAO().getAllSchForThursday();
		ArrayList<labschedule> arraySchFri = new labscheduleDAO().getAllSchForFriday();
		ArrayList<labschedule> arraySchSat = new labscheduleDAO().getAllSchForSaturday();
		ArrayList<labschedule> arraySchSun = new labscheduleDAO().getAllSchForSunday();
		
	%>
	<form name="frmList" method="post" action="index.jsp">
	<table>
		<tr>
			<th></th>
			<%
			for(days day : arrayDay){
					out.println("<th>"+ day.getDayname() +"</th>");
				}
			%>
		</tr>
		<%
		int num = 1;
		int numTue = 8;
		int numWed = 15;
		int numThu = 22;
		int numFri = 29;
		int numSat = 36;
		int numSun = 43;
		String prevName= "";
		boolean status = false;
		for(slots slot : arraySlot) {
			out.println("<tr>");
			out.println("<th>"+ slot.getTiming() +"</th>");
			for(days day : arrayDay) {
					switch(day.getDayid()) {
						case 1:
							status = false;
							for(labschedule labs : arraySchMon){
								for(course cour : arrayCourse) {
								if((cour.getCourseid() == labs.getCourseid()) && (labs.getSlotid() == slot.getSlotid())) {
									out.println("<td><a onclick='getId("+ num +")' href='#' id='"+ num++ +"'>"+ cour.getCoursename() +" <br/> "+ cour.getFaculty() +" <br/> "+ cour.getSectionname() +"</a></td>");
									status = true;
									prevName = cour.getCoursename();
								} 
							}
							}
							if(status == false){
								out.println("<td><a onclick='getId("+ num +")' href='#' id='"+ num++ +"'>O-H</a></td>");
								
							}
							break;
						 case 2:
							 status = false;
							for(labschedule labs : arraySchTue){
								for(course cour : arrayCourse) {
								if((cour.getCourseid() == labs.getCourseid()) && (labs.getSlotid() == slot.getSlotid())) {
									out.println("<td><a onclick='getId("+ numTue +")' href='#' id='"+ numTue++ +"'>"+ cour.getCoursename() +" <br/> "+ cour.getFaculty() +" <br/> "+ cour.getSectionname() +"</a></td>");
									status = true;
								}
							}
							}
							if(status == false) {
								out.println("<td><a onclick='getId("+ numTue +")' href='#' id='"+ numTue++ +"'>O-H</a></td>");
							}
							break;
						case 3:
							status = false;
							for(labschedule labs : arraySchWed){
								for(course cour : arrayCourse) {
								if((cour.getCourseid() == labs.getCourseid()) && (labs.getSlotid() == slot.getSlotid())) {
									out.println("<td><a onclick='getId("+ numWed +")' href='#' id='"+ numWed++ +"'>"+ cour.getCoursename() +" <br/> "+ cour.getFaculty() +" <br/> "+ cour.getSectionname() +"</a></td>");
									status = true;
								}
							}
							}
							if(status == false)
								out.println("<td><a onclick='getId("+ numWed +")' href='#' id='"+ numWed++ +"'>O-H</a></td>");
							break;
						 case 4:
							 status = false;
							for(labschedule labs : arraySchThu){
								for(course cour : arrayCourse) {
								if((cour.getCourseid() == labs.getCourseid()) && (labs.getSlotid() == slot.getSlotid())) {
									out.println("<td><a onclick='getId("+ numThu +")' href='#' id='"+ numThu++ +"'>"+ cour.getCoursename() +" <br/> "+ cour.getFaculty() +" <br/> "+ cour.getSectionname() +"</a></td>");
									status = true;
								}
							}
							}
							if(status == false)
								out.println("<td><a onclick='getId("+ numThu +")' href='#' id='"+ numThu++ +"'>O-H</a></td>");
							break;
						case 5:
							status = false;
							for(labschedule labs : arraySchFri){
								for(course cour : arrayCourse) {
								if((cour.getCourseid() == labs.getCourseid()) && (labs.getSlotid() == slot.getSlotid())) {
									out.println("<td><a onclick='getId("+ numFri +")' href='#' id='"+ numFri++ +"'>"+ cour.getCoursename() +" <br/> "+ cour.getFaculty() +" <br/> "+ cour.getSectionname() +"</a></td>");
									status = true;
								}
							}
							}
							if(status == false)
								out.println("<td><a onclick='getId("+ numFri +")' href='#' id='"+ numFri++ +"'>O-H</a></td>");
							break;
						case 6:
							status = false;
							for(labschedule labs : arraySchSat){
								for(course cour : arrayCourse) {
								if((cour.getCourseid() == labs.getCourseid()) && (labs.getSlotid() == slot.getSlotid())) {
									out.println("<td><a onclick='getId("+ numSat +")' href='#' id='"+ numSat++ +"'>"+ cour.getCoursename() +" <br/> "+ cour.getFaculty() +" <br/> "+ cour.getSectionname() +"</a></td>");
									status = true;
								} 
							}
							}
							if(status == false)
								out.println("<td><a onclick='getId("+ numSat +")' href='#' id='"+ numSat++ +"'>O-H</a></td>");
							break;
						case 7:
							status = false;
							for(labschedule labs : arraySchSun){
								for(course cour : arrayCourse) {
								if((cour.getCourseid() == labs.getCourseid()) && (labs.getSlotid() == slot.getSlotid())) {
									out.println("<td><a onclick='getId("+ numSun +")' href='#' id='"+ numSun++ +"'>"+ cour.getCoursename() +" <br/> "+ cour.getFaculty() +" <br/> "+ cour.getSectionname() +"</a></td>");
									status = true;
								}
							}
							}
							if(status == false)
								out.println("<td><a onclick='getId("+ numSun +")' href='#' id='"+ numSun++ +"'>O-H</a></td>");
							break; 
						default:
							out.println("Error");
							break;
						
					}
				}
			out.println("</tr>");
		}
		
		
		%>
	</table>
		<input type="hidden" id="schId" name="schId"/>
		<% String getSID = ""; 
		if(request.getParameter("schId") != null)
			getSID = request.getParameter("schId");
		%>
		<% course course = new labscheduleDAO().getElementByIDs(getSID.toString()); %>
		<% if(course != null) { %>
			Course Name: <input type="text" value="<%= course.getCoursename() %>"/>
			Faculty: <input type="text" value="<%= course.getFaculty() %>"/>
			Section: <input type="text" value="<%= course.getSectionname() %>"/><br/>
			Replace With:
			<select name="courSelect">
				<option value='0' >O-H</option>
				<%
					for(course cour : arrayCourse) {
						out.println("<option value='"+ cour.getCourseid() +"'>"+ cour.getCoursename() + "</br>" + cour.getSectionname() + "</br>" + cour.getFaculty() +"</option>");
					}
				%>
			</select>
			<input type="hidden" name="selectUse" id="selectUse" value="<%= request.getParameter("courSelect") %>" /> 
			<%
				int result = 0;
				String select = request.getParameter("selectUse");
				if(select != null)
					result = labscheduleDAO.updateAllSch(select, getSID);
				if(result == 0) {
					out.println("No Changes");
				}
				
				
			%>
			<input type="submit" value="Submit" onclick="pageSubmit()"/>
		<%
		}
		else {
			%>
			Course Name: <input type="text" value=" "/>
			Faculty: <input type="text" value=" "/>
			Section: <input type="text" value=" "/>
			<input type="submit" value="Submit"/>
			<%
		}
		%>
	</form>
	
</body>
</html>