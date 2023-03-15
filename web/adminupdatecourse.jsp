<%-- 
    Document   : adminupdatecourse
    Created on : Oct 23, 2022, 5:13:25 PM
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

                <form action="adminupdatecourse?cid=${cid}" method="post">
                    <table>
                        <tr>
                            <td>Enter Course ID: </td>
                            <td><input type="text" name="cid" value="${cid}" disabled ><br/></td>
                        </tr>
                        <tr>
                            <td>Enter Course Name: </td>
                            <td><input type="text" name="cname" value="${cname}"><br/><!-- comment --></td>
                        </tr>
                        <tr>
                            <td>Enter Course Detail: </td>
                            <td><textarea name="cdetail" rows="20" cols="40" >${cdetail}</textarea>
                        </tr>
                        <tr>
                            <td>Enter Course Fee: </td>
                            <td><input type="number"  name="cfee" value="${cfee}"><br/><!-- comment --></td>
                        </tr>



                    </table>
                    <input type="submit" name="submit" value="Update">


                </form>
            </div>
        </div>
    </body>
</html>
