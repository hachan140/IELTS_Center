<%-- 
    Document   : coursedetail
    Created on : Oct 22, 2022, 3:58:15 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Course Detail</title>

        <link href="asset/css/style.css" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
    </head>
    <body>
        <%@include file="navbar.jsp" %>

        <div style="margin:50px 50px">
            <h6>${course.detail}</h6>

        </div>
        <c:if test="${sessionScope.user.role==0}">
            <a href="adminaddlesson?cid=${course.courseId}" style="padding: 2px 3px;background-color: #0d6efd; color: white; border-radius: 5px; ">&#10010;</a>
            <a href="adminlesson?cid=${course.courseId}" style="padding: 2px 3px;background-color: #0d6efd; color: white; border-radius: 5px">&#10002;</a>
        </c:if>


        <style>
            table, thead, tbody{
                border: 1px solid black
            }
            .parent {
                background-color: #ABD9FF;
                width: 100vw;
                height: 70vh;

                /* additional style */
                display: flex;
                justify-content: center;
                align-items: center;
            }

            .child {
                background-color: #E5F0FF;
                width: 40%;
                height: 400px;
            }
        </style>
        <div class="parent">
            <table class="child">
                <thead>
                <th>Class ID</th>
                <th>Start Date</th>
                <th>End Date</th>
                <th>Mentor Username</th>
                <th>Enroll</th>
                </thead>
                <tbody>
                    <c:if test="${sessionScope.erolledSCourse==null}">
                        <c:forEach items="${classlist}" var="c">
                            <tr>
                                <td>${c.classId}</td>

                                <td>${c.startDate}</td>
                                <td>${c.endDate}</td>
                                <td>${c.mentorUsername}</td>
                                <td>


                                    <form action="coursedetail?classId=${c.classId}&cid=${c.cId}" method="post">
                                        <input type="hidden" name="classId" value="${c.classId}">
                                        <input type="hidden" name="cId" value="${c.cId}">
                                        <!-- comment -->
                                        <input type="submit" value="Register">
                                    </form>
                                    <!--                                <a href="lesson?cid=$ {c.cId}" style="padding: 2px 3px;background-color: #0d6efd; color: white;text-decoration: none; border-radius: 5px">Đăng ký học</a>-->
                                </td>
                            </tr>
                        </c:forEach>
                    </c:if>
                    <c:if test="${sessionScope.erolledSCourse!=null}">

                        <tr>
                            <td>${classEroll.classId}</td>
                            <td>${classEroll.startDate}</td>
                            <td>${classEroll.endDate}</td>
                            <td>${classEroll.mentorUsername}</td>
                            <td>
                                <a href="lesson?cid=${classEroll.cId}" style="padding: 2px 3px;background-color: #0d6efd; color: white;text-decoration: none; border-radius: 5px">Go to course</a>
                            </td>
                        </tr>

                    </c:if>
                </tbody>
            </table>
        </div>


    </body>
</html>
