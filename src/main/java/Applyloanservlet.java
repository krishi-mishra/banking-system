
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import servelet.DBconnection;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**

 */
public class Applyloanservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection conn;


	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Applyloanservlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @param pst 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PreparedStatement pst = null;
		String name=request.getParameter("Name");
		String dob=request.getParameter("dateofbirth");
		String gender=request.getParameter("Gender");
		String Gaurdian=request.getParameter("gaurdian");
		String address=request.getParameter("Address");
		String loan=request.getParameter("Digit");
		String pay=request.getParameter("period");
		String Interset=request.getParameter("interest");
		String digit=request.getParameter("Digit");
		String Adhar=request.getParameter("adhar");
		String Pan=request.getParameter("pan");
		String Pass=request.getParameter("pass");
		String Sign=request.getParameter("sign");
		
		System.out.println("name:-"+ name);
		System.out.println("dob:-"+ dob);
		System.out.println("gender:-"+ gender);
		System.out.println("Gaurdian:-"+ Gaurdian);
		System.out.println("address:-"+ address);
		System.out.println("loan:-"+ loan);
		System.out.println("pay:-"+ pay);
		System.out.println("Interest:-"+ Interset);
		System.out.println("digit:-"+ digit);
		System.out.println("Adhar:-"+ Adhar);
		System.out.println("Pan:-"+ Pan);
		System.out.println("Pass:-"+ Pass);
		System.out.println("Sign:-"+ Sign);
		
		try {
			conn = DBconnection.initializeDatabase();
			System.out.println("conn:-" + conn);

			
			String query =  "insert into apply_loan (name,dob,gender,gaurdian,address,amount,period,interest,digit,adhar,pan,pass,sign)"
					
					+ "values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
			
			System.out.println("query:-" + query);
			pst = conn.prepareStatement(query);

			

			pst.setString(1, name);
			pst.setString(2, dob);
			pst.setString(3, gender);
			pst.setString(4, Gaurdian);
			pst.setString(5, address);
			pst.setString(6, loan);
			pst.setString(7, pay);
			pst.setString(8, Interset);
			pst.setString(9, digit);
			pst.setString(10, Adhar);
			pst.setString(11, Pan);
			pst.setString(12, Pass);
			pst.setString(13, Sign);
		
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










