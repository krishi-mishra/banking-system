package servelet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 */
public class SaveaccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SaveaccountServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		PreparedStatement pst = null;
		Connection conn=null;
		String FormName = request.getParameter("formName");
		String name = request.getParameter("Name");
		String dob = request.getParameter("dateofbirth");
		String Gender = request.getParameter("Gender");
		String gaurdian = request.getParameter("gaurdianname");
		String address = request.getParameter("Address");
		String initialbalance = request.getParameter("savingAccountBalance");
		String aadharfile = request.getParameter("adhar");
		String pancard = request.getParameter("pan");
		String passport = request.getParameter("pass");
		String Sign = request.getParameter("sign");

		System.out.println("name:-" + name);
		System.out.println("dob:-" + dob);
		System.out.println("Gender:- " + Gender);
		System.out.println("s:-" + gaurdian);
		System.out.println("address:-" + address);
		System.out.println("initialbalance:-" + initialbalance);
		System.out.println("adharfile:-" + aadharfile);
		System.out.println("pancard:-" + pancard);
		System.out.println("passport:-" + passport);
		System.out.println("Sign:-" + Sign);


		String name1 = request.getParameter("Name");
		String dob1 = request.getParameter("dateofbirth");
		String Gender1 = request.getParameter("Gender");
		String gaurdian1 = request.getParameter("gaurdianname");
		String address1 = request.getParameter("Address");
		String deposit = request.getParameter("fixedDepositAmount");
		String Tenure = request.getParameter("tenure");

		String aadharfile1 = request.getParameter("adhar");
		String pancard1 = request.getParameter("pan");
		String passport1 = request.getParameter("pass");
		String Sign1 = request.getParameter("sign");

		System.out.println("name1:-" + name1);
		System.out.println("dob1:-" + dob1);
		System.out.println("Gender1:- " + Gender1);
		System.out.println("gaurdian1:-" + gaurdian1);
		System.out.println("address1:-" + address1);
		System.out.println("deposit:-" + deposit);
		System.out.println("tenure:-" + Tenure);

		System.out.println("adharfile1:-" + aadharfile1);
		System.out.println("pancard1:-" + pancard1);
		System.out.println("passport1:-" + passport1);
		System.out.println("Sign1:-" + Sign1);

		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection cone = DriverManager.getConnection("jdbc:mysql://localhost:3306/website", "root", "krishi@2002");
			conn = DBconnection.initializeDatabase();
			System.out.println("conn:-" + conn);
			if ("SavingAccount".equalsIgnoreCase(FormName) ) {
				String query = "insert into  account_opening(name,dob,gender,guardian_name,address,initial_deposit,aadhaar_card,pan_card,passport,signature) "
						+ "values(?,?,?,?,?,?,?,?,?,?)";
				System.out.println("query:-" + query);
				pst = conn.prepareStatement(query);
	
				pst.setString(1, name);
				pst.setString(2, dob);
				pst.setString(3, Gender);
				pst.setString(4, gaurdian);
				pst.setString(5, address);
				pst.setString(6, initialbalance);
				pst.setString(7, aadharfile);
				pst.setString(8, pancard);
				pst.setString(9, passport);
				pst.setString(10, Sign);
	
				int i = pst.executeUpdate();
				if (i > 0) {
					System.out.println("Data added in account_opening table");
				}
				
				if (pst != null) {
					pst.close();
				}
			}
				if ("FixedAccount".equalsIgnoreCase(FormName) ) {
			
				String query1 = "insert into  fixed_deposit(name,dob,gender,guardian_name,address,deposit_amount,tenure,aadhaar_card,pan_card,passport,signature) "
						+ "values(?,?,?,?,?,?,?,?,?,?,?)";
				System.out.println("query:-" + query1);
				pst = conn.prepareStatement(query1);

				pst.setString(1, name1);
				pst.setString(2, dob1);
				pst.setString(3, Gender1);
				pst.setString(4, gaurdian1);
				pst.setString(5, address1);
				pst.setString(6, deposit);
				pst.setString(7, Tenure);
				pst.setString(8, aadharfile1);
				pst.setString(9, pancard1);
				pst.setString(10, passport1);
				pst.setString(11, Sign1);
				
				 int j = pst.executeUpdate();
			        if (j > 0) {
			            System.out.println("Data added in fixed_deposit table");
			        }

			        if (pst != null) {
			            pst.close();
			        }
			    }
			} catch (SQLException | ClassNotFoundException e) {
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