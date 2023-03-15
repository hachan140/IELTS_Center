<%-- 
    Document   : addcourse
    Created on : Oct 22, 2022, 11:12:46 AM
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
                <h1>Add a course</h1>

                <form action="addcourse" method="post">
                    <table>
                        <tr>
                            <td>Enter Course ID: </td>
                            <td><input type="text" name="cid"><br/><!-- comment --></td>
                        </tr>
                        <tr>
                            <td>Enter Course Name: </td>
                            <td><input type="text" name="cname"><br/><!-- comment --></td>
                        </tr>
                        <tr>
                            <td>Enter Course Detail: </td>
                            <td><textarea name="cdetail" rows="20" cols="40"></textarea>
                        </tr><!-- comment -->
                        <tr>
                            <td>Enter Course Fee: </td>
                            <td><input type="text"  name="cfee"><br/><!-- comment --></td>
                        </tr>



                    </table>
                    <input type="submit" name="submit" value="Insert">


                </form>
            </div>
        </div>



    </body>
</html>
