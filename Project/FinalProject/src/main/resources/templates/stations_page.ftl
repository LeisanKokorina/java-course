<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<html>
<head>
    <title>Станции</title>
</head>
<body>
<table>
    <tr>
        <th>ID</th>
        <th>Имя</th>

    </tr>
    <#list model.stations as station>
    <tr>
        <td>${station.id}</td>
        <td>${station.name}</td>

    </tr>
    </#list>
</table>
</body>
</html>