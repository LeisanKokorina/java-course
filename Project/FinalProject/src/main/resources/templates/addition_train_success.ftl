<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<html>
<head>
    <title>ЖД- Станция</title>
</head>
<body>
<h1>Поздравляем, Вы добавили поезд id - ${model.id} </h1>
</body>
</html>