<%-- 
    Document   : confirmuser
    Created on : Oct 31, 2022, 10:01:51 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
    </head>
    <body>
        <%@include file="navbar.jsp"%>
<section class="vh-100">
            <div class="container-fluid h-custom">
                <div class="row d-flex justify-content-center align-items-center h-100">
                    
                    <div class="col-md-8 col-lg-6 col-xl-4 offset-xl-1">
                        <form action="confirmuser" method="post">
                            

                            <!-- Username input -->
                            <div class="form-outline mb-4">
                                <label class="form-label" for="form3Example3" >Username</label>
                                <input type="text" id="form3Example3" class="form-control form-control-lg"
                                       placeholder="Enter username" name="username" />
                                
                            </div>

                            

                           

                            <div class="text-center text-lg-start mt-4 pt-2">
                                <button type="submit" class="btn btn-primary btn-lg"
                                        style="padding-left: 2.5rem; padding-right: 2.5rem;">Continue</button>
                               
                            </div>

                        </form>
                    </div>
                </div>
            </div>
        </section>
    </body>
</html>
