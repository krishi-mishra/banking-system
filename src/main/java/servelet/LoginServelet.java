package servelet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 
 */
public class LoginServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServelet() {
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
		doPost(request, response);
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection conn = null;

		String email = request.getParameter("name");

		String password = request.getParameter("password");
		System.out.println("email: " + email);
		System.out.println("password:-" + password);
		try {
			conn = DBconnection.initializeDatabase();
			System.out.println("conn:-" + conn);

			// Prepare the SELECT query
			String query1 = "SELECT * FROM users WHERE username = ?";
			PreparedStatement statement = (conn.prepareStatement(query1));
			statement.setString(1, email);

			// Execute the query
			ResultSet resultSet = statement.executeQuery();

			if (resultSet.next()) {
				// User found, perform validation
				String storedPassword = resultSet.getString("password"); // Assuming password column is named "password"
				System.out.println("storedPassword:- " + storedPassword);
				// Perform password validation
				if (validatePassword(storedPassword, password)) {
					// Login successful
					System.out.println("Login successful!");
					request.getRequestDispatcher("HomePage.jsp").forward(request, response);
				} else {
					// Invalid password
					System.out.println("Invalid password!");
				}
			} else {
				// User not found
				System.out.println("User not found!");
			}

			// Close resources
			resultSet.close();
			statement.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private boolean validatePassword(String storedPassword, String enteredPassword) {

		return storedPassword.equals(enteredPassword);
	}
}