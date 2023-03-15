/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controllers;

import DAL.*;

import Models.*;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class CourseDetailController extends HttpServlet {

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
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CourseDetailController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CourseDetailController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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

        StudentProgressDAO spd = new StudentProgressDAO();
        ClassDAO cld = new ClassDAO();
        CourseDAO cd = new CourseDAO();
        HttpSession ses = request.getSession();
        User u = (User) ses.getAttribute("user");
        
//       List<StudentProgress> listProgress = (List)ses.getAttribute("listProgress");
//       ses.getAttribute("erolledSCourse");
        
        String id = request.getParameter("cid");
        
        request.setAttribute("course", cd.getCourseByCourseId(id));
        request.setAttribute("classlist", cld.getClassByCourseId(id));

       
//       String classEnroll = (String)request.getAttribute("classEnroll");

        StudentProgress sp = spd.checkEnrollCourse(u.getUsername(), id);
        
        //sai 
        request.setAttribute("classEroll", cld.getEnrollClass(id));
        ses.setAttribute("erolledSCourse", sp);
        request.getRequestDispatcher("coursedetail.jsp").forward(request, response);

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

        String classId = request.getParameter("classId");
        String cId = request.getParameter("cId");
        HttpSession ses = request.getSession();
        User u = (User) ses.getAttribute("user");
        StudentProgressDAO spd = new StudentProgressDAO();
        spd.addStudentProgress(u.getUsername(), cId, classId);

//        List<StudentProgress> lsp = new ArrayList<>();
//        lsp = spd.getAllByUsername(u.getUsername());
//        ses.setAttribute("listProgress", lsp);
        response.sendRedirect("/FinalEdit/coursedetail?cid=" + cId);

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
