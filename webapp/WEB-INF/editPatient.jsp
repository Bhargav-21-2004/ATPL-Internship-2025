<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Edit Patient</title>
</head>
<body>
    <h2>Edit Patient Details</h2>
    <form action="updatePatient" method="post">
        <input type="hidden" name="id" value="${patient.id}" />

        Name: <input type="text" name="name" value="${patient.name}" required /><br/><br/>
        Age: <input type="number" name="age" value="${patient.age}" required /><br/><br/>
        Gender: <input type="text" name="gender" value="${patient.gender}" required /><br/><br/>
        Contact: <input type="text" name="contact" value="${patient.contact}" required /><br/><br/>
        Illness: <input type="text" name="illness" value="${patient.illnessDescription}" /><br/><br/>
        Doctor ID: <input type="number" name="doctorId" value="${patient.doctorId}" /><br/><br/>
        Room: <input type="text" name="room" value="${patient.roomNumber}" /><br/><br/>

        <input type="submit" value="Update Patient" />
    </form>
</body>
</html>
