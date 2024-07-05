<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student management</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="/student-management/URLToReachResourcesFolder/css/add-students.css">
<link rel="stylesheet" type="text/css" href="/student-management/URLToReachResourcesFolder/css/my-style-sheet.css">
</head>
<body class = "myFonts">

<!-- create a spring from where the user can enter data  -->
<div align="center">

<h1 style = "color:steelblue">Update Student</h1>

<form:form action="save-student" modelAttribute="student" method = "POST" style = " width: 400px;
    height: 250px;
    border-radius: 10px;
    border: 1px solid;
    box-shadow: 4px 4px 14px 0;
    padding: 12px;
    " >

<form:hidden path="id"/>

<label>Name :</label>
<form:input path="name" style = "margin : 10px"/>

<br/>

<label>Mobile:</label>
<form:input path="mobile" style = "    position: relative;
    right: 10px;
    margin: 10px 0;"/>

<br/>

<label>Country:</label>
<form:input path="country" style = "position: relative;
    right: 10px;
    margin: 10px 0;"/>

<br/>

<input type ="submit" value="submit" style = "margin: 10px 0;
    border: none;
    background-color: steelblue;
    border-radius: 5px;
    color: white;
    font-size: 16px;
    padding: 10px;">

</form:form>
</div>
</body>
</html>