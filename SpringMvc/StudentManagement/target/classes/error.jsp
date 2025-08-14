<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head><title>Error</title></head>
<body>
  <h1>Oops — an error occurred</h1>
  <p>${message}</p>
  <a href="${pageContext.request.contextPath}/students">Back to list</a>
</body>
</html>
