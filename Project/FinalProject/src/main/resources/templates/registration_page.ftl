<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>

<html lang="en">
<head>
    <title>Регистрация</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
    <h3>Регистрация</h3>

    <form
          title="Регистрация"
        name="registrationForm"
        method="post"
        action="/registration">

        <div class="form-group">
            <label for="usr">Имя:</label>
            <input type="text" class="form-control" name="name"  id="usr">
        </div>

        <div class="form-group">
            <label for="usrf">Фамилия:</label>
            <input type="text" class="form-control" name="surname"  id="usrf">
        </div>
        <div class="form-group">
            <label for="email">Email:</label>
            <input type="text" class="form-control" name="email"  id="email">
        </div>
        <div class="form-group">
            <label for="pwd">Пароль:</label>
            <input type="password" class="form-control" name="password"  id="pwd">
        </div>


        <br>
        <div>

            <button type="submit" class="btn btn-default">Вход</button>

        </div>
    </form>


</div>

</body>
</html>




