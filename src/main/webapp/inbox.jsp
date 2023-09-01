
<%@page import="java.util.ArrayList"%>
<%ArrayList <String> listofEmp=(ArrayList<String>) request.getAttribute("data");
for (String empName: listofEmp){
	 out.println(empName);
}
 %>
