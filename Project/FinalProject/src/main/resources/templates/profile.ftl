<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<html lang="en">
<head>
    <title>Личный кабинет</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link href="css/style.css" rel="stylesheet" type="text/css" />
</head>
<body>


<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>

        </div>
        <div class="collapse navbar-collapse" id="myNavbar">
            <ul class="nav navbar-nav">
                <li class="active"><a href="/">Главная</a></li>


                <li><a href="#">Контакты</a></li>
            </ul>
        <#if model.user??>
            ${model.user.name}
            <ul class="nav navbar-nav navbar-right">
                <li><a href="/logout"><span class="glyphicon glyphicon-log-in"></span> Выйти</a></li>
            </ul>
        <#else>
        <ul class="nav navbar-nav navbar-right">
            <li><a href="/login"><span class="glyphicon glyphicon-log-in"></span> Вход</a></li> / <li><a href="/registration"><span class="glyphicon glyphicon-log-in"></span> Регистрация</a></li>
        </ul>
        </#if>
        </div>
    </div>
</nav>

<#if model.role == "ADMIN">

<div class="container">
    <h3>Администрирование</h3>
    <ul class="nav nav-tabs">

        <li class="dropdown">
            <a class="dropdown-toggle" data-toggle="dropdown" href="/routes?order_by=id">Список маршрутов
                <span class="caret"></span></a>
            <ul class="dropdown-menu">

                <li><a href="/routes?order_by=id">По id</a></li>

            </ul>
        </li>
        <li class="dropdown">
            <a class="dropdown-toggle" data-toggle="dropdown" href="/trains?order_by=id">Список поездов
                <span class="caret"></span></a>
            <ul class="dropdown-menu">
                <li><a href="/trains?order_by=train_number">По  номеру поезда</a></li>
            </ul>
        </li>
        <li class="dropdown">
            <a class="dropdown-toggle" data-toggle="dropdown" href="/trains?order_by=id">Маршрут
                <span class="caret"></span></a>
            <ul class="dropdown-menu">
                <li><a href="/insert/route">Добавить маршрут</a></li>
            </ul>
        </li>
        <li class="dropdown">
            <a class="dropdown-toggle" data-toggle="dropdown" href="/trains?order_by=id">Поезд
                <span class="caret"></span></a>
            <ul class="dropdown-menu">
                <li><a href="/insert/train">Добавить поезд</a></li>
            </ul>
        </li>

    </ul>
    <br>

</div>



<#else>
<h1>Привет, ${model.user.name} ${model.user.surname}</h1>
</#if>

<footer class="container-fluid text-right">
    <p>@springrain</p>
</footer>

</body>
</html>





























