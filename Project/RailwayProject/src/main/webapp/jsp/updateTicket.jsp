
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ticket updating</title>

</head>

<body>

<div>
    <h1>Ticket updating</h1>
    <form action="/ticketUpdate" method="post">
        <table>
            <tr>
                <td>${ticket.id}</td>
                <td>${ticket.owner}</td>
                <td>${ticket.ownerDocument}</td>
                <td>${ticket.trainId}</td>
                <td>${ticket.departureStationId}</td>
                <td>${ticket.arrivalStationId}</td>
                <th>confirm</th>
            </tr>
            <tr>
                <td><input type="text" name="id" value="${ticket.id}" readonly></td>
                <td><input type="text" name="owner" value="${ticket.owner}"></td>
                <td><input type="text" name="ownerDocument" value="${ticket.ownerDocument}"></td>
                <td><input type="text" name="trainId" value="${ticket.trainId}"></td>
                <td><input type="text" name="departureStationId" value="${ticket.departureStationId}"></td>
                <td><input type="text" name="arrivalStationId" value="${ticket.arrivalStationId}"></td>

                <td><input type="submit" value="Save"></td>
            </tr>
        </table>
    </form>

</div>
</body>
</html>
