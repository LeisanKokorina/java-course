<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<#include 'common/header1.ftl'/>
<html>
<head>
    <title> Покупка ЖД Билетов </title>

</head>


<body>

<h1>Привет, ${model.user.name}</h1>

<#if model.role == "ADMIN">
  <a href="/insert/route"> Добавить маршрут</a>
  <a href="/insert/train"> Добавить поезд</a>
  <a href="/trains"> Список поездов</a>
  <a href="/routes"> Маршруты</a>
<#else>
 <tr>
     <th>ID</th>
     <th>Номер поезда</th>
     <th>Цена</th>
     <th>Дата отправления</th>
     <th>Время отправления</th>
     <th>Дата прибытия</th>
     <th>Время прибытия</th>
 </tr>
    <#list model.trains as train>
    <tr>
        <td>${train.id}</td>
        <td>${train.trainNumber}</td>
        <td>${train.fare}</td>
        <td>${train.departureDate}</td>
        <td>${train.departureTime}</td>
        <td>${train.arrivalDate}</td>
        <td>${train.arrivalTime}</td>
    </tr>
    </#list>
</#if>


</body>
</html>




