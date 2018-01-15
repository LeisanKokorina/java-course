
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Schedule updating</title>

</head>
<body>
<div>
    <h1>Schedule updating</h1>
    <form action="/scheduleUpdate" method="post">
        <table>
            <tr>
                <td>${schedule.id}</td>
                <td>${schedule.trainId}</td>
                <td>${schedule.station}</td>
                <td>${schedule.departureTime}</td>
                <td>${schedule.arrivalTime}</td>

                <th>confirm</th>
            </tr>
            <tr>
                <td><input type="text" name="id" value="${schedule.id}" readonly></td>
                <td><input type="text" name="trainId" value="${schedule.trainId}"></td>
                <td><input type="text" name="station" value="${schedule.station}"></td>
                <td><input type="text" name="departureTime" value="${schedule.departureTime}"></td>
                <td><input type="text" name="arrivalTime" value="${schedule.arrivalTime}"></td>

                <td><input type="submit" value="Save"></td>
            </tr>
        </table>
    </form>

</div>
</body>
</html>
