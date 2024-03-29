<%-- 
    Document   : signup
    Created on : Oct 18, 2022, 11:16:10 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
        <title>Sign-up</title>
    </head>
    <body>
        <%@include file="navbar.jsp"%>
        <style>
            html{
                overflow-y: auto;
            }
        </style>

        <section style="background-color: #eee;">
            <div class="container h-100">
                <div class="row d-flex justify-content-center align-items-center h-100">
                    <div class="col-lg-12 col-xl-11">
                        <div class="card text-black" style="border-radius: 25px;">
                            <div class="card-body p-md-5" >
                                <div class="row justify-content-center"  >
                                    <div class="col-md-10 col-lg-6 col-xl-5 order-2 order-lg-1" >

                                        <p class="text-center h1 fw-bold mb-5 mx-1 mx-md-4 mt-4">Sign up</p>

                                        <form action="signup" method="post" class="mx-1 mx-md-4">

                                            <div class="d-flex flex-row align-items-center mb-4">
                                                <i class="fas fa-user fa-lg me-3 fa-fw"></i>
                                                <div class="form-outline flex-fill mb-0">
                                                    <label class="form-label" for="form3Example1c">Your Username</label>
                                                    <input type="text" id="form3Example1c" class="form-control"  name="username"/>

                                                </div>
                                            </div>

                                            <div class="d-flex flex-row align-items-center mb-4">
                                                <i class="fas fa-envelope fa-lg me-3 fa-fw"></i>
                                                <div class="form-outline flex-fill mb-0">
                                                    <label class="form-label" for="form3Example3c">Your Email</label>
                                                    <input type="email" id="form3Example3c" class="form-control" name="email"/>

                                                </div>
                                            </div>

                                            <div class="d-flex flex-row align-items-center mb-4">
                                                <i class="fas fa-lock fa-lg me-3 fa-fw"></i>
                                                <div class="form-outline flex-fill mb-0">
                                                    <label class="form-label" for="form3Example4c">Password</label>
                                                    <input type="password" id="form3Example4c" class="form-control" name="password"/>

                                                </div>
                                            </div>

                                            <div class="d-flex flex-row align-items-center mb-4">
                                                <i class="fas fa-key fa-lg me-3 fa-fw"></i>
                                                <div class="form-outline flex-fill mb-0">
                                                    <label class="form-label" for="form3Example4cd">Repeat your password</label>
                                                    <input type="password" id="form3Example4cd" class="form-control" name="repass"/>

                                                </div>
                                            </div>

                                            <div class="form-check d-flex justify-content-center mb-5 " >

                                                <input style="width:60px" type="text" value="${randomcaptcha}" name="randomcaptcha" disabled />&nbsp;
                                                <input style="width:60px" type="text" name="checkcaptcha" />
                                                
                                            </div>

                                            <div class="d-flex justify-content-center mx-4 mb-3 mb-lg-4">
                                                <button type="submit" class="btn btn-primary btn-lg">Register</button>
                                            </div>


                                            <div class="form-check d-flex justify-content-center mb-5">
                                                Already have account&nbsp 
                                                <a href="login" style="padding: 2px 3px;background-color: #0d6efd; color: white;text-decoration: none; border-radius: 5px">Login</a>

                                            </div>


                                        </form>

                                    </div>
                                    <div class="col-md-10 col-lg-6 col-xl-7 d-flex align-items-center order-1 order-lg-2">

                                        <img src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-registration/draw1.webp"
                                             class="img-fluid" alt="Sample image">

                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>






    </body>
</html>
