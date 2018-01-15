<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Stations</title>

</head>
<body>
<h1>${Station}</h1>
<table>
    <tr>
        <th>Id</th>
        <th>Name</th>

    </tr>
    <c:forEach items="${stations}" var="station">
        <tr>
            <td>${station.id}</td>
            <td>${station.name}</td>


        </tr>
    </c:forEach>
</table>
<form action="/stationSave" method="post">
    <input type="text" name="name" placeholder="Name">

    <input type="submit" value="Save">
</form>
</body>
</html>
