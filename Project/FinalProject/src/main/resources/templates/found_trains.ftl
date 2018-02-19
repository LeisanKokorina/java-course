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
        <div class="col-sm-1 sidenav">

        </div>
        <div class="col-sm-10 text-center">
            <div class="well"><h2>Список поездов</h2></div>


            <table class="table table-striped">
                <thead>
                <tr>

                    <th>Поезд</th>
                    <th>Маршрут</th>
                    <th>Отправление</th>
                    <th>Прибытие</th>
                    <th>Цена</th>
                    <td>Билеты</td>

                </tr>
                </thead>
                <tbody>
                     <#list model.trains as train >
                     <tr>

                         <td>${train.trainNumber}</td>
                         <td>${train.departure} - ${train.destination}</td>

                     </#list>
                    <#list model.routes as route>


                         <td>${route.departureDate} ${route.departureTime}
                             <br>
                             ${route.pickUpPoint}</td>
                         <td>${route.arrivalDate} ${route.arrivalTime}
                             <br>
                             ${route.routePoint}</td>

                         <td> ${route.price}</td>




                    <td>
                        <#if model.user??>
                    <form title="Билет"
                          name="RouteForm"
                          method="Post"
                          action="/ticket">

                        <input type="hidden" name="pickUpPoint" value="${route.pickUpPoint}"  >


                        <input  type="hidden" name="routePoint" value="${route.routePoint}" >


                        <input  type="hidden" name="departureDate"  value="${route.departureDate}" >


                        <input  type="hidden" name="arrivalDate" value="${route.arrivalDate}" >


                        <input  type="hidden"  name="departureTime" value="${route.departureTime}" >


                        <input  type="hidden"   name="arrivalTime" value="${route.arrivalTime}">


                        <input  type="hidden"  name="price" value="${route.price}" >


                        <input  type="hidden"  name="trainId" value="${route.train.id}" >





                            <!-- Trigger the modal with a button -->
                            <button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#myModal">Продолжить</button>

                            <!-- Modal -->
                            <div class="modal fade" id="myModal" role="dialog">
                                <div class="modal-dialog">

                                    <!-- Modal content-->
                                    <div class="modal-content">
                                        <div class="modal-header">
                                            <button type="button" class="close" data-dismiss="modal">&times;</button>
                                            <h4 class="modal-title">Внимание!</h4>
                                        </div>
                                        <div class="modal-body">
                                            <p>Сервис временно не доступен</p>
                                        </div>
                                        <div class="modal-footer">
                                            <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                                        </div>
                                    </div>

                                </div>
                            </div>


                    </form>
                        </td>
                        <#else>

                        <td><p><a href="/login">Войдите, чтобы купить билет</a></p></td>


                    </#if>


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