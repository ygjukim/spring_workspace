<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>고객 정보 갱신 완료</title>
</head>
<body>
	<h2>고객 정보 갱신 완료</h2>
	<dl> 
		<dt> 이름 </dt><dd><c:out value="${editCustomer.name}" /></dd>
		<dt> 주소 </dt><dd><c:out value="${editCustomer.address}" /></dd>
		<dt>이메일주소</dt><dd><c:out value="${editCustomer.emailAddress}" /></dd>
	</dl>
	<c:url value="/customer" var="url" />
	<a href="${url}">뒤로</a>
</body>
</html>