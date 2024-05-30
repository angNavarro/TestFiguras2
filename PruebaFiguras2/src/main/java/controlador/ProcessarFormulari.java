/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Circulo;
import modelo.Figura;
import modelo.Rectangulo;
import modelo.TrianguloEquilatero;

/**
 *
 * @author angel
 */
public class ProcessarFormulari extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");

        //1- Creamos el arraylist donde van a estar la lista de figuras. 
        ArrayList<Figura> listaFiguras = (ArrayList<Figura>) request.getSession().getAttribute("lista");
        //2- Si la lista de figura nos esta creada la creamos. 
        if (listaFiguras == null) {
            listaFiguras = new ArrayList<>();
            request.getSession().setAttribute("lista", listaFiguras);
        }

        //3- Nos traemos las variables de color y figura que son los abstractos.  
        String color = request.getParameter("color");
        String tipoFigura = request.getParameter("figura");

        //4-Nos traemos las variables especificas de las figuras. 
        try {
            if (tipoFigura.equals("cercle")) {
                double radi = Double.parseDouble(request.getParameter("radi"));
                listaFiguras.add(new Circulo(radi, color));

            } else if (tipoFigura.equals("rectangle")) {
                double base = Double.parseDouble(request.getParameter("baseRectangle"));
                double altura = Double.parseDouble(request.getParameter("alturaRectangle"));
                listaFiguras.add(new Rectangulo(base,altura,color));
                
            } else {
                double base = Double.parseDouble(request.getParameter("baseTriangle"));
                double altura = Double.parseDouble(request.getParameter("alturaTriangle"));
                listaFiguras.add(new TrianguloEquilatero(base,altura,color)); 
            }
            response.sendRedirect("resultats.jsp");
            

        } catch (IOException | NumberFormatException e) {
            response.sendRedirect("error.jsp");

        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
