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
    <c:forEach items="${users}" var="person">
        <tr>
            <td>${person.id}</td>
            <td>${person.firstName}</td>
            <td>${person.middleName}</td>
            <td>${person.lastName}</td>
            <td>${person.documentId}</td>


            <td><a href="/personUpdate/${person.id}">Редактировать</a></td>
            <td><a href="/personDelete/${person.id}">Удалить</a></td>
        </tr>
    </c:forEach>

</table>
<form action="/personSave" method="post">
    <input type="text" name="firstName" placeholder="First name">
    <input type="text" name="middleName" placeholder="Middle name">
    <input type="text" name="lastName" placeholder="Last name">
    <input type="text" name="documentId" placeholder="Document">

    <input type="submit"value="Сохранить">
</form>
</body>
</html>
