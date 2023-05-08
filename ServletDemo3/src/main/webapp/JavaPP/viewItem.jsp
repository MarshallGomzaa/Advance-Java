<jsp:include page="menu.jsp"/>
<%
    
HttpSession s=request.getSession();
 String photo=(String)s.getAttribute("photo");
 photo="uploads/"+photo;
 System.out.println(photo);

    %>


<html>
<body>
    <div class="main-content" >
	<div class="title">Display Item</div>
	<div class="content itemDisplay">
               <img src="<%=  photo %>" />
            <h1>Item Name:</h1>
            <h1>Item price</h1>
            <h1>Item stock</h1>
     

</div>
   
 
        
</body>