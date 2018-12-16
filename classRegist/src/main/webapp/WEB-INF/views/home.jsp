<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

<p> <a href="${pageContext.request.contextPath}/offers">학기별 이수학점 조회</a></p>
<p> <a href="${pageContext.request.contextPath}/createoffer">수강신청</a></p>
<p> <a href="${pageContext.request.contextPath}/offers">수강신청 조회</a></p>

<c:if test="${pageContext.request.userPrincipal.name !=null }">
	<a href="javascript:document.getElementById('logout').submit()">로그아웃</a>
	</c:if>
	<form id="logout" action ="<c:url value="/logout"/>" method="post">
		<input type="hidden" name="${_csrf.parameterName }" value="${_csrf.token }"/>
	</form>

</body>
</html>
