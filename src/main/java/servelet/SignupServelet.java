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
public class SignupServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SignupServelet() {
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
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		 
		PreparedStatement pst = null;
		Connection conn = null;
		String FirstName = request.getParameter("first_name");
		String LasstName = request.getParameter("last_name");
		String Email = request.getParameter("email");
		String password = request.getParameter("password");

		System.out.println("FirstName:-" + FirstName);
		System.out.println("LasstName:-" + LasstName);
		System.out.println("Email:- " + Email);
		System.out.println("password:-" + password);

		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection cone = DriverManager.getConnection("jdbc:mysql://localhost:3306/website", "root", "krishi@2002");
			conn = DBconnection.initializeDatabase();
			System.out.println("conn:-" + conn);
			String query = "insert into signup (firstname,lastname,email,password,confirmpassword) "
					+ "values(?,?,?,?,?)";
			System.out.println("query:-" + query);
			pst = conn.prepareStatement(query);

			pst.setString(1, FirstName);
			pst.setString(2, LasstName);
			pst.setString(3, Email);
			pst.setString(4, password);
			pst.setString(5, password);

			int i = pst.executeUpdate();
			if (i>0) {
				System.out.println("Data added in signup table");
			}
			if (pst != null) {
				pst.close();
			}
				String query1 = "insert into users(username,password) "
						+ "values(?,?)";
				System.out.println("query:-" + query1);
				pst = conn.prepareStatement(query1);

				pst.setString(1, Email);
				pst.setString(2, password);
				
				int j = pst.executeUpdate();
				if (j>0) {
					System.out.println("Data added in users table");
				}
			
			
			
			request.getRequestDispatcher("Login.jsp").forward(request, response);

		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
			if (pst != null) {
				pst.close();
			}
			if (conn != null) {
				conn.close();
			}
			
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
