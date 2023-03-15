<%-- 
    Document   : userinfor
    Created on : Oct 26, 2022, 1:25:52 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User information</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
    </head>
    <body>
        <%@include file="navbar.jsp"%>
        <div style="padding: 50px 0">
            
        
        <h4>Profile: <a href="editprofileuser?username=${sessionScope.user.username}">Edit your profile</a></h4>

        <div>
            <h4>My course</h4><!-- comment -->

        </div>
        <style>
            table, thead, tbody{
                border: 1px solid black;
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

                <th>Course Name</th>
                <th>Progress</th>
                <th>Learn</th>

                </thead>
                <tbody>
                    <c:forEach items="${sessionScope.listSProgress}" var="list">
                        <tr>
                            <td>${list.courseId}</td>
                            <td>${list.progress}%</td>
                            <td>
                                <a href="lesson?cid=${list.courseId}" style="padding: 2px 3px;background-color: #0d6efd; color: white;text-decoration: none; border-radius: 5px">Go to course</a>

                            </td>

                        </tr>
                    </c:forEach>
                </tbody>

            </table>


        </div>
        </div>

    </body>
</html>
