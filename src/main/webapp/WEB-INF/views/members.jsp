<%--
  Created by IntelliJ IDEA.
  User: jotaiwan
  Date: 29/07/2017
  Time: 5:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>SpringMvc</title>
</head>
<body>
Members Page
<div>
Total members: <c:out value="${fn:length(members)}" />
</div>

</body>
</html>
