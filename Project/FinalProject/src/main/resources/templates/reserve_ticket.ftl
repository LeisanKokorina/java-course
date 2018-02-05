<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>


<!doctype html>
<html lang="en">
<head>
    <title>Главная страница</title>

</head>
<body>

<#if model.user??>
<div>
    id${model.user.id}
    <br>
    ${model.user.name} ${model.user.surname}
    <br>

    <div style="float: right; line-height: 20px"><p><a href="/logout">Выйти</a></p></div>
</div>
<#else>
<div>
    <div>

        <div> <p><a href="/login">Вход</a>/ <a href="/registration">Регистрация</a></p></div>
    </div>
</div>
</#if>
</body>
</html>