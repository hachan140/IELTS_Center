<%-- 
    Document   : adminlesson
    Created on : Nov 4, 2022, 9:22:06 AM
    Author     : Admin
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <style>
            .table, .thead{
                border:1px solid black;
                border-collapse: collapse;
                padding:3px 4px;
            }
            .table{
                margin: auto;
                width:80%;
                
            }
            .table th{
                background-color: #ABD9FF;
            }
            .table td{
                background-color: #F5F9FF;
            }
            .bigtable{
                margin: 30px 0;
            }
            


        </style>
        <div class="bigtable">
            <table class="table">
                <tr>
                    <th class="thead">Lesson ID</th>
                    <th class="thead" >Lesson Name</th>
                    <th class="thead">Lesson Detail</th>
                   
                    <th class="thead">Update</th>
                    <th class="thead">Delete</th>
                </tr>
                <c:forEach items="${llesson}" var="l">
                    <tr>
                        <td class="thead">${l.lessonId}</td>
                        <td class="thead">${l.lessonName}</td>
                        <td class="thead">${l.lessonDetail}</td>
                        

                        <td class="thead"><a href="adminupdatelesson?&lessonid=${l.lessonId}">Update</a></td>
                        <td class="thead">
                            <form action="admincourse?&lessonid=${l.lessonId}" method="post">
                                <button type="submit">Delete</button>
                            </form>
                           
                    </tr>
                </c:forEach>




            </table>
        </div>
    </body>
</html>
