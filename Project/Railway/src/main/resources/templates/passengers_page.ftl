<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<html>
<head>
    <title>Пассажиры</title>
</head>
<body>
<table>
    <tr>
        <th>ID</th>
        <th>Имя</th>
        <th>Отчество</th>
        <th>Фамилия</th>
        <th>Документ</th>

    </tr>
    <#list model.passengers as passenger>
    <tr>
        <td>${passenger.id}</td>
        <td>${passenger.firstName}</td>
        <td>${passenger.middleName}</td>
        <td>${passenger.lastName}</td>
        <td>${passenger.document}</td>

    </tr>
    </#list>
</table>
</body>
</html>