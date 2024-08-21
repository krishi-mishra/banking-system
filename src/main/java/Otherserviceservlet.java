

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import servelet.DBconnection;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * Servlet implementation class Otherserviceservlet
 */
public class Otherserviceservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Otherserviceservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection conn=null;
		String Debit=request.getParameter("debit");
		String Credit=request.getParameter("credit");
		String Internet=request.getParameter("internet");
		String Crop=request.getParameter("crop");
		String Life=request.getParameter("life");
		String General=request.getParameter("general");
		String Facility=request.getParameter("facility");
		String Gold=request.getParameter("gold");
		
		System.out.println("Debit:-"+ Debit);
		System.out.println("Credit:-"+ Credit);
		System.out.println("Internet:-"+ Internet);
		
		System.out.println("Crop:-"+ Crop);
		System.out.println("Life:-"+ Life);
		System.out.println("General:-"+ General);
		System.out.println("Facility:-"+ Facility);
		System.out.println("Gold:-"+ Gold);
		
		
		PreparedStatement pst = null;
		try {
			conn = DBconnection.initializeDatabase();
			System.out.println("conn:-" + conn);

			
			String query =  "insert into other_services (debitcard,creditcard,intbank,cropinsurance,lifeinsurance,generalinsurance,lockfac,goldloan)"
					
					+ "values(?,?,?,?,?,?,?,?)";
			
			System.out.println("query:-" + query);
			pst = conn.prepareStatement(query);

			

			pst.setString(1, Debit);
			pst.setString(2, Credit);
			pst.setString(3, Internet);
			pst.setString(4, Crop);
			pst.setString(5, Life);
			pst.setString(6, General);
			pst.setString(7, Facility);
			pst.setString(8, Gold);
			
		int i = pst.executeUpdate();
		if (i > 0) {
			System.out.println("Data added in account_opening table");
			}
		 } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                if (pst != null) {
	                    pst.close();
	                }
	                if (conn != null) {
	                    conn.close();
	                }
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        }
	    }
	}











