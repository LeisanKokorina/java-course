<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<html>
<head>
    <title>Подтверждение</title>
</head>
<body>

<#if model.result == true>
    <h1>Вы успешно подтвердили почту  </h1>
<h2>Перейдите <a href="/login">сюда</a> , чтобы начать пользоваться сайтом</h2>
<#else>
    <h1>Ссылка не верна, либо истекло время жизни</h1>
</#if>
</body>
</html>