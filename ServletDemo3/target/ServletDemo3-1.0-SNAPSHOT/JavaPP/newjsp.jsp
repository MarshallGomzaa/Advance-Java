<jsp:useBean class="Model.item" id="obj" />
<jsp:setProperty  name="obj" property="id" value="12"/>
<%
    obj.getOneItem();
    %>
<%--<jsp:getProperty name="obj" property="id" />--%>
<h2><jsp:getProperty  name="obj" property="name"/></h2>
<h2><jsp:getProperty  name="obj" property="price"/></h2>
<h2><jsp:getProperty  name="obj" property="photo"/></h2>
<h2><jsp:getProperty  name="obj" property="stock"/></h2>

