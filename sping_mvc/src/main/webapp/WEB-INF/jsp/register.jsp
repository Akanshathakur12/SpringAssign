<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register for ABTutorials</title>
</head>
<body>
<header>Please provide the required details to register</header>
    <div id="advert">
        <div id="inner">Register
            <form id="form" action="/SpringWebAssignment/save" method="post">
                Username: <input class="fill" type="text" name="userName"><br>
                Password: <input class="fill" type="password" name="password"><br><br>
                <input class="link" type="submit" value="Create Account">
            </form>
        </div>
    </div>

</body>
</html>