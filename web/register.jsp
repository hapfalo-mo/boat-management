

<%@page import="dto.Reverse"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    </head>
    <body>
        <jsp:include page="navbar.jsp"/>
        <div class="container">
            <div class="box-search d-flex flex-row justify-content-between">
                <form action="MainController">
                    <div class="form-group">
                        <label class="text-info">Enter the Sailor id: </label>
                        <input class="" type="text" name="sidfind">
                        <input type="submit" name="action" value="FindSid" class="form-outline mt-2" style="background-color: #0dcaf0; color: #ffffff;"> 
                    </div><br>
                </form>
                <form action="MainController">
                    <div class="form-group">
                        <label class="text-info">Enter the Boat id: </label>
                        <input class="" type="text" name="bidfind">
                        <input type="submit" name="action" value="FindBid" style="background-color: #0dcaf0; color: #ffffff;" class="form-outline mt-2"> 
                    </div>
                </form>
            </div>
            <%
                ArrayList<Reverse> list = (ArrayList) request.getAttribute("sidList");
                ArrayList<Reverse> list2 = (ArrayList) request.getAttribute("bidList");
                if (list != null && list.size() > 0) {
            %>

            <div class="table-container mt-3" >
                <table border="1" class="table">
                    <thead>
                        <tr>
                            <th>Sailor ID</th>
                            <th>Boat ID</th>
                            <th>Date</th>
                        </tr>
                    </thead>
                    <% for (Reverse s : list) {

                    %>
                    <tbody>
                        <tr>
                            <td><%= s.getSid()%> </td>
                            <td><%= s.getBid()%></td>
                            <td><%= s.getDate()%></td>
                        </tr>
                    </tbody>
                    <% } %>
                </table>
            </div>
            <%
            } else if (list2 != null && list2.size() > 0) {
            %>
            <div class="table-container mt-3 ">
                <h1 class="d-flex justify-content-center">Reverse List</h1>
                <table border="1" class="table">
                    <thead>
                        <tr>
                            <th>Sailor ID</th>
                            <th>Boat ID</th>
                            <th>Date</th>
                        </tr>
                    </thead>
                    <% for (Reverse s : list2) {

                    %>
                    <tbody>
                        <tr>
                            <td><%= s.getSid()%> </td>
                            <td><%= s.getBid()%></td>
                            <td><%= s.getDate()%></td>
                        </tr>
                    </tbody>
                    <% } %>
                </table>
            </div>
            <%
                }
            %>
        </div>
        <form action="MainController">
            <div class="box-conatiner mt-5 " style="margin: 0px 500px; padding:50px 0px ; border-radius: 20px; background-color: #d3d6d8">
                <div class="box-header d-flex justify-content-center mt-2">
                    <h3>Register Form</h3>
                </div>
                <div class="box-content" style="padding: 0px 100px">
                    <div class="form-group">
                        <label class="text-info">Sailor ID: </label>
                        <input class="form-control" type="text" name="sid">
                        <label class="text-info">Boat ID: </label>
                        <input class="form-control" type="text" name="bid">
                    </div>
                    <div class="form-group" >
                        <label class="text-info mt-2">Enter the time you want to book:</label><br>                        
                        <input type="date" name="date">
                    </div>
                </div>
                <div class="box-buton mt-3"  style="padding: 0px 100px" >
                    <div class="button-content">
                        <button class="btn btn-warning" name="action" value="Save">Save</button>
                    </div>       
                </div>
                <% String success = (String) request.getAttribute("success");
                    if (success != null) { %>
                <div class="alert alert-success" role="alert">
                    Save successfully!!!
                </div>
                <% }%>
                <% String fail = (String) request.getAttribute("fail");
                    if (fail != null) { %>
                <div class="alert alert-danger" style="padding: 0px 100px" role="alert">
                    There are something empty!! Let do it again
                </div>
                <% }%>
            </div>
        </form>
    </div>
</body>
</html>
