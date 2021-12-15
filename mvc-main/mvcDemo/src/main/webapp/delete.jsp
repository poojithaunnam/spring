<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html; charset=ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Delete</title>
</head>
<body>



    <form action="save" method="post">
        <table>
            <tr>
                <td>Enter ID to be deleted:</td><td><input type="number" name="id"></td>
            </tr>

            <tr>
                <td>
                    <input type="submit" value="deletes"></td>
            </tr>
        </table>
    </form>
</h2>
<h3>Hii ${emp.name} your designation is ${emp.desig}</h3>
<h3>Employee Details</h3>

</tbody>
</table>
</body>
</html>