<%-- 
    Document   : admin.jsp
    Created on : Nov 28, 2022, 4:25:25 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css" />
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    </head>
    <body>
        <jsp:include page="navbar.jsp"/>
        <div class="container mt-5">
            <%
                String user = (String) session.getAttribute("user");
                if (user != null) {
                    out.println("<h2>WELCOME TO ADMIN PAGE," + user + "</h2>");
            %>
            <table border="2" class="table mt-5">
                <thead style="color: #ffffff ; background-color: #0dcaf0">
                    <tr>
                        <th>No.</th>    
                        <th>List Name</th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>1</td>
                        <td>Manage Boats</td>
                        <td><a href="BoadLoad"><i class="fas fa-share" style="color:#000"></i></a></td>
                    </tr>
                    <tr>
                        <td>2</td>
                        <td>Manage Sailors</td>
                        <td><a href="SailorLoad"><i class="fas fa-share" style="color:#000"></i></a></td>
                    </tr>
                    <tr>
                        <td>3</td>
                        <td>Register Boats</td>
                        <td><a href="register.jsp"><i class="fas fa-share" style="color:#000"></i></a></td>
                    </tr>
                </tbody>
            </table>

            <% }%>
        </div>

    </body>
</html>
