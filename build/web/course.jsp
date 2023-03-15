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
        <title>Course</title>
        <link href="asset/css/style.css" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
    </head>
    <body>
        <%@include file="navbar.jsp"%>
        <!-- ======= Services Section ======= -->
        <style>
            .pagination a{
                color: black;
                font-size: 22px;
                float:left;
                padding: 8px 16px;
                text-decoration: none;
            }
            .pagination a.active{
                background: #4CAF50;
                color: white;
            }
            .pagination a:hover:not(.active){
                background-color: chocolate;
            }
        </style>
        <section id="services" class="services">
            <div class="container" data-aos="fade-up">

                <div class="section-title">
                    <div><h2>Khóa học</h2>
                        <c:if test="${sessionScope.user.role==0}">
                            <a href="addcourse" style="padding: 2px 3px;background-color: #0d6efd; color: white; border-radius: 5px; ">&#10010;</a>
                            <a href="admincourse" style="padding: 2px 3px;background-color: #0d6efd; color: white; border-radius: 5px">&#10002;</a>
                        </c:if>
                    </div>



                </div>

                <div class="row">
                    <c:set var="page" value="${requestScope.page}"/>
                    <div class="pagination">
                        <c:forEach begin="${1}" end ="${requestScope.num}" var="i">
                            <a class="${i==page?"active":""}" href="course?page=${i}">${i}</a>
                        </c:forEach>
                    </div>
                    <c:forEach  var="course" items="${list}">
                    
                            
                        

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
