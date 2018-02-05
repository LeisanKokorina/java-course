<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>

<html>
<head>
    <title>ЖД- Главная</title>
    <script type="text/javascript" src="/js/form_script.js"></script>
    <link rel="stylesheet" href="/css/style.css">
<h2> ${model.dateNow}</h2>


</head>
<body>
<#if model.user??>
<div>

    ${model.user.name}

    <div style="float: right; line-height: 20px"><p><a href="/profile">Личный кабинет</a> / <a href="/logout">Выйти</a></p></div>
</div>
<#else>
<div>
    <div>

        <div style="float: right; line-height: 20px"><p><a href="/login">Вход</a>/<a href="/registration">Регистрация</a> </p></div>
    </div>
</div>
</#if>
<form class="form-style-4" title="Выбор маршрута"
      name="MainPageForm"
      method="get"
      action="/profile">
    <input type="text" name="origin" placeholder="Откуда"/>
    <br>
    <input type="text" name="destination" placeholder="Куда"/>
    <br>
    <input type="text" name="departureDate" placeholder="Дата"/>
    <br>


    <input type="submit" value="Найти маршрут"/>
</form>

</body>
</html>