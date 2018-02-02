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
      name="TrainForm"
      method="post"
      action="/insertTrain">
    <input type="text" name="trainNumber" placeholder="Станция отправления"/>
    <input type="text" name="routeId" placeholder="Станция прибытия"/>
    <input type="text" name="fare" placeholder="Станция прибытия"/>
    <input type="text" name="departureDate" placeholder="Станция прибытия"/>
    <input type="text" name="arrivalDate" placeholder="Станция прибытия"/>
    <input type="text" name="departureTime" placeholder="Станция прибытия"/>
    <input type="text" name="arrivalTime" placeholder="Станция прибытия"/>
    <input type="text" name="seatCount" placeholder="Станция прибытия"/>


    <input type="submit"/>
</form>
</body>
</html>