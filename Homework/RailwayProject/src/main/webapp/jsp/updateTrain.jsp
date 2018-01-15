
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Train updating</title>

</head>
<body>
<div>
    <h1>Train updating</h1>
    <form action="/trainUpdate" method="post">
        <table>
            <tr>
                <td>${train.id}</td>
                <td>${train.number}</td>

                <td>${train.departure}</td>
                <td>${train.arrival}</td>
                <th>confirm</th>
            </tr>
            <tr>
                <td><input type="text" name="id" value="${train.id}" readonly></td>
                <td><input type="text" name="number" value="${train.number}"></td>
                <td><input type="text" name="departure" value="${train.departure}"></td>
                <td><input type="text" name="arrival" value="${train.arrival}"></td>


                <td><input type="submit" value="Save"></td>
            </tr>
        </table>
    </form>

</div>
</body>
</html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Trains</title>

</head>
<body>
<h1>${Trains}</h1>
<table>
    <tr>
        <th>Id</th>
        <th>№</th>
        <th>Departure station</th>
        <th>Arrival station</th>


    </tr>
    <c:forEach items="${trains}" var="train">
        <tr>
            <td>${train.id}</td>
            <td>${train.number}</td>
            <td>${train.departure}</td>
            <td>${train.arrival}</td>


            <td><a href="/personUpdate/${train.id}">Редактировать</a></td>
            <td><a href="/personDelete/${train.id}">Удалить</a></td>
        </tr>
    </c:forEach>
</table>
<form action="/trainSave" method="post">
    <input type="text" name="number" placeholder="№ ">
    <input type="text" name="departure" placeholder="Departure station">
    <input type="text" name="arrival" placeholder="Arrival station">

    <input type="submit"value="Save">
</form>
</body>
</html>
