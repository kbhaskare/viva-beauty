<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
System.out.println("sending redirect to index.html");
    response.sendRedirect("index.html");
%>