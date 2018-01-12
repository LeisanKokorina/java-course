<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Passengers</title>

</head>
<body>
<h1>${Passengers}</h1>
<table>
    <tr>
        <th>Id</th>
        <th>First name</th>
        <th>Middle name</th>
        <th>Last name</th>
        <th>Document</th>

    </tr>
    <c:forEach items="${person}" var="person">
        <tr>
            <td>${person.id}</td>
            <td>${person.first_name}</td>
            <td>${person.middle_name}</td>
            <td>${person.last_name}</td>
            <td>${person.document_id}</td>
        </tr>
    </c:forEach>
</table>
<form action="/person" method="post">
    <input type="text" name="first_name" placeholder="First name">
    <input type="text" name="middle_name" placeholder="Middle name">
    <input type="text" name="last_name" placeholder="Last name">
    <input type="text" name="document_id" placeholder="Document">
    <input type="submit"value="Сохранить">
</form>
</body>
</html>
