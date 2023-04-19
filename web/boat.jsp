

<%@page import="java.util.ArrayList"%>
<%@page import="dto.Boat"%>
<%@page import="dto.Boat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Boat Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    </head>
    <body>
        <jsp:include page="navbar.jsp"/>
        <%
            ArrayList<Boat> list = (ArrayList) request.getAttribute("listBoat");
            if (list != null && list.size() > 0) {
        %>
        <div class="header-container d-flex justify-content-center mt-5">
            <h2>Boat List</h2>
        </div>

        <div class="table-container" style=" padding: 0px 200px" >
            <table border="1" class="table mt-3">
                <thead style="background-color: #0dcaf0 ">
                    <tr style="color: #ffffff">
                        <th>No</th>
                        <th>Boat Name</th>
                        <th>Color</th>
                        <th>Update</th>
                    </tr>
                </thead>
                <% for (Boat b : list) {
                %>
                <tbody style=" color: #198754; " >
                    <tr>
                        <td ><%= b.getBid()%></td>
                        <td ><%= b.getBname()%></td>
                        <td ><%= b.getColor()%></td>
                <form action="MainController">
                    <td>
                        <input type="hidden" name="id" value="<%=b.getBid()%>" >
                        <button class="btn btn-success" name="action" value="get">Edit</button>
                    </td>
                </form>
                </tr>
                <% } %>
                </tbody>
            </table>
        </div>
        <%      }
        %>
        <%
            Boat boat = (Boat) request.getAttribute("boat");
            if (boat != null) {
        %>
        <div class="container mt-5" style="border-radius: 15px; padding: 40px 100px;background-color: #dde0e3">
            <form action="MainController">
                <div class="headerBody-conatiner d-flex justify-content-center">
                    <h3>Update Form</h3>
                </div>

                <div class="form-outline mb-4">
                    <label class="form-label">Boat ID: </label>
                    <input type="text" class="form-control" name="boatID" value="<%= boat.getBid()%> " readonly>
                </div>
                <div class="form-outline mb-4">
                    <label class="form-label">Boat Name: </label>
                    <input type="text" class="form-control" value="<%= boat.getBname()%>" name="boatname">
                </div>
                <div class="form-outline mb-4">
                    <label class="form-label">Color: </label>
                    <input type="text" class="form-control" value="<%= boat.getColor()%>" name="boatcolor">
                </div>
                <div class="d-flex justify-content-center">
                    <button class="btn btn-info" name="action" value="Update">Save</button>
                </div>
            </form>
        </div> 
        <% }%>

    </body>
</html>
