<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<html>
<head>
    <title> Покупка ЖД Билетов </title>

    <link href="https://fonts.googleapis.com/css?family=Raleway" rel="stylesheet">

    <style>
        body{
            background-image: url("static/img/railway-12.jpg");
        }
    </style>
</head>


<body>
<h1>Привет, ${model.user.name}</h1>

</body>

</html>



