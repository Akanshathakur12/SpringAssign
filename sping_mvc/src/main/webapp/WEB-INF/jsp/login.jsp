<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<header>Login to your ABTutorials account</header>
    <div id="advert">
        <div id="inner">Login
            <form id="form" action="/SpringWebAssignment/courses" method="post">
                Username: <input class="fill" type="text" name="userName"><br>
                Password: <input class="fill" type="password" name="password"><br><br>
                <input class="link" type="submit" value="Login">
            </form>
        </div>
    </div>
</body>
</html>