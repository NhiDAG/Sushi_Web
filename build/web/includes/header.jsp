
<div class="header">
    <h1>The SuShi Restaurant</h1>
    <span>Welcome to this website</span>
</div>
<div class="menu">
    <a class="${active == 'HomeColor' ? 'setBold' : ''}" href="HomeController">Home</a>
    <a class="${active == 'MenuColor' ? 'setBold' : ''}" href="detailsPost.jsp">Menu and Price list</a>
    <a class="${active == 'FindUsColor' ? 'setBold' : ''}" href="InfoController">Find us</a>
    <%
        if (request.getSession().getAttribute("username") == null) {
    %>
    <a class="${active == 'LoginColor' ? 'setBold' : ''}" href="LoginServlet">Login</a>
    <%
    } else {
    %>
    <a class="${active == 'LogoutColor' ? 'setBold' : ''}" href="LogoutServlet">Logout</a>
    <%
        }
    %>
    ${username}
</div>