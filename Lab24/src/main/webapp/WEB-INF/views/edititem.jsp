<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Person</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/journal/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-5C8TGNupopdjruopVTTrVJacBbWqxHK9eis5DB+DYE6RfqIJapdLBRUdaZBTq7mE"
	crossorigin="anonymous">
	

</head>
<body>

	
<div class = "container">

	<h1>Update Item</h1>
	 
	<form action = "updateitem">
	
		ID: ${id}<input type = "hidden" name = "id" value = "${id}">
		Name: <input type = "text" name = "Name"> 
		<input type = "text" placeholder = "Description" name = "Description">
		<input type = "text"	placeholder = "Quantity" name = "Quantity">
		<input type = "text"	placeholder = "Price" name = "Price">
		
		
			<input type = "submit" value = "update"> 
	
	</form>


</div>



<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>