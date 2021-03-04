<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
hello

<%-- java 파일의 service method 안쪽에 선언할 때 사용한다.--%>
<%
	System.out.println("_jspService()");
%>

<%-- java 파일의 service method 바깥쪽에 선언할 때 사용한다.--%>
<%!
public void jspInit() {
	System.out.println("jspInit()~");
}

public void jspDestroy() {
	System.out.println("jspDestroy()");
}
%>

</body>
</html>