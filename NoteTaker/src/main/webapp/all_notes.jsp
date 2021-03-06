<%@page import="com.entities.Note"%>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.Query"%>
<%@page import="com.helper.FactoryProvider"%>
<%@page import="org.hibernate.Session"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Notes : Note Taker</title>
<%@include file="All_js_css.jsp"%>
</head>
<body>
	<div class="container-fluid">
		<%@include file="Navbar.jsp"%>
		<br>
		<h1 class="text-uppercase">All Notes :</h1>

		<div class="row">
			<div class="col-12">
				<%
				Session s = FactoryProvider.geFactory().openSession();

				Query hql = s.createQuery("from Note");
				List<Note> list = hql.list();
				for (Note note : list) {
				%>
				<div class="card mt-3">
					<img src="img/notepad.png" class="card-img-top m-4 mx-auto" alt="..."
						style="max-width: 100px;">
					<div class="card-body px-5">
						<h5 class="card-title"><%=note.getTitle()%></h5>
						<p class="card-text"><%=note.getContent()%></p>
						<p class="card-text text-primary"><b><%=note.getAddedDate()%></b></p>
						
						<div class="container text-center mt-2">
							<a href="DeleteServlet?note_id=<%=note.getId()%>" class="btn btn-danger">Delete</a> 
							<a href="edit.jsp?note_id=<%= note.getId() %>" class="btn btn-primary">Update</a>
						</div>
					</div>
				</div>

				<%
				//	out.println(note.getId() + ":" + note.getTitle() + "<br>");
				}

				s.close();
				%>
			</div>
		</div>
	</div>





</body>
</html>