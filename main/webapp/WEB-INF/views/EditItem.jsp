<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Item Form</title>
</head>
<body>
<div class="container">
		<p>Edit Item 
		<button><a href="/">HOME</a></button>
		<button><a href="/AdminItems">BACK</a></button>
		</p>
		<form action="/SubmitItemChanges" method="post" class="form">
		<div class="form-group row">
			<label for="name" class="col-sm-2 col-form-label">Product Name:</label>
    		<div class="col-sm-10">
			<input class="form-control" value = ${ item.name } name="name"/>
			</div>
		</div>
		<div class="form-group row">
			<label for="price" class="col-sm-2 col-form-label">Price:</label>
			<div class="col-sm-10">
			<input class="form-control" value = ${ item.price } name="price"/>
			</div>
		</div>
		<div class="form-group row">
			<label for="quantity" class="col-sm-2 col-form-label">Quantity:</label> 
			<div class="col-sm-10">
			<input class="form-control" value = ${ item.quantity } name="quantity"/>
			</div>
		</div>
		<div class="form-group row">
			<label for="description" class="col-sm-2 col-form-label">Description:</label> 
			<div class="col-sm-10">
			<input class="form-control" value = ${ item.description } name="description"/>
			</div>
		</div>
		<button type="submit">UPDATE</button>
		</form>
	</div>
	
</body>
</html>