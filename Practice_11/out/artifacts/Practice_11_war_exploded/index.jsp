<%--
  Created by IntelliJ IDEA.
  User: evgen
  Date: 11.05.19
  Time: 20:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<form action="calc" method="get">
    <input type="text" name="exp">
    <input type="submit" value="Решить">
</form>
<p>Result: ${result}</p>
</body>
</html>
