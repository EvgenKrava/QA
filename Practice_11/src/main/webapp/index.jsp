<%--
  Created by IntelliJ IDEA.
  User: evgen
  Date: 20.04.19
  Time: 15:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
<div id='calc-contain'>
    <form name="calculator">

        <input type="text" name="answer" />
        <br>

        <input type="button" value=" 1 " onclick="calculator.answer.value += '1'" />
        <input type="button" value=" 2 " onclick="calculator.answer.value += '2'" />
        <input type="button" value=" 3 " onclick="calculator.answer.value += '3'" />
        <input type="button" value=" + " onclick="calculator.answer.value += '+'" />
        <br/>

        <input type="button" value=" 4 " onclick="calculator.answer.value += '4'" />
        <input type="button" value=" 5 " onclick="calculator.answer.value += '5'" />
        <input type="button" value=" 6 " onclick="calculator.answer.value += '6'" />
        <input type="button" value=" - " onclick="calculator.answer.value += '-'" />
        </br>

        <input type="button" value=" 7 " onclick="calculator.answer.value += '7'" />
        <input type="button" value=" 8 " onclick="calculator.answer.value += '8'" />
        <input type="button" value=" 9 " onclick="calculator.answer.value += '9'" />
        <input type="button" value=" x " onclick="calculator.answer.value += '*'" />
        </br>

        <input type="button" value=" c " onclick="calculator.answer.value = ''" />
        <input type="button" value=" 0 " onclick="calculator.answer.value += '0'" />
        <input type="button" value=" = " onclick="calculator.answer.value = eval(calculator.answer.value)" />
        <input type="button" value=" / " onclick="calculator.answer.value += '/'" />
        </br>


    </form>
</div>
</body>
</html>
