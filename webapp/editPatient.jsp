<%@ page import="com.hospital.model.Patient" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Update Patient</title>
</head>
<body>
    <h2>Update Patient Details</h2>
    <form action="updatePatient" method="post">
        <input type="hidden" name="id" value="${patient.id}" />
        Name: <input type="text" name="name" value="${patient.name}" readonly /><br><br>
        Age: <input type="text" name="age" value="${patient.age}" readonly /><br><br>
        Gender: <input type="text" name="gender" value="${patient.gender}" readonly /><br><br>
        Contact: <input type="text" name="contact" value="${patient.contact}" readonly /><br><br>
        Illness: <input type="text" name="illness" value="${patient.illnessDescription}" /><br><br>
        Doctor ID: <input type="text" name="doctorId" value="${patient.doctorId}" /><br><br>
        Room Number: <input type="text" name="room" value="${patient.roomNumber}" /><br><br>
        <input type="submit" value="Update Patient">
    </form>
</body>
</html>
