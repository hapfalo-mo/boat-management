
package controller;

import dao.SailorDao;
import dto.Sailor;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SailorInsertController extends HttpServlet {
            private static String SAILOR_LOAD = "SailorLoad";
            private static String ERROR ="error.jsp";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String url = null;
        try {
                String sid = request.getParameter("sid");
                String sname = request.getParameter("sname");
                String password = request.getParameter("password");
                String rating = request.getParameter("rating");
                String age = request.getParameter("age");
                SailorDao s = new SailorDao();
                Sailor result = s.getSailorById(Integer.parseInt(sid));
                if(result == null){
                    int kq = SailorDao.addNewSailor(Integer.parseInt(sid.trim()),sname, password, Integer.parseInt(rating.trim()), Integer.parseInt(age.trim()));
                    if(kq==1){
                        String alert="Success";
                        request.setAttribute("alert", alert);
                    }
                    url = SAILOR_LOAD;        
                    request.getRequestDispatcher(url).forward(request, response);
                }else{
                    url = ERROR;  
                    response.sendRedirect(url);
                }
        } catch(Exception e){
            e.printStackTrace();
        }
    }


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
