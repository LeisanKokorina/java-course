<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>

<html>
<head>
    <title>ЖД- Станция</title>
</head>
<body>
<div>

    <div style="float: right; line-height: 15px"><p><a href="/">Главная</a>/<a href="/logout">Выйти</a></p></div>

</div>
<h1>Поздравляем, Вы добавили поезд id - ${model.id} </h1>
</body>
</html>