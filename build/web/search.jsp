<%-- 
    Document   : course
    Created on : Oct 19, 2022, 12:16:15 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search Result</title>
        <link href="asset/css/style.css" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
    </head>
    <body>
        <%@include file="navbar.jsp"%>
        <h4 style="color:red">Search result - ${inputsearch}</h4>
        <!-- ======= Services Section ======= -->
        <section id="services" class="services">
            <div class="container" data-aos="fade-up">

                <div class="section-title">
                    <div><h2>Khóa học</h2>
                        <c:if test="$sessionScope.user.role==0">
                            <a href="addcourse" style="padding: 2px 3px;background-color: #0d6efd; color: white; border-radius: 5px; ">&#10010;</a>
                            <a href="admincourse" style="padding: 2px 3px;background-color: #0d6efd; color: white; border-radius: 5px">&#10002;</a>

                        </c:if>
                    </div>



                </div>

                <div class="row">
                    <c:forEach var="course" items="${courselist}">

                        <div class="col-md-3 d-flex align-items-stretch" data-aos="zoom-in" data-aos-delay="100" style=" margin-bottom: 30px">

                            <div class="icon-box" style="background-color: #DCF2FF">


                                <h4><a href="coursedetail?cid=${course.courseId}">${course.courseName}</a></h4>

                            </div>
                        </div>

                    </c:forEach>
                </div>

                <div>





                </div>










            </div>

        </div>
    </section><!-- End Services Section -->
</body>
</html>

