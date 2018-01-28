<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<html>
<head>
    <title>Подтверждение</title>
</head>
<body>

<#if model.result == true>
    <h1>Вы успешно подтвердили почту на самом крутом, но недоделаном клиент-серверном приложении </h1>
<#else>
    <h1>Ссылка не верна, либо истекло время жизни. Не вашей. Ключа подтверждения</h1>
</#if>
</body>
</html>