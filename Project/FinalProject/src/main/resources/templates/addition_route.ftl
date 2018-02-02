<#ftl encoding='UTF-8'>
<html>
<head>
    <title>ЖД- Маршрут</title>
    <script type="text/javascript" src="/js/form_script.js"></script>
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>
<h2>Добавьте маршрут</h2>
<form class="form-style-4" title="Станции"
      name="RouteForm"
      method="post"
      action="/insertRoute">
    <input type="text" name="origin" placeholder="Станция отправления"/>
    <input type="text" name="destination" placeholder="Станция прибытия"/>


    <input type="submit"/>
</form>
</body>
</html>