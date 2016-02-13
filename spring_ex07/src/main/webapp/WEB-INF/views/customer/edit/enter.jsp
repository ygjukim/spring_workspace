<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>고객 정보 입력 화면</title>
</head>
<body>
	<h2>고객 정보 입력 화면</h2>
	<form:form modelAttribute="editCustomer">
	<dl> 
		<dt> 이름 </dt>
		<dd>
			<form:input path="name" />
			<form:errors path="name" />
		</dd>
		<dt> 주소 </dt>
		<dd>
			<form:input path="address" />
			<form:errors path="address" />
		</dd>
		<dt>이메일주소</dt>
		<dd>
			<form:input path="emailAddress" />
			<form:errors path="emailAddress" />
			<form:errors path="ngEmail" />
		</dd>
	</dl>
	<button type="submit" name="_event_proceed">다음</button>
	</form:form>
</body>
</html>