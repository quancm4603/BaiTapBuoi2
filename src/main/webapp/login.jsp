<%--
  Created by IntelliJ IDEA.
  User: caomi
  Date: 9/30/2023
  Time: 10:49 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <%@include file="header.jsp" %>
</head>
<body class="text-center d-flex justify-content-center">
<form class="form-signin col-sm-3" method="post">
    <h1 class="h1 mb-3 font-weight-normal">Please sign in</h1>
    <h5 class="alert-danger text-danger">${status}</h5>
    <label for="inputUsername" class="sr-only">User_name</label>
    <input name="username" type="username" id="inputUsername" class="form-control" placeholder="User name" required autofocus>
    <label for="inputPassword" class="sr-only">Password</label>
    <input name="password" type="password" id="inputPassword" class="form-control" placeholder="Password" required>
    <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
</form>
</body>
</html>
