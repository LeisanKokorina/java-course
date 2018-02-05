<#ftl encoding='UTF-8'>

<html>
<head>
    <title>ЖД- Маршрут</title>
    <script type="text/javascript" src="/js/form_script.js"></script>
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>
<div>

    <div style="float: right; line-height: 15px"><p><a href="/">Главная</a>/<a href="/logout">Выйти</a>

    <br><a href="/profile">Администрирование</a></p> </div>



</div>
<h2>Добавьте маршрут</h2>
<form class="form-style-4" title="Станции"
      name="RouteForm"
      method="post"
      action="/insert/route">
    <input type="text" name="origin" placeholder="Станция отправления"/>
    <input type="text" name="destination" placeholder="Станция прибытия"/>


    <input type="submit"/>
</form>
</body>
</html>