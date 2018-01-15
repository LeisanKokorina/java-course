<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ticket</title>

</head>
<body>
<h1>${Ticket}</h1>
<table>
    <tr>
        <th>Id</th>
        <th>Passenger</th>
        <th>Document</th>
        <th>№ Train</th>
        <th>From</th>
        <th>To</th>
        <th>№ Carriage</th>
        <th>№ Place</th>

    </tr>
    <c:forEach items="${tickets}" var="ticket">
        <tr>
            <td>${ticket.id}</td>
            <td>${ticket.owner}</td>
            <td>${ticket.ownerDocument}</td>
            <td>${ticket.trainId}</td>
            <td>${ticket.departureStationId}</td>
            <td>${ticket.arrivalStationId}</td>
            <td>${ticket.carriage}</td>
            <td>${ticket.place}</td>
            <td><a href="/ticketUpdate/${ticket.id}">Редактировать</a></td>
            <td><a href="/ticketDelete/${ticket.id}">Удалить</a></td>
        </tr>
    </c:forEach>
</table>
<form action="/ticketSave" method="post">
    <input type="text" name="owner" placeholder="Passenger">
    <input type="text" name="ownerDocument" placeholder="Document">
    <input type="text" name="trainId" placeholder="№ Train">
    <input type="text" name="departureStationId" placeholder="From">
    <input type="text" name="arrivalStationId" placeholder="To">
    <input type="text" name="carriage" placeholder="№ Carriage">
    <input type="text" name="place" placeholder="№ Place">

    <input type="submit"value="Сохранить">
</form>
</body>
</html>
