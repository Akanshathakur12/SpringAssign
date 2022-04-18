<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<header>ABTutorials</header>
	<div id="advert">
        <div id="inner">Courses</div><br><br><hr>
        <c:forEach items="${courseList}" var="course">
         <div class="info">
            Course Name : ${course.getCourseName()}<br>
            Fees : Rs.${course.getFees()}<br>
            Duration : ${course.getDuration()} weeks <br>
            Start Date : ${course.getStartDate()}
            <a href="" class="link">Enroll</a>
         </div>
        </c:forEach>
    </div>
</body>
</html>