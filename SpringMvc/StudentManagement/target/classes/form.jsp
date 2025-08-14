<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head><title>Student Form</title></head>
<body>
  <h1><c:choose>
      <c:when test="${student.id != null}">Edit Student</c:when>
      <c:otherwise>Add Student</c:otherwise>
    </c:choose></h1>

  <form:form method="post" modelAttribute="student"
             action="${student.id != null ? pageContext.request.contextPath + '/students/update/' + student.id : pageContext.request.contextPath + '/students/save'}">
    <table>
      <tr>
        <td><form:label path="name">Name:</form:label></td>
        <td><form:input path="name"/></td>
        <td><form:errors path="name" cssClass="error"/></td>
      </tr>
      <tr>
        <td><form:label path="email">Email:</form:label></td>
        <td><form:input path="email"/></td>
        <td><form:errors path="email" cssClass="error"/></td>
      </tr>
      <tr>
        <td><form:label path="course">Course:</form:label></td>
        <td><form:input path="course"/></td>
        <td><form:errors path="course" cssClass="error"/></td>
      </tr>
      <tr>
        <td colspan="3">
          <input type="submit" value="Save"/>
          <a href="${pageContext.request.contextPath}/students">Cancel</a>
        </td>
      </tr>
    </table>
  </form:form>
</body>
</html>
