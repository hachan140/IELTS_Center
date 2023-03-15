<%-- 
    Document   : adminupdatelesson
    Created on : Nov 4, 2022, 12:54:09 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
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
                background-color: #F5F9FF;
                width: 70%;
                height: 700px;
            }
        </style>
        <div class="parent">
            <div class ="child">
                <h1>Update course</h1>

                <form action="adminupdatelesson?lessonid=${lessonid}" method="post">
                    <table>
                        <tr>
                            <td>Enter Lesson ID: </td>
                            <td><input type="text" name="lessonid" value="${lessonid}" disabled ><br/></td>
                        </tr>
                        <tr>
                            <td>Enter Lesson Name: </td>
                            <td><input type="text" name="lessonName" value="${lessonName}"><br/><!-- comment --></td>
                        </tr>
                        <tr>
                            <td>Enter Lesson Detail: </td>
                            <td><textarea name="lessonDetail" rows="20" cols="40" >${lessonDetail}</textarea>
                        </tr>
                        



                    </table>
                    <input type="submit" name="submit" value="Update">


                </form>
            </div>
        </div>
    </body>
</html>
