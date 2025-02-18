
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.model.RockPaperScissorGame;
import za.ac.tut.model.RockPaperScissorInterface;

public class RockPaperScissor extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            String name = request.getParameter("name");
            String rockPaperScissor = request.getParameter("rockPaperScissor");
            
            
            //Do something 
            RockPaperScissorInterface rpsi = new RockPaperScissorGame();
            String siriSign=rpsi.determineSiriSign();
            String option =rpsi.playGame(rockPaperScissor);
            String win = rpsi.determineTheWinner(rockPaperScissor, siriSign);
            
            request.setAttribute("name", name);
            request.setAttribute("rockPaperScissor", rockPaperScissor);
            request.setAttribute("siriSign", siriSign);
            request.setAttribute("option", option);
            request.setAttribute("win", win);
            
            RequestDispatcher disp = request.getRequestDispatcher("outcome.jsp");
            disp.forward(request, response);
               
    }

   
}
