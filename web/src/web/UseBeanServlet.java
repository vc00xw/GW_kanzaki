package web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UseBeanServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//インスタンス化
		EmpBean bean = new EmpBean();
		//EmpBeanクラスのsetNameをメソッドに値をセットしている
		bean.setName("KnowledgeTaro");
		//EmpBeanクラスのsetAgeをメソッドに値をセットしている
		bean.setAge(20);

		//requestオブジェクトに入っている
		//(keyがempでvalueがbeanの中身)
		request.setAttribute("emp", bean);

		//RequestDispatcherを用いて,遷移先を指定している
		RequestDispatcher rd = request.getRequestDispatcher("/page/useBean.jsp");

		//RequestDispatcherを用いて投げている
		rd.forward(request, response);

	}
}
