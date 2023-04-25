
<%-- 
    Document   : updatetemform
    Created on : Apr 17, 2023, 8:34:59 AM
    Author     : Marshall
--%>

<jsp:include page="menu.jsp"/>
<% 
 String id=session.getAttribute("id").toString();
  
 String username=   session.getAttribute("username").toString();
  String password=  session.getAttribute("password").toString(); 
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="main-content">
            <div class="title">Update User</div>
            <div class="content">
                
        <form action="../UpdateUser" method="post">
            <input type="hidden" name="id" value="<%= id %>"/>
            <label>Username</label> <input type="text" name="username" value="<%= username%>"/>
            <label>Password</label><input type="text" name="password" value="<%= password%>"/>
            <input type="submit"  />
        </form>
            </div>
        </div>
    </body>
</html>

