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
    <style>
        /* Remove the navbar's default margin-bottom and rounded borders */
        .navbar {
            margin-bottom: 0;
            border-radius: 0;
        }

        /* Set height of the grid so .sidenav can be 100% (adjust as needed) */
        .row.content {height: 450px}

        /* Set gray background color and 100% height */
        .sidenav {
            padding-top: 20px;
            background-color: lightgray;
            height: 100%;
        }

        /* Set black background color, white text and some padding */
        footer {
            background-color: #555;
            color: white;
            padding: 15px;
        }

        /* On small screens, set height to 'auto' for sidenav and grid */
        @media screen and (max-width: 767px) {
            .sidenav {
                height: auto;
                padding: 15px;
            }
            .row.content {height:auto;}
        }
    </style>
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
            <a class="navbar-brand" href="/static/img/train-5-256.png">Logo</a>
        </div>
        <div class="collapse navbar-collapse" id="myNavbar">
            <ul class="nav navbar-nav">
                <li class="active"><a href="/">Главная</a></li>


                <li><a href="#">Контакты</a></li>
            </ul>
        <#if model.user??>
            ${model.user.name}
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
            <p><a href="/profile">Личный кабинет</a></p>

                <form title="Найти поезд"
                      name="MainPageForm"
                      method="post"
                      action="/">
                    <div class="input-group">

                        <input id="from" type="text" class="form-control" name="pickUpPoint" placeholder="Откуда">
                    </div>
                    <div class="input-group">

                        <input id="to" type="text" class="form-control" name="routePoint" placeholder="Куда">
                    </div>
                    <br>
                    <div class="input-group">

                        <input id="date" type="date" class="form-control" name="departureDate" placeholder="2018-12-22">
                    </div>
                    <br>
                    <div>
                        <input type="submit">

                    </div>


                </form>

        </div>
        <div class="col-sm-8 text-center">
            <h1>Бронирование ЖД билетов</h1>


        </div>





    </div>
</div>

<footer class="container-fluid text-center">
    <p>@springrain</p>
</footer>

</body>
</html>
