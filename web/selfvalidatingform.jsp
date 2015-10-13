<%--
  Created by IntelliJ IDEA.
  User: simon
  Date: 10/12/15
  Time: 10:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

<jsp:useBean id="user1" class="beans.User"></jsp:useBean>
<jsp:setProperty name="user1" property="*"/>

<%
    String action = request.getParameter("action");
    if(action != null && action.equals("formsubmit")) {
        if (user1.validate()) {
            request.getRequestDispatcher("/Controller").forward(request, response);
        }
    }
%>


<h2>
    <jsp:getProperty name="user1" property="message"/>
</h2>

<form action="/Forms/selfvalidatingform.jsp" method="post">

    <input type="hidden" name="action" value="formsubmit"/>
    <input type="text" name="email" value="<jsp:getProperty name="user1" property="email"/>"/><br/>
    <input type="text" name="password" value="<jsp:getProperty name="user1" property="password" />"/><br/>


    <input type="submit" value="OK"/>

</form>

</body>
</html>
