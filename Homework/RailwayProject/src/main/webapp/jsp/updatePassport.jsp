
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Passport updating</title>

</head>
<body>
<div>
    <h1>Passport updating</h1>
    <form action="/passportUpdate" method="post">
        <table>
            <tr>
                <td>${passport.id}</td>
                <td>${passport.number}</td>

                <th>confirm</th>
            </tr>
            <tr>
                <td><input type="text" name="id" value="${passport.id}" readonly></td>
                <td><input type="text" name="number" value="${passport.number}"></td>


                <td><input type="submit" value="Save"></td>
            </tr>
        </table>
    </form>

</div>
</body>
</html>

