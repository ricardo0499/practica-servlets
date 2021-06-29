/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Tech
 */
public class NewServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
                    throws IOException, ServletException {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            int num = Integer.parseInt(request.getParameter("text1"));
            out.println ("<!DOCTYPE HTML PUBLIC \""+
			     "-//W3C//DTD HTML 4.0 " + 
			     "Transitional//EN\">");
		out.println ("<HTML>");
		out.println ("<BODY>");
                out.println("<center>");
		out.println ("<h1>La Secuencia de Fibonacci</h1>");
                out.println ("<br>");
                out.println ("<div style=\"-webkit-box-shadow: 0px 10px 13px -7px #000000, 5px 5px 15px 5px rgba(0,0,0,0); \n" +
"box-shadow: 0px 10px 13px -7px #000000, 5px 5px 15px 5px rgba(0,0,0,0);border:1px gray solid;width: 50%;margin-top: 100px\">");
                    long numero,fib1,fib2,i;
                    String f;
                    out.println("Los " + num + " primeros términos de la serie de Fibonacci son:\n");                 
                    out.println ("<br>");
                    fib1=1;
                    fib2=1;

                    out.println(fib1 + " \n");
                    out.println ("<br>");
                    for(i=2;i<=num;i++){
                        out.println(fib2 + " \n");
                        out.println ("<br>");
                        fib2 = fib1 + fib2;
                        fib1 = fib2 - fib1;
                    }
		//out.println(this.fact(num));
                out.println("<form method=\"get\" action=\"index.jsp\">");
                out.println("<input type=\"submit\" value=\"Volver\"/></form>");
                out.println("</div>");
                out.println("</center>");
		out.println ("</BODY>");
		out.println ("</HTML>");
    }

}