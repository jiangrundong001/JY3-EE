<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/23
  Time: 11:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>0

<body>
 <%
     pageContext.setAttribute("user","王五",pageContext.SESSION_SCOPE);
    // request.getRequestDispatcher("index2.jsp").forward(request,response);
//       session.setAttribute("user","李四");
 %>
</body>
</html>
