<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/resources/css/main.css">
</head>
<body>

	<form method="post"
		action="${pageContext.request.contextPath }/docreate">
		<table class="formtable">
			<tr><td class="lable">Year:</td><td><input class="control" type="text" name="year"/></td></tr>
			<tr><td class="lable">Division:</td><td><input class="control" type="text" name="division"/></td></tr>
			<tr><td class="lable">Codenumber:</td><td><input class="control" type="text" name="codenumber"/></td></tr>
			<tr><td class="lable">ClassName:</td><td><input class="control" type="text" name="classname"/></td></tr>
			<tr><td class="lable">EX:</td><td><input class="control" type="text" name="ex"/></td></tr>
			<tr><td class="lable">Point:</td><td><input class="control" type="text" name="point"/></td></tr>
			<tr><td></td><td><input type="submit" value="수강신청하기"/></td></tr>

		</table>

	</form>

</body>
</html>