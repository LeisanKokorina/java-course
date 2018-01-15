
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Station updating</title>

</head>
<body>
<div>
    <h1>Station updating</h1>
    <form action="/stationUpdate" method="post">
        <table>
            <tr>
                <td>${station.id}</td>
                <td>${station.name}</td>

                <th>confirm</th>
            </tr>
            <tr>
                <td><input type="text" name="id" value="${station.id}" readonly></td>
                <td><input type="text" name="name" value="${station.name}"></td>

                <td><input type="submit" value="Save"></td>
            </tr>
        </table>
    </form>

</div>
</body>
</html>
