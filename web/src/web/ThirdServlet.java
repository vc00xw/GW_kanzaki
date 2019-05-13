package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ThirdServlet extends HttpServlet {

		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp)
				throws ServletException, IOException {



			//送信されてくるパラメータのエンコーディングの指定
			req.setCharacterEncoding("UTF-8");
			//送信したパラメータの取得(文字列)

			String Java=req.getParameter("gen");
			String PHP=req.getParameter("ge");
			String C=req.getParameter("g");

			//以下、HTML形成で出力されるためのコード
			resp.setContentType("text/html; charset=UTF-8");
			PrintWriter out = resp.getWriter();

			if(Java==null) {
				Java=" ";
			}

			if(PHP==null) {
				PHP=" ";
			}

			if(C==null) {
				C=" ";
			}


			out.println("<html>");
			out.println("<head>");
			out.println("<body>");
			out.println("<h1>申し込み内容確認画面</h1>");
			out.println("<h2>お名前</h2>");
			out.println(req.getParameter("name"));
			out.println("<h2>年齢</h2>");
			out.println(req.getParameter("tosi"));
			out.println("<h2>興味のある言語</h2>");
			out.println(Java+PHP+C);
			out.println("<h2>なにか一言</h2>");
			out.println(req.getParameter("param"));
			out.println("</body>");
			out.println("</head>");
			out.println("</html>");
			out.close();
	}

}
