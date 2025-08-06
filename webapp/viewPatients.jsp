<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>All Patients</title>
    <style>
        table {
            width: 90%;
            margin: auto;
            border-collapse: collapse;
        }
        th, td {
            border: 1px solid #ccc;
            padding: 10px;
            text-align: center;
        }
        th {
            background-color: #f2f2f2;
        }
        h2 {
            text-align: center;
        }
        .center {
            text-align: center;
        }
    </style>
</head>
<body>

<h2>Patient List</h2>



<form action="viewPatients" method="get" style="text-align: center; margin-bottom: 20px;">
    Search by Patient ID:
    <input type="text" name="searchId" placeholder="Enter Patient ID" />
    <input type="submit" value="Search" />
</form>


<c:if test="${not empty errorMessage}">
    <p style="color: red; text-align: center;">${errorMessage}</p>
</c:if>



<c:if test="${empty patients}">
    <p class="center">No patients found.</p>
</c:if>

<!-- Patient Table -->
<c:if test="${not empty patients}">
    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Age</th>
            <th>Gender</th>
            <th>Contact</th>
            <th>Illness</th>
            <th>Doctor ID</th>
            <th>Room</th>
            <th>Status</th>
            <th>Actions</th>
        </tr>

        <c:forEach var="patient" items="${patients}">
            <tr>
                <td>${patient.id}</td>
                <td>${patient.name}</td>
                <td>${patient.age}</td>
                <td>${patient.gender}</td>
                <td>${patient.contact}</td>
                <td>${patient.illnessDescription}</td>
                <td>${patient.doctorId}</td>
                <td>${patient.roomNumber}</td>

                <td>
                    <c:choose>
                        <c:when test="${patient.dischargeStatus}">
                            <span style="color: green;">Discharged</span>
                        </c:when>
                        <c:otherwise>
                            <a href="dischargePatient?id=${patient.id}" onclick="return confirm('Mark patient as discharged?')">Discharge</a>
                        </c:otherwise>
                    </c:choose>
                </td>

                <td>
                    <a href="editPatient?id=${patient.id}">Edit</a> |
                    <a href="deletePatient?id=${patient.id}" onclick="return confirm('Are you sure you want to delete?')">Delete</a>
                    <a href="${pageContext.request.contextPath}/dischargePatient?id=${patient.id}" 
   onclick="return confirm('Mark patient as discharged?')"></a>
                    
                </td>
            </tr>
        </c:forEach>
    </table>
</c:if>

</body>
</html>
