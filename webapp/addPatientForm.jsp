<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Patient</title>
</head>
<body>
    <h2>Add Patient Form</h2>
    
    <form action="addPatient" method="post">
        Name: <input type="text" name="name" required><br><br>
        Age: <input type="number" name="age" required><br><br>
        Gender:
        <select name="gender">
            <option>Male</option>
            <option>Female</option>
            <option>Other</option>
        </select><br><br>
        Contact: <input type="text" name="contact" required><br><br>
        Illness Description: <input type="text" name="illness" required><br><br>
        Doctor ID: <input type="number" name="doctorId" required><br><br>
        Room Number: <input type="text" name="room" required><br><br>
        
        <input type="submit" value="Add Patient">
    </form>
</body>
</html>
