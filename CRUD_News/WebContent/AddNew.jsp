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
		<h1>Add New</h1>
		<div style="width: 900px; margin-left: auto; margin-right: auto;">
			<form action="JSP/ManagerAddNew.jsp" method="post">
				Title:<br>
				<input type="text" name="title" style="width: 200px"><br>
				Description:<br>
				<input type="text"  name="description" style="width: 200px"><br>
				Detail:<br>
				<textarea name="detail" style="width: 400px; height: 200px"></textarea><br>
				Category:
				<select name="category">
					<option value="World">World</option>
					<option value="Tech">Tech</option>
					<option value="Sport">Sport</option>
				</select><br>
				Image: <br>
				<input type="text"  name="image" style="width: 200px"><br>
				<input type="submit" value="Submit">
			</form>
			<!--Complete Interface AddNew. -->
		</div>
	
	</body>
</html>