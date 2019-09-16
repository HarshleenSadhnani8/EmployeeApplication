<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EMPAPP</title>
</head>
<body>
    <h1>Employee Details</h1>
    
    <form action="addEmployee">
    <input type="submit" value="Add Employee"/>
    
    </form>
    <br/>
    <table border="1">
        <tr>
            <th>Employee Id</th>
            <th>Name</th>
            <th>gender</th>
            <th>age</th>
            <th>salary</th>
            <th colspan="2">Actions</th>
        </tr>
        <c:forEach var="employee" items="${employees}">
            <tr>
                <td>${employee.id }</td>
                <td>${employee.name }</td>
                <td>${employee.gender }</td>
                <td>${employee.age }</td>
                <td>${employee.salary }</td>
  				  <td><a href="delete?id=${employee.id}">delete</a></td>
                <td><a href="update?id=${employee.id}">Update</a></td>

            </tr>
        </c:forEach>
    </table>
</body>
</html>