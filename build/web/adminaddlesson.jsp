<%-- 
    Document   : adminaddlesson
    Created on : Nov 4, 2022, 9:38:00 AM
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
        <style>
            .parent {
                background-color: #ABD9FF;
                width: 100vw;
                height: 100vh;

                /* additional style */
                display: flex;
                justify-content: center;
                align-items: center;
            }

            .child {
                background-color: #E5F0FF;
                width: 70%;
                height: 700px;
            }
        </style>
        <div class="parent">
            <div class ="child">
                <h1>Add a lesson</h1>

                <form action="adminaddlesson?cid=${cid}" method="post">
                    <table>
                        <tr>
                            <td>Enter Lesson ID: </td>
                            <td><input type="text" name="lessonId"><br/><!-- comment --></td>
                        </tr>
                        <tr>
                            <td>Enter Lesson Name: </td>
                            <td><input type="text" name="lessonName"><br/><!-- comment --></td>
                        </tr>
                        <tr>
                            <td>Enter Lesson Detail: </td>
                            <td><textarea name="detail" rows="20" cols="40"></textarea>
                        </tr><!-- comment -->
                        



                    </table>
                    
                    <input type="submit" name="submit" value="Insert">


                </form>
            </div>
        </div>

    </body>
</html>
