<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Passport</title>

</head>
<body>
<h1>${Passport}</h1>
<table>
    <tr>
        <th>Id</th>
        <th>Number</th>
        <th>Owner</th>

    </tr>
    <c:forEach items="${passport}" var="passport">
        <tr>
            <td>${passport.id}</td>
            <td>${passport.number}</td>
            <td>${passport.person_id}</td>
            <
        </tr>
    </c:forEach>
</table>
<form action="/passport" method="post">
    <input type="text" name="number" placeholder="Number">
    <input type="text" name="person_id" placeholder="Owner">

    <input type="submit" value="Сохранить">
</form>
</body>
</html>
