<%
    String username="";
     if(session.getAttribute("uname")!=null){
//    request.getSession().setAttribute("errorMsg", "You are not loggrd in!!");
//    response.sendRedirect("loginForm.jsp");
//    }else{
    username=session.getAttribute("uname").toString();
    }
%>


<!DOCTYPE html>
<html>
<head>
	<title>Inventory System</title>
	<link rel="stylesheet" type="text/css" href="style.css">
	<link rel="icon" type="image/x-icon" href="images/favicon.jpg">
	<style type="text/css">

	</style>
</head>
<body>
    
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
	<div class="nav-bar">
		<div class="system-name">Inventory System</div>
		<a href="../logout"> logout</a> 
		<div class="user">Welcome : <%= username%> </div>
		
	</div>
<div class="menu">
	<a href="itemform.jsp" >Insert Items</a>
	<a href="Items_display.jsp">Display Items</a>
	<a href="signup_form.jsp" >User Registration</a>
        <a href="display_user.jsp" >Display User</a>
        <a href="purchase.jsp" >Purchase</a>
        <a href="items_sales.jsp">Sale</a>

		<a href="purchase_display.php">Display Purchase Data</a>

	<a href="stock.php">Stock</a>
        <%
            if(session.getAttribute("successmsg")!=null){
            out.println(session.getAttribute("successmsg"));
            session.removeAttribute("successmsg");
            }
        %>

</div>

