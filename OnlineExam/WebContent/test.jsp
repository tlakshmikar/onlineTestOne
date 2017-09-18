<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Start exam</h1>


<form action="./quiz" method="post">

<h3>Q1. What color is the sky on a sunny day?</h3>
<input type="radio" name="answer1" value="blue">blue<br>
<input type="radio" name="answer1" value="red">red<br>
<input type="radio" name="answer1" value="green">green<br>

<h3>Q2. The sum of two and three equals...</h3>
<input type="radio" name="answer2" value="seven">seven<br>
<input type="radio" name="answer2" value="six">six<br>
<input type="radio" name="answer2" value="five">five<br>

<h3>Q3. Which of these animals is NOT an mammal.</h3>
<input type="radio" name="answer3" value="lizard">lizard<br>
<input type="radio" name="answer3" value="monkey">monkey<br>
<input type="radio" name="answer3" value="dog">dog<br>

<h3>Q4. Santa Claus is most associated with this holiday.</h3>
<input type="radio" name="answer4" value="Halloween">Halloween<br>
<input type="radio" name="answer4" value="Christmas">Christmas<br>
<input type="radio" name="answer4" value="Fourth of July">Forth of July<br>
<br>
<input type="submit" value="Submit">
<input type="reset" value="Reset">
</body>
</html>