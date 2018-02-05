<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<#include 'common/header.ftl'/>
<html>
<head>
    <title>Информация о поезде</title>
</head>
<body>
<table>
    <tr>
        <th>ID</th>
        <th>Номер поезда</th>
        <th>Номер маршрута</th>
        <th>Цена билета</th>
        <th>Дата отправления</th>
        <th>Время отправления</th>
        <th>Дата прибытия</th>
        <th>Время прибытия</th>


    </tr>
    <#list model.trains as train>
    <tr>
        <td>${train.id}</td>
        <td>${train.trainNumber}</td>
        <td>${train.routeId}</td>
        <td>${train.fare}</td>
        <td>${train.departureDate}</td>
        <td>${train.departureTime}</td>
        <td>${train.arrivalDate}</td>
        <td>${train.arrivalTime}</td>


    </tr>
    </#list>
</table>
</body>
</html>