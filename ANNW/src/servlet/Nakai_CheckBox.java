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

@WebServlet("/Nakai_CheckBox")
public class Nakai_CheckBox extends HttpServlet {

	private ArrayList<Customer> al = new ArrayList<>();

    public Nakai_CheckBox() {
        super();
    }

	public  void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

			req.setCharacterEncoding("UTF-8");
			//名前,選択したものを取得
			String username = req.getParameter("name");
			String hobby[] = req.getParameterValues("hobby");
			StringBuffer sb = new StringBuffer();

			//Customerをインスタンス化
			Customer customer = new Customer();
			//空っぽなので設定する
			customer.setName(username);
			
			sb.append("customer.getname()"+"は以下のものに興味をもっている");
			
			if (hobby != null){
			      for (int i = 0 ; i < hobby.length ; i++){
			        sb.append(hobby[i]);
			        sb.append(",");
			      }
			}

			al.add(customer);

			//転送するインスタンスをcustomerという名
			req.setAttribute("customers", customer);
			req.setAttribute("hobby", new String(sb));
			RequestDispatcher dispatcher = req.getRequestDispatcher("nakai_result.jsp");

			dispatcher.forward(req, res);
	}

}
