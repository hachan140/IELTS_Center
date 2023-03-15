<%-- 
    Document   : navbar
    Created on : Oct 19, 2022, 11:15:38 AM
    Author     : Admin
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="assets/css/style.css">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <!-- ======= Top Bar ======= -->
    <section id="topbar" class="d-flex align-items-center">
        <div class="container d-flex justify-content-center justify-content-md-between">
            <div class="contact-info d-flex align-items-center">
                <i class="bi bi-envelope d-flex align-items-center"><a href="mailto:ieltsmimosa@gmail.com">ieltsmisa@gmail.com</a></i>
                <i class="bi bi-phone d-flex align-items-center ms-4"><span>0975934624</span></i>
            </div>

            <form action="search" method="get">
                <div class="search">
                <input type = "text" name="inputsearch" value="${inputsearch}">
                <button type="submit">Tìm kiếm</button>
            </div>
            </form>
            
            <!-- <div class="social-links d-none d-md-flex align-items-center">
              <a href="#" class="twitter"><i class="bi bi-twitter"></i></a>
              <a href="#" class="facebook"><i class="bi bi-facebook"></i></a>
              <a href="#" class="instagram"><i class="bi bi-instagram"></i></a>
              <a href="#" class="linkedin"><i class="bi bi-linkedin"></i></i></a>
      
            </div> -->
        </div>
    </section>
        <!-- ======= Header ======= -->
    <header id="header" class="d-flex align-items-center">
        <div class="container d-flex align-items-center justify-content-between">

            <h1 class="logo"><a href="home">IELTS MISA<span>.</span></a></h1>
            <!-- Uncomment below if you prefer to use an image logo -->
            <!-- <a href="index.html" class="logo"><img src="assets/img/logo.png" alt=""></a>-->

            <nav id="navbar" class="navbar">
                <ul>
                    <li><a class="nav-link scrollto" href="home">Trang chủ</a></li>
                    
                    <li><a class="nav-link scrollto" href="course">Khóa học</a></li>

                    <c:if test="${sessionScope.user==null}">
                        <li><a class="nav-link scrollto logsign" href="login">Log-in</a></li>
                        <li><a class="nav-link scrollto logsign" href="signup">Sign-up</a></li>
                    </c:if>
                    <c:if test="${sessionScope.user!=null}">
                    <li><a href="userinfor?username=${sessionScope.user.username}">${sessionScope.user.username}</a></li>
                    <li>
                        <form action="logout" method="get">
                            <button name="logout">Log out</button>
                        </form>
                        </li> 
                    </c:if>
                      
                    
                </ul>


            </nav><!-- .navbar -->

        </div>
    </header><!-- End Header -->
    </body>
</html>
