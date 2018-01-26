<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<html>
<head>
    <title>Паспорт</title>
</head>
<body>
<table>
    <tr>
        <th>ID</th>
        <th>Номер</th>


    </tr>
    <#list model.passports as passport>
    <tr>
        <td>${passport.id}</td>
        <td>${passport.number}</td>


    </tr>
    </#list>
</table>
</body>
</html>