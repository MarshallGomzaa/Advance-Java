
        <jsp:include page="menu.jsp" />



<div class="main-content" >
	<div class="title">Insert Item</div>
	<div class="content">



        <form  action="../SaveItemData" method="post" enctype="multipart/form-data" >
            <label>Item Name</label> <input type="text" name="itemName">
            
            <label>Price</label> <input type="text" name="price">
            <label>Upload Photo</label> <input type="file" name="photo">
 
            
            <input type="submit" class="btn success">
        </form>
        </div>
</div>
    </body>
</html>

