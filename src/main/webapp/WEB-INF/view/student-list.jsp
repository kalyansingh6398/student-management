<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored = "false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student management</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="/student-management/URLToReachResourcesFolder/css/my-style-sheet.css">
</head>
<body class ="myFonts">
<div class="container" >
<h1 align = "center">Student Management</h1>

<!-- model Attribute : students -->

<form action="showAddStudentPage">

<input type ="Submit" value="ADD"  class="btn btn-outline-success">

</form>

<br/>

<table border = "1" class="table table-striped">
<thead>
<tr>
<td>id</td>
<td>name</td>
<td>mobile</td>
<td>country</td>
</tr>
</thead>


<c:forEach var="student" items="${students}">
<tr>
   <td>${student.id}</td>
   <td>${student.name}</td>
   <td>${student.mobile}</td>
   <td>${student.country}</td>
   <td><a href = "/student-management/updateStudent?userId=${student.id}">Update</a></td>
    <td><a href = "/student-management/deleteStudent?userId=${student.id}" onclick="if(!(confirm('are you sure you want to delete this student?')))return false">Delete</a></td>
   
</tr>
</c:forEach>
</table>
<img alt="student pic" src="https://img.freepik.com/free-vector/student-studying-desk_1262-21427.jpg?w=2000" style="width:100%; height:100%;">


</div>
</body>
</html>