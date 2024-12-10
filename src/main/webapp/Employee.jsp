<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 12/10/2024
  Time: 3:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employee List</title>
</head>
<body>
<h1>Employee List</h1>
<a href="employees?action=new">Add New Employee</a>
<form action="employees" method="get">
    <input type="text" name="query" placeholder="Search by name or ID">
    <input type="submit" value="Search"> </form> <table border="1">
    <thead>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Age</th>
        <th>Position</th>
        <th>Department</th>
        <th>Salary</th>
        <th>Actions</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="employee" items="${employees}">
        <tr>
            <td>${employee.ID}</td>
            <td>${employee.name}</td>
            <td>${employee.age}</td>
            <td>${employee.JobPosition}</td>
            <td>${employee.Department}</td>
            <td>${employee.Salary}</td>
            <td>
                <a href="employees?action=edit&id=${employee.id}">Edit</a>
                <a href="employees?action=delete&id=${employee.id}">Delete</a>
                <a href="employees?action=view&id=${employee.id}">View</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
