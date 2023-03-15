<%-- 
    Document   : lessondetail
    Created on : Oct 23, 2022, 11:58:07 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lesson Detail</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
    </head>
    <body>
        <%@include file="navbar.jsp"%>

        <div class="container pt-5">
            <div style="padding-bottom: 40px"><h1>${lesson.lessonName}</h1>
                
            </div>
            <div>${lesson.lessonDetail}</div>
            <form action="lessondetail?lessonId=${lesson.lessonId}" method="post">
                <input type="hidden" name="lessonId" value="${lesson.lessonId}">
                <input type="submit" value="Đã học xong" style="padding: 2px 3px;background-color: #0d6efd; color: white;text-decoration: none; border-radius: 5px">
            </form>
        </div>
            


    </body>
</html>
