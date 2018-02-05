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
<h1>Поздравляем, Вы добавили маршрут № ${model.id} </h1>
<a href="/insert/route"> Добавить маршрут</a>
<a href="/insert/train"> Добавить поезд</a>
<a href="/trains"> Список поездов</a>
<a href="/routes"> Маршруты</a>
</body>
</html>