
        <jsp:include page="menu.jsp" />



<div class="main-content" >
	<div class="title">Purchase Item</div>
	<div class="content">



        <form  action="../purchase" method="post" >
            <label>Item Name</label><span id="combo"></span>
            
            <label>Price</label> <input type="text" name="price">
            <label>Quantity</label> <input type="text" name="quantity">
            
 
            
            <input type="submit" class="btn success">
        </form>
        </div>
</div>
        <script>
        $(document).ready(function(){
              $.ajax({
                    url:"../getItemSelectBox",
                    type:"get",
                    data:null,
                    beforeSend:function(){},
                    
                    success:function(data,status){
                            $("#combo").html(data);
                        },
                        
                    error:function(xhr,data,status){
                        console.log(xhr);
                        
                    }
                });
                });
        
//        purchase vanne servlet banaera auu
        </script>
       
        
    </body>
</html>

