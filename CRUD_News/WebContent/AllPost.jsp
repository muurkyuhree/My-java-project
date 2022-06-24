<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<meta name="viewpoint" content=width=device-width, initial-scale=1.0">
	<title>All Posts</title>
	</head>
	<body>
	<div style="width: 1200px; margin-left: auto; margin-right: auto;">
		<table callpadding="10">
			<tr>
				<th>Id</th>
				<th>Title</th>
				<th>Description</th>
				<th>Detail</th>
				<th>Category</th>
				<th>Date</th>
				<th>Image</th>
			</tr>
			<c:forEach items="${AllPost}" var="p">
				<tr>
					<td>${p.id}</td>
					<td>${p.title}</td>
					<td>${p.descrption}</td>
					<td>${p.detail}</td>
					<td>${p.category}</td>
					<td>${p.date}</td>
					<td>${p.image}</td>
					<td>
						<a href="edit?id=${p.id}">Edit</a>
						<a href="delete?id=${p.id}">Delete</a>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>
	
	</body>
</html>