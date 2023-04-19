<%-- 
    Document   : login
    Created on : Nov 28, 2022, 4:01:54 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    </head>
    <body>
        <h3 class="text-center text-white pt-5" style="color:#17a2b8">Boat Management</h3>
        <div class="container" >
            <div id="login-row" class="row justify-content-center align-items-center" >
                <div id="login-column" class="col-md-6" style="border: 1px solid #9C9C9C ; margin:50px 0px;max-width: 600px; height: 320px; background-color: #EAEAEA; padding: 20px 0px;border-radius: 20px" >
                    <div id="login-box" class="col-md-12" >
                        <form action="MainController">
                            <h3 class="text-center text-info mt-2 ">Login</h3>
                            <div class="form-group"style="padding:10px 30px">
                                <label for="username" class="text-info">Username:</label>
                                <input class="form-control" type="text"  placeholder="username or email" name="txtusername" >
                            </div>
                            <div class="form-group"style="padding: 10px 30px">
                                <label for="password" class="text-info">Password:</label>
                                <input class="form-control" type="password" placeholder="********" name="txtpassword">
                            </div>
                            <div class=" form-group justify-content-center" style="padding:10px 30px">
                                <input class="btn btn-info btn-md  text-white align-items-center" style="margin: 0px 210px;padding: 10px 30px" type="submit" placeholder="********" value="login" name="action" >
                            </div>
                            <%
                                String error = (String) request.getAttribute("error");
                                if (error != null) {
                            %>
                            <div class="alert alert-danger" role="alert">
                                Username or password are empty or incorrect! Check it and do login
                            </div>
                            <%
                                }
                            %>
                        </form>

                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
