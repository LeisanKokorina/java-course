<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<#include 'common/header.ftl'/>
<html>
<head>
    <title>ЖД- Регистрация</title>
</head>
<body>

<h1>Поздравляем, письмо для подтверждения регистрации отправлено на
    - ${model.email}</h1>


</body>
</html>