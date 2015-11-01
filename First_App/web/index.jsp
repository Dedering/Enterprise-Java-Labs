<%--
  Created by IntelliJ IDEA.
  User: Private
  Date: 9/24/15
  Time: 10:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%--
<%@ page session="true"%>

User '<%=request.getRemoteUser()%>' has been logged out.

<% session.invalidate(); %>
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title></title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
  </head>
  <body>
<div id="badge-ribbon"></div>
  <div id="login" class="form">
    <div class="form-inner">
      <!--<form name="login" action="/admin.jsp" method="get">
        <label>
            <div class="label-inner">
                <input type="text" name="username" />
                username
            </div>
        </label>
        <label>
            <div class="label-inner">
                <input type="password" name="password" class="password" />
                password
            </div>
        </label>
          <input type="submit" name="submit" />

      </form>-->
        <nav>

            <div>
                <a href="/display.jsp">Display</a>
            </div>
        </nav>
    </div>
  </div>

<img src="/images/established.png" class="established">
<div>
    <a href="/admin.jsp">Admin</a>
</div>





  </body>
</html>
