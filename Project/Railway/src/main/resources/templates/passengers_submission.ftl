<#ftl encoding='UTF-8'>
<html>
<head>
    <title>ЖД- Пассажиры</title>
    <script type="text/javascript" src="/js/form_script.js"></script>
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>
<form class="form-style-4" title="Станции"
      name="PassengerForm"
      method="post"
      action="/insertPassengers">
    <input type="text" name="firstName" placeholder="Имя"/>
    <br>
    <input type="text" name="middleName" placeholder="Отчество"/>
    <br>
    <input type="text" name="lastName" placeholder="Фамилия"/>
    <br>
    <input type="text" name="document" placeholder="Документ"/>
    <br>

    <input type="submit"/>
</form>
</body>
</html>