/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controllers;

import DAO.DAO_Editorial;
import Modals.CRUD_Editorial;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alumno
 */
public class editoriales__Controller extends HttpServlet {

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
            throws ServletException, IOException, SQLException{
        response.setContentType("text/html;charset=UTF-8");

        String mensaje;
        String insertEditorial;

        try {
            DAO_Editorial editorial = validacionUsuario(request);
            CRUD_Editorial crud_editorial = new CRUD_Editorial();
            insertEditorial = crud_editorial.Create(editorial);
            mensaje = insertEditorial;
            if (Integer.parseInt(insertEditorial) != 0) {
                mensaje = "Editorial grabada con exito";
            }
        } catch (NumberFormatException ex) {
            mensaje = ex.toString();
        }

        request.setAttribute("mensaje", mensaje);
        request.getRequestDispatcher("home.jsp").forward(request, response);

    }

    protected DAO_Editorial validacionUsuario(HttpServletRequest request) {
        DAO_Editorial editorial = new DAO_Editorial();
        String nombre = request.getParameter("nombre_editorial");
        
        if (editorial.ValidaSubida(nombre)) {
            return editorial;
        }else{
            return new DAO_Editorial();
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(editoriales__Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(editoriales__Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
