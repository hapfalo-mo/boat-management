<%-- 
    Document   : sailor
    Created on : Nov 29, 2022, 5:57:43 PM
    Author     : Admin
--%>

<%@page import="dto.Sailor"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sailor Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    </head>
    <body style="height: 150vh" >
        <jsp:include page="navbar.jsp"/>
        <%
            ArrayList<Sailor> list = (ArrayList) request.getAttribute("listSailor");
            if (list != null && list.size() > 0) {
        %>
        <div class="table-container" style="padding: 0px 100px">
            <table border="0.5" class="table mt-5 p-5" style="background-color: #e2e3e5">
                <thead class="thead" style="color: #fff3cd; background-color: #0c63e4" >
                    <tr>
                        <th>Sailor No</th>
                        <th>Name</th>
                        <th>Password</th>
                        <th>rating</th>
                        <th>age</th>
                    </tr>
                </thead>
                <% for (Sailor s : list) {
                %>
                <tbody>
                    <tr>
                        <td><%= s.getSid()%></td>
                        <td><%= s.getSname()%></td>
                        <td><%= s.getPassword()%></td>
                        <td><%= s.getRating()%></td>
                        <td><%= s.getAge()%></td>
                    </tr>
                </tbody>
                <% } %>
            </table>
        </div>
        <%
            }
        %>
        <div class="container " style="padding: 0px 200px; border-radius: 15px; background-color: #EAEAEA">

            <form action="MainController">
                <div class="d-flex justify-content-center mt-4">
                    <h3>Create a new Sailor</h3>
                </div>
                <div class="form-outline mb-4">
                    <label class="form-label">Sailor ID</label>
                    <input type="text" class="form-control" name="sid">

                </div>
                <div class="form-outline mb-4">
                    <label class="form-label">Sailor Name</label>
                    <input type="text" class="form-control" name="sname">
                </div>
                <div class="form-outline mb-4">
                    <label class="form-label">Sailor PassWord</label>
                    <input type="text" class="form-control" name="password">
                </div>
                <div class="form-outline mb-4">
                    <label class="form-label">Sailor Rating</label>
                    <input type="text" class="form-control" name="rating">         
                </div>
                <div class="form-outline mb-4">
                    <label class="form-label">Sailor Age</label>
                    <input type="text" class="form-control" name="age"                   
                </div>
                <div class="mt-4 d-flex justify-content-center">
                    <button class="btn btn-success" name="action" value="Create">Create</button>
                </div>
            </form>
            <%
                String alert = (String) request.getAttribute("alert");
                if (alert != null) {
            %>
            <div class="alert alert-success" role="alert">
                Add Successfully!!
            </div>
            <%
                }

            %>
        </div>
    </div>
    </body>
</html>
