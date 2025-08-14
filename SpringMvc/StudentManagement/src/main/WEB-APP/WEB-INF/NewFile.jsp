<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head><title>Students</title></head>
<body>
  <h1>Student List</h1>
  <a href="${pageContext.request.contextPath}/students/new">Add Student</a>
  <table border="1" cellpadding="8">
    <tr><th>ID</th><th>Name</th><th>Email</th><th>Course</th><th>Actions</th></tr>
    <c:forEach var="stu" items="${students}">
      <tr>
        <td>${stu.id}</td>
        <td>${stu.name}</td>
        <td>${stu.email}</td>
        <td>${stu.course}</td>
        <td>
          <a href="${pageContext.request.contextPath}/students/edit/${stu.id}">Edit</a> |
          <a href="${pageContext.request.contextPath}/students/delete/${stu.id}"
             onclick="return confirm('Delete?')">Delete</a>
        </td>
      </tr>
    </c:forEach>
  </table>
</body>
</html>
