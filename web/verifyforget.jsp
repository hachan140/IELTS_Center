<%-- 
    Document   : verifyforget
    Created on : Oct 31, 2022, 9:24:56 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Verify Code</title>
         <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
    </head>
    <body>
        <%@include file="navbar.jsp"%>
        
        
        <h4>We've sent an email code to your email.</h4>
        <form action="verifyforget" method ="post">
            <input type="text" value="${sessionScope.getCode}" ><br/>
        <input type="text" name="authcode"><br/>
        <input type="submit" value="verify">
        </form>
    </body>
</html>
