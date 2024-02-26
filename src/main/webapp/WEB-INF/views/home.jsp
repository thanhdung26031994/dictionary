<%--
  Created by IntelliJ IDEA.
  User: Acer
  Date: 26/02/2024
  Time: 23:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ứng dụng Từ điển đơn giản</title>
</head>
<body>
<h1>Ứng dụng từ điển!</h1>
<form method="post">
    <fieldset>
        <legend>
            Dictionary
        </legend>
        <label for="dictionary">Nhập từ cần dịch</label>
        <input id="dictionary" name="dictionary" type="text" required>
        <input type="submit" value="Dịch"><br>
        <h5>Từ cần dịch: <span style="color: blue">${tiengViet}</span></h5>
        <h5>Kết quả: <span style="color: blue">${result}</span></h5>
    </fieldset>
</form>
</body>
</html>
