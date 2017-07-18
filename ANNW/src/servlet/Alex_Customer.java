package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Customer;

@WebServlet("/Alex_Customer")
public class Alex_Customer extends HttpServlet {

	private ArrayList<Customer> customers = new ArrayList<>();

    public Alex_Customer() {
        super();
    }

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

			req.setCharacterEncoding("UTF-8");

			String username = req.getParameter("name");
			String password = req.getParameter("pass");

			//Customerをインスタンス化
			Customer customer = new Customer();

			//空っぽなので設定する
			customer.setName(username);
			customer.setPass(password);

			customers.add(customer);

			//転送するインスタンスをcustomerという名
			req.setAttribute("customers", customers);

			RequestDispatcher dispatcher = req.getRequestDispatcher("alex_result.jsp");

			dispatcher.forward(req, res);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
