<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Пользователи</title>

</head>
<body>
<h1>${hello}</h1>
<table>
    <tr>
        <th>Id</th>
        <th>Имя</th>
        <th>Возраст</th>
        <th>Город</th>
    </tr>
    <c:forEach items="${users}" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td>${user.age}</td>
            <td>${user.citizen}</td>
        </tr>
    </c:forEach>
</table>
<form action="/users_as_jsp" method="post">
    <input type="text" name="name" placeholder="Имя">
    <input type="text" name="age" placeholder="Возраст">
    <input type="text" name="citizen" placeholder="Город">
    <input type="submit">
</form>
</body>
</html>
