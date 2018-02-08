<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<html lang="en">
<head>
    <title>Вход</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
    <h3>Вход</h3>
<#if model.error == true>
    <div class="alert alert-warning">
        <strong>Warning!</strong> Неверно введен email или пароль!
    </div>
</#if>
    <form
        title="Регистрация"
        name="registrationForm"
        method="post"
        action="/login">
        <div class="input-group">
            <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
            <input id="email" type="text" class="form-control" name="email" placeholder="Email">
        </div>
        <div class="input-group">
            <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
            <input id="password" type="password" class="form-control" name="password" placeholder="Пароль">
        </div>
        <br>
        <div class="checkbox">
            <label><input type="checkbox" value="remember-me">Запомнить</label>
        </div>
        <br>
        <div>
             <input type="submit">

        </div>
    </form>
    <br>


</div>

</body>
</html>




