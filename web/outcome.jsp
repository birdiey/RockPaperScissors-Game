<%-- 
    Document   : outcome
    Created on : 18 Feb 2025, 6:32:20 PM
    Author     : samuk
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Outcome Page</title>
    </head>
    <body>
        <h1>Outcome of the winner of Rock Paper Scissor Game</h1>
        

        
        <%
            String name = (String)request.getAttribute("name");
            String rockPaperScissor = (String)request.getAttribute("rockPaperScissor");
            String siriSign = (String)request.getAttribute("siriSign");
            String option = (String)request.getAttribute("option");
            String win = (String)request.getAttribute("win");
            String computerName = pageContext.getServletContext().getInitParameter("computer_name");
        
        
        
        %>
    </body>
    
    <p>
        <br>Name : <%=name%></br>
        <br> Computer Name :<%=computerName%></br>
        <br> Siri sign: <%=siriSign%></br>
        <br>The player's choice is: <%=rockPaperScissor%></br>
       <br>The win outcome: <%=win%></br>
       
    </p>
</html>
