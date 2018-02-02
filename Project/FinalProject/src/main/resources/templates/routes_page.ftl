<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<html>
<head>
    <title>Маршруты</title>
</head>
<body>
<table>
    <tr>
        <th>ID</th>
        <th>Станция отправления</th>
        <th>Станция прибытия</th>

    </tr>
    <#list model.routes as route>
    <tr>
        <td>${route.id}</td>
        <td>${route.origin}</td>
        <td>${route.destination}</td>

    </tr>
    </#list>
</table>
</body>
</html>