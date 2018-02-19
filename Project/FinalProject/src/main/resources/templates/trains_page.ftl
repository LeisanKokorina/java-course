<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<html lang="en">
<head>
    <title>ЖД- Список поездов</title>
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

            <ul class="nav navbar-nav navbar-right">

                <li><a href="/profile"><span class="glyphicon glyphicon-user"></span>Личный кабинет</a></li>
                <li><a href="/logout"><span class="glyphicon glyphicon-log-out"></span> Выйти</a></li>
            </ul>

        </div>

    </div>
</nav>
<div class="container-fluid text-center">
    <div class="row content">
        <div class="col-sm-2 sidenav">

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

        </div>




            <div class="col-sm-10 text-center">
                <h2>Список поездов</h2>

                <table class="table table-striped">
                    <thead>
                    <tr>
                        <th>ID</th>
                        <th>Номер поезда</th>
                        <th>Станция отправления</th>
                        <th>Станция прибытия</th>
                        <!--<th>Дата отправления</th>
                        <th>Время отправления</th>
                        <th>Дата прибытия</th>
                        <th>Время прибытия</th>-->
                    </tr>
                    </thead>
                    <tbody>
                     <#list model.trains as train>
                     <tr>
                         <td>${train.id}</td>
                         <td>${train.trainNumber}</td>
                         <td>${train.departure}</td>
                         <td>${train.destination}</td>

                     </tr>
                     </#list>

                    </tbody>
                </table>
            </div>
    </div>
</div>
<footer class="container-fluid text-right">
    <p>@springrain</p>
</footer>

</body>
</html>