package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BeanUtilities;
import model.Carro;

@WebServlet(name = "CarroServlet", urlPatterns = "/CarroServlet")
public class CarroServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Carro c = new Carro();
        BeanUtilities.populateBean(c, request);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<h1> Ano: " + c.getAno() + "</h1>");
        out.println("<h1> Marca: " + c.getMarca() + "</h1>");
        out.println("<h1> Modelo: " + c.getModelo() + "</h1>");
        out.println("</html>");
    }
}
