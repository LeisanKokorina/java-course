<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<html>
<head>
    <title>ЖД- Пассажир</title>
</head>
<body>
<h1>Поздравляем, Вы добавили пассажира. Id -${model.id} </h1>
</body>
</html>