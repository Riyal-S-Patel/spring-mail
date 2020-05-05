<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Welcome....!!!!!</h2>
	<form action="sendMail.do" method="post">
		To: <input type="text" name="toMailid"> <br> Subject :<input
			type="text" name="subject"> <br> Body :
		<textarea rows="5" name="body"></textarea><br>
		<input type="submit" value="Send Mail">
	</form>
</body>
</html>