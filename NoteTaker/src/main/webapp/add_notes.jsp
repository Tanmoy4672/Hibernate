<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add notes</title>
<%@include file="All_js_css.jsp"%>

</head>
<body>
	<div class="container-fluid p-0 m-0">
		<%@include file="Navbar.jsp"%>
	</div>

	<br>
	<h1>Please fill in your notes details:</h1>
	<!-- This is add notes form -->
	<form action="SaveNoteServlet" method="POST">
		<div class="form-group mb-3 m-4">
			<label for="title" 
			class="form-label">Note Title</label> 
			<input
				name="title" 
				required type="text" 
				class="form-control" 
				id="NoteTitle"
				aria-describedby="emailHelp" 
				placeholder="Enter your title"/>
		</div>
		<div class="form-group mb-3 m-4">
			<label for="content" 
			class="form-label">Description</label>
			<textarea
			name="content"
			 required 
			 class="form-control" 
			 id="titelContent"
			 placeholder="Enter your content here" 
			 rows="3"></textarea>
		</div>


		<div class="container text-center">
			<button type="submit" class="btn btn-primary">Submit</button>
		</div>
	</form>




</body>
</html>