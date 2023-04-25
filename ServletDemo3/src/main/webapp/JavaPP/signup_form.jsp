<jsp:include page="menu.jsp" />


<div class="main-content" >
	<div class="title">New User</div>
	<div class="content">

<form  action="../saveUser" method="post" >
    <label>Username</label>
    <input type="text" name="username">
    <label>Password</label>
    <input type="text" name="password">
    
    <br>
    
   <input type="submit" class="btn success">
  
</form>
        </div>