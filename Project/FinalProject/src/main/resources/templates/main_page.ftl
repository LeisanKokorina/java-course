<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<html lang="en">
<head>
    <title>Бронирование ЖД билетов</title>
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

            <ul class="nav navbar-nav navbar-right">
                <li><a href="/profile"><span class="glyphicon glyphicon-traveler"></span>Личный кабинет</a></li>
                <li><a href="/logout"><span class="glyphicon glyphicon-log-out"></span> Выйти</a></li>
            </ul>
        <#else>
        <ul class="nav navbar-nav navbar-right">
            <li><a href="/login"><span class="glyphicon glyphicon-log-in"></span> Вход</a></li> / <li><a href="/registration"><span class="glyphicon glyphicon-log-in"></span> Регистрация</a></li>
        </ul>
        </#if>
        </div>
    </div>
</nav>


<div class="container-fluid text-center">
    <div class="row content">
        <div class="col-sm-2 sidenav">

        </div>
        <div class="col-sm-7 text-center">

            <div class="well"
            <h1>Пассажирам</h1>
            </div>
            <form title="Найти поезд"
                  name="RouteForm"
                  method="post"
                  action="/">
                <div class="form-inline">

                    <div class="form-group">
                        <label for="route">Откуда:</label>
                        <input type="text" class="form-control" name="pickUpPoint"  id="route">
                    </div>
                    <div class="form-group">
                        <label for="to">Куда:</label>
                        <input type="text" class="form-control" name="routePoint" id="to">
                    </div>

                    <div class="form-group">
                        <label for="date">Дата:</label>
                        <input type="date" class="form-control" name="departureDate" id="date">
                    </div>

                    <button  type="submit" class="btn btn-default">Найти поезд</button>
            </form>

        </div>
        <img src="https://cs.pikabu.ru/post_img/2013/10/25/7/1382692194_687472730.gif" class="img-thumbnail" alt="train">
    </div>
</div>



<footer class="container-fluid text-right">
    <p>@springrain</p>
</footer>

</body>
</html>
