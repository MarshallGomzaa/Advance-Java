<%
   String username="";
   String password="";
    
    Cookie c[]=request.getCookies();
    for(Cookie co:c){
    if(co.getName().equals("username")){
    username=co.getValue();
    }
    if(co.getName().equals("password")){
    password=co.getValue();
    }
    }
    %>
<html><head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
        <link rel="stylesheet" href="style.css"/>
    </head>
<div class="main-content" >
	<div class="title">Login</div>
	<div class="content">
            <link rel="stylesheet" type="text/css" href="style.css">
            <style type="text/css">
                .main-content{
                    width: 350px;
                    float: none;
                    display: block;
                    margin: 0;
                    margin: 50px auto;
                    background: white;
                }

	</style>
        <body style="background-image: linear-gradient(272deg, #434343 0%, black 100%)"/>
            



        <form  action="../loginUser" method="post" >
            <label>Username</label> <input type="text" name="username" value="<%= username %>">
            
            <label>Password</label> <input type="text" name="password" value="<%= password %>">
            <br>
            <input type="checkbox" name="remUser">Remember user
            <br/>
            <input type="submit" class="btn success" value="login">
        </form>
        
        

        <%
            String err="";
            if(session.getAttribute("errorMsg")!=null){
      
            err=session.getAttribute("errorMsg").toString();
                  System.out.println(err);
            session.removeAttribute("errorMsg");
            out.println("<div class='error-msg'>"+err+"</div>");
           
            
            }


        %>
       
        </div>
</div>
    </body>
</html>