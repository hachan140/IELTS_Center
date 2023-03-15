<%-- 
    Document   : lesson
    Created on : Oct 23, 2022, 12:24:32 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lesson</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
    </head>
    <body>
        <%@include file="navbar.jsp"%>
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
        <div class ="parent">
            <table class="child">
                <thead>
                <th>Lesson ID</th>
                <th>Lesson Name</th>
                <th>Start Learning</th>
                <th>Status</th>
                </thead>
                <tbody>
                    <c:forEach items="${lesson}" var="l">
                        <tr>
                            <td>${l.lessonId}</td>
                            <td>${l.lessonName}</td>
                            <td><a href="lessondetail?lessonId=${l.lessonId}" style="padding: 2px 3px;background-color: #0d6efd; color: white;text-decoration: none; border-radius: 5px">Start learning</a></td>
                            <td>

                                
                                <c:forEach var="lp" items="${listlp}">
                                    <c:if test="${l.lessonId.equals(lp.lessonId)}">
                                        <h4>Done</h4>
                                        
                                    </c:if>
                                </c:forEach>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>

            </table>
        </div>



    </body>
</html>
