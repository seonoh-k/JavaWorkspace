<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	test.jsp
	느금마 고려장
	<h1>현재 시간</h1>
    <p>
        <% 
            java.util.Date date = new java.util.Date();
            out.println(date.toString());
        %>
    </p>
    <button>DO NOT CLICK</button>
</body>
</html>