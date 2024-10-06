<%-- 
    Document   : login
    Created on : Jun 11, 2024, 1:40:52 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="utils.CookieUtils"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>

    <head>
        <title>Login</title>
        <link type="text/css" rel="stylesheet" href="css/style.css">
        <link href="css/container.css" rel="stylesheet" type="text/css"/>
        <link href="css/footer.css" rel="stylesheet" type="text/css"/>
        <link href="css/header.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="wrap">
            <%@include file="includes/header.jsp" %>
            <div class="content">
                <div class="main-content">
                    <div class="content-left">
                        <h2>Login</h2>
                        <form action="LoginServlet" method="post">
                            <%                                response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1
                                response.setHeader("Pragma", "no-cache"); // HTTP 1.0
                                response.setDateHeader("Expires", 0); // Proxies
                                String userName = CookieUtils.get("cookuser", request);
                                String password = CookieUtils.get("cookpass", request);
                                String rememberMe = CookieUtils.get("rememberMe", request);
                            %>
                            <div>
                                <label>Username:</label>
                                <input type="text" id="username" name="username" autocomplete="off" value="<%= userName%>"/>
                            </div>
                            <div>
                                <label>Password:</label>
                                <input type="password" id="password" name="password" autocomplete="off" value="<%= password%>"/>
                            </div>
                            <div>
                                <input type="checkbox" id="remember-me" name="remember-me" value="true" <%="checked".equals(rememberMe.trim()) ? "checked" : ""%>/>
                                <label>Remember me</label>
                            </div>
                            <div>
                                <button type="submit">Login</button>
                            </div>
                            <div style="color: red;">
                                <c:if test="${not empty errorMessage}">
                                    ${errorMessage}
                                </c:if>
                            </div>
                        </form>
                    </div>
                    <%@include file="includes/container.jsp" %>
                </div>
                <%@include file="includes/footer.jsp" %>
            </div>
        </div>
    </body>
</html>
