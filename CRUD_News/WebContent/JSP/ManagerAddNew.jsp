<%@page import="com.murk.doa.DataAccess"%>
<%@page import="com.murk.model.News"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.sql.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<meta name="viewpoint" content=width=device-width, initial-scale=1.0">
	<title>Add New</title>
	</head>
	<body>
		<%
			String title = request.getParameter("title");
			Date dateTemp = new Date(System.currentTimeMillis());
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
			String date = dateFormat.format(dateTemp.getTime());
			
			String description = request.getParameter("description");
			String detail = request.getParameter("detail");
			String category = request.getParameter("category");
			String image = request.getParameter("image");
			
			News n = new News(0, title, date,description, detail, category, image);
			
			DataAccess da = new DataAccess();
			da.addNew(n);
			
			response.sendRedirect("/CRUD_News/AllPost.jsp");
		%>
	
	</body>
</html>