<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<html lang="en">
<head>
    <title>ЖД- Найденные поезда</title>
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
        <div class="col-sm-10 text-center">

            <h2>Данные пассажира</h2>
            <p>Обратите внимание ребенок до 10 лет <mark> не может ехать без взрослого</mark>.
                Ребенка не посадят в поезд без сопровождающего взрослого. Вы можете оформить детский билет отдельно от билета для сопровождающего</p>
            <form title="Информация о пассажире"
                  name="PassengerForm"
                  method="post"
                  action="/insertPassengers">


                <button type="button" class="btn btn-link" data-toggle="collapse" data-target="#demo">Какой билет выбрать для ребенка?</button>
                <div id="demo" class="collapse">
                    У одного взрослого может быть только один детский билет «без места», у двух — два и т.д.
                    Возраст ребенка — сколько лет ему будет в день отправления поезда.
                    Точная стоимость детского билета с отдельным местом зависит от типа вагона, услуг в вагоне и т.п.
                    Она равна примерно 35-50% от стоимости билета для взрослых. Итоговая цена будет определена на шаге завершения заказа.
                </div>
                <div class="input-group">

                    <input id="first" type="text" class="form-control" name="firstName" placeholder="Имя">
                </div>
                <div class="input-group">

                    <input id="middle" type="text" class="form-control" name="middleName" placeholder="Отчество">
                </div>
                <div class="input-group">

                    <input id="last" type="text" class="form-control" name="lastName" placeholder="Фамилия">
                </div>
                <div class="input-group">

                    <input id="sex" type="text"  class="form-control" name="sex" placeholder="M/Ж">
                </div>
                <div class="input-group">

                    <input id="document" type="text" class="form-control" name="document" placeholder="Документ">
                </div>
                <div class="input-group">

                    <input id="birthday" type="date" class="form-control" name="birthday" placeholder="Дата рождения">
                </div>

                <input type="submit" value="Продолжить">
            </form>

        </div>
    </div>
</div>

<footer class="container-fluid text-right">
    <p>@springrain</p>
</footer>

</body>
</html>