
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Passenger updating</title>

</head>
<body>
<div>
    <h1>Passenger updating</h1>
    <form action="/personUpdate" method="post">
        <table>
            <tr>
                <td>${person.id}</td>
                <td>${person.firstName}</td>
                <td>${person.middleName}</td>
                <td>${person.lastName}</td>
                <td>${person.documentId}</td>
                <th>confirm</th>
            </tr>
            <tr>
                <td><input type="text" name="id" value="${person.id}" readonly></td>
                <td><input type="text" name="firstName" value="${person.firstName}"></td>
                <td><input type="text" name="middleName" value="${person.middleName}"></td>
                <td><input type="text" name="lastName" value="${person.lastName}"></td>
                <td><input type="text" name="documentId" value="${person.documentId}"></td>

                <td><input type="submit" value="Save"></td>
            </tr>
        </table>
    </form>

</div>
</body>
</html>
