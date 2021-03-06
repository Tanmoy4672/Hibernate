<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.helper.*,org.hibernate.*,com.entities.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Note Taker :Edit Page</title>
<%@include file="All_js_css.jsp"%>
</head>
<body>

	<div class="container-fluid p-0 m-0">
		<%@include file="Navbar.jsp"%>
		<h1>Edit your note:</h1>


		<%
		int noteId = Integer.parseInt(request.getParameter("note_id").trim());

		Session se = FactoryProvider.geFactory().openSession();
		Note note = (Note) se.get(Note.class, noteId);
		%>
		<!-- This is edit notes form -->
		<form action="UpdateServlet" method="POST">
		<input value="<%=note.getId()%>" name="noteId" type="hidden"/>
			<div class="form-group mb-3 m-4">
				<label for="title"
				 class="form-label">Note Title</label> 
				 <input
					name="title" 
					required type="text" 
					class="form-control"
					id="NoteTitle" 
					aria-describedby="emailHelp"
					value="<%=note.getTitle() %>"
					/>
			</div>
			<div class="form-group mb-3 m-4">
				<label for="content" 
				class="form-label">Description</label>
				<textarea 
				name="content" 
				required class="form-control"
				id="titelContent" rows="3">
				<%=note.getContent() %>
				</textarea>
			</div>
<br>

			<div class="container text-center">
				<button type="submit" class="btn btn-success">Save your note</button>
			</div>
		</form>


	</div>

</body>
</html>