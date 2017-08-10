<!-- 
create table testdb_suru.student (
	id int not null primary key,
	name varchar(100) not null,
	branch varchar(20) null
);
 -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Demo</title>
</head>
<body>
	<sql:setDataSource dataSource="jdbc/testdb_suru" var="ds" />

	<c:choose>
		<c:when test="${param.action eq 1}">
			<c:if
				test="${not empty param.name and not empty param.id and not empty param.branch}">
				<c:catch var="ex">
					<sql:update dataSource="${ds}"
						sql="INSERT INTO student (id, name, branch) VALUES (?, ?, ?)">
						<sql:param>${param.id}</sql:param>
						<sql:param>${param.name}</sql:param>
						<sql:param>${param.branch}</sql:param>
					</sql:update>
				</c:catch>
				<c:if test="${not empty ex}">
					<c:out value="${ex.message}" />
				</c:if>
			</c:if>
		</c:when>
		<c:when test="${param.action == 3}">
			<c:catch var="ex">
				<sql:update dataSource="${ds}"
					sql="DELETE FROM student WHERE id = ?">
					<sql:param>${param.id}</sql:param>
				</sql:update>
			</c:catch>
			<c:if test="${not empty ex}">
				<c:out value="${ex.message}" />
			</c:if>
		</c:when>
		<c:when test="${param.action == 4}">
			<c:if
				test="${not empty param.id and not empty param.name and not empty param.branch}">
				<c:catch var="ex">
					<sql:update dataSource="${ds}"
						sql="UPDATE student SET name = ?, branch = ? WHERE id = ?">
						<sql:param>${param.name}</sql:param>
						<sql:param>${param.branch}</sql:param>
						<sql:param>${param.id}</sql:param>
					</sql:update>
				</c:catch>
				<c:if test="${not empty ex }">
					<c:out value="${ex.message}" />
				</c:if>
			</c:if>
		</c:when>
	</c:choose>


	<form action="student.jsp" method="get">
		<input type="hidden" value="1" name="action" /> ID: <input name="id"
			type="text"> Name: <input name="name" type="text">
		Branch: <input name="branch" type="text"> <input type="Submit"
			value="Add to list">
	</form>

	<sql:query var="students" scope="page" dataSource="${ds}"
		sql="SELECT * FROM student" />

	<table style="width: 600px;" border="1px">
		<caption align="top">
			<h2>Students List</h2>
		</caption>
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Branch</th>
			<th colspan="2"></th>
		</tr>
		<c:forEach var="student" items="${students.rows}">
			<tr>
				<c:choose>
					<c:when test="${param.action eq 2 and param.id eq student.id}">
						<form action="student.jsp" method="get">
							<input type="hidden" value="4" name="action"> <input
								type="hidden" value="${student.id}" name="id">
							<td>${student.id}</td>
							<td><input type="text" value="${student.name}" name="name"></td>
							<td><input type="text" value="${student.branch}"
								name="branch"></td>
							<td colspan="2" align="center"><input type="submit"
								value="Update"></td>
						</form>
					</c:when>
					<c:otherwise>
						<td>${student.id}</td>
						<td>${student.name}</td>
						<td>${fn:toUpperCase(student.branch)}</td>
						<td align="center"><a
							href="student.jsp?action=2&id=${student.id}">Edit</a></td>
						<td align="center"><a
							href="student.jsp?action=3&id=${student.id}">Delete</a></td>
					</c:otherwise>
				</c:choose>
			</tr>
		</c:forEach>
	</table>
</body>
</html>