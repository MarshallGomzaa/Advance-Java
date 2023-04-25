
        <jsp:include page="menu.jsp" />
        <div class="main-content" >
	<div class="title">Display User</div>
	<div class="content">
            <div id ="table">
                <% 
                if(!session.getAttribute("uname").equals("admin")){
                session.setAttribute("msg", "You are not authorized to use this");
                response.sendRedirect("menu.jsp");
                    }else{
                    session.removeAttribute("msg");
                    }
                %>
            </div>
        
        <script type="text/javascript">
            $(document).ready(function(){
                
                $.ajax({
                    url:"../GetAllUsers",
                    type:"post",
                    data:null,
                    beforeSend:function(){},
                    success:function(data,status){
                            $("#table").html(data);
                        },
                    error:function(xhr,data,status){
                        
                    }
                });
            });
            </script>
            

