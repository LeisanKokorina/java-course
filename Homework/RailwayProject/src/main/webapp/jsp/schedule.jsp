<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Schedule</title>

</head>
<body>
<h1>${Schedule}</h1>
<table>
    <tr>
        <th>Id</th>
        <th>Train</th>
        <th>Station</th>
        <th>Departure time</th>
        <th>Arrival time</th>


    </tr>
    <c:forEach items="${schedules}" var="schedule">
        <tr>
            <td>${schedule.id}</td>
            <td>${schedule.trainId}</td>
            <td>${schedule.station}</td>
            <td>${schedule.departureTime}</td>
            <td>${schedule.arrivalTime}</td>

        </tr>
    </c:forEach>
</table>
<form action="/scheduleSave" method="post">
    <input type="text" name="trainId" placeholder="Train">
    <input type="text" name="station" placeholder="Station">
    <input type="text" name="departureTime" placeholder="Departure time">
    <input type="text" name="arrivalTime" placeholder="Arrival time">
    <input type="submit" value="Сохранить">
</form>
</body>
</html>

