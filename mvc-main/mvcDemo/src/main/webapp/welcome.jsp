<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html; charset=ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>demo</title>
</head>
<body>

<h2> Hii ${username} </h2>
<hr>
    <h2>Enter Details</h2>
    <h2>

        <form action="save" method="post">
            <table>
                <tr>
                    <td>Enter ID:</td><td><input type="number" name="id"></td>
                </tr>
          <tr>
              <td>Enter Name:</td><td><input type="text" name="name"></td></tr>
           <tr>
                <td>Enter Designation:</td><td><input type="text" name="desig"></td>
        </tr>
            <tr>
            <td>
                <input type="submit" value="save"></td>

            </tr>
            </table>
        </form>
        <form action="delete.jsp" method="post">
            <input type="submit" value="delete"> </td>
        </form>

    </h2>
<h3>Hii ${emp.name} your designation is ${emp.desig}</h3>
<h3>Employee Details</h3>
<table border ="1px solid red">
    <thead>

    <tr>
        <th>Id</th> <th>Name</th><th>Designation</th>
    </tr> </thead> <tbody>
    <c:forEach items="${all}" var="list">
        <tr>
    <td>${list.id}</td>
    <td>${list.name}</td>
    <td>${list.desig}</td>
            <td><a href="delete/${list.id}">delete</a> </td></tr>
    </c:forEach>
</tbody>
</table>
</body>
</html>