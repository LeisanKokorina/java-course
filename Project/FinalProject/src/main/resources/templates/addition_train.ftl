<#ftl encoding='UTF-8'>
<#include 'common/header.ftl'/>
<html>
<head>
    <title>ЖД- Маршрут</title>
    <script type="text/javascript" src="/js/form_script.js"></script>
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>
<h2>Добавьте маршрут</h2>
<form class="form-style-4" title="Станции"
      name="TrainForm"
      method="post"
      action="/insert/train">
    <input type="text" name="trainNumber" placeholder="№ поезда"/>
    <input type="text" name="routeId" placeholder="№ Ммаршрута"/>

    <input type="text" name="departureDate" placeholder="Дата отправления"/>
    <input type="text" name="arrivalDate" placeholder="Дата прибытия"/>
    <input type="text" name="departureTime" placeholder="Время отправления"/>
    <input type="text" name="arrivalTime" placeholder="Время прибытия"/>



    <input type="submit"/>
</form>
</body>
</html>