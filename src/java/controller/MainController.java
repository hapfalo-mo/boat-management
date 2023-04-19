package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MainController extends HttpServlet {

    private static String LOGIN = "login";
    private static String LOGIN_CONTROLLER = "login-controller";
    private static String ERROR = "error.jsp";
    private static String ADD = "add";
    private static String BOAT_INSERT = "BoadInsertController";
    private static String UPDATE ="Update";
    private static String UPDATE_SAILORS ="BoatUpdateController";
    private static String CREATE ="Create";
    private static String CREATE_CONTROLLERS ="SailorInsertController";
    private static String GET ="get";
    private static String GET_A_BOAT ="GetOneBoat";
    private static String LOGOUT="logout";
    private static String LOGOUT_CONTROLLER="LogoutController";
    private static String FINDSID="FindSid";
    private static String FINDSID_CONTROLLER="RegisterListLoadBySid";
    private static String FINDBID="FindBid";
    private static String FINDBID_CONTROLLER="RegisterListLoadByBid";
    private static String REGIST ="Save";
    private static String REGIST_CONTROLLER ="InserAtRegisterToList";

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String url = ERROR;
        try {
            String action = request.getParameter("action");
            if (LOGIN.equals(action)) {
                url = LOGIN_CONTROLLER;
            } else if (ADD.equals(action)) {
                url = BOAT_INSERT;
            } else if (UPDATE.equals(action)){
                url = UPDATE_SAILORS;
            } else if (CREATE.equals(action)){
                url = CREATE_CONTROLLERS; 
            } else if (GET.equals(action)){
                url = GET_A_BOAT;
            } else if (LOGOUT.equals(action)){
                url = LOGOUT_CONTROLLER;
            }else if (FINDSID.equals(action)){
                url = FINDSID_CONTROLLER;
            }else if (FINDBID.equals(action)){
                url = FINDBID_CONTROLLER;
            }else if (REGIST.equals(action)){
                url= REGIST_CONTROLLER;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            request.getRequestDispatcher(url).forward(request, response);
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
