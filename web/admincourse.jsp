<%-- 
    Document   : editcourse
    Created on : Oct 21, 2022, 9:43:32 PM
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
                    <th class="thead">ID</th>
                    <th class="thead" >Name</th>
                    <th class="thead">Detail</th>
                    <th class="thead">Fee</th>
                    <th class="thead">Update</th>
                    <th class="thead">Delete</th>
                </tr>
                <c:forEach items="${list}" var="course">
                    <tr>
                        <td class="thead">${course.courseId}</td>
                        <td class="thead">${course.courseName}</td>
                        <td class="thead">${course.detail}</td>
                        <td class="thead">${course.fee}</td>

                        <td class="thead"><a href="adminupdatecourse?&cid=${course.courseId}">Update</a></td>
                        <td class="thead">
                            <form action="admincourse?cid=${course.courseId}" method="post">
                                <button type="submit">Delete</button>
                            </form>
                           
                    </tr>
                </c:forEach>




            </table>
        </div>


        

    </body>
</html>
