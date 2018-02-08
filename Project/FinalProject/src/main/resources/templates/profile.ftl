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
  <a href="/trains?order_by=id"> Список поездов</a>
  <a href="/routes?order_by=id"> Маршруты</a>
<#else>
<h1>hjhjhjhjhj</h1>
</#if>


</body>
</html>




