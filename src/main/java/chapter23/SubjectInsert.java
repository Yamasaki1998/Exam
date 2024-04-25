
package chapter23;

import java.io.IOException;
import java.io.PrintWriter;

import bean.Subject;
import dao.SubjectDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tool.Page;

@WebServlet(urlPatterns={"/chapter23/subjectinsert"})
public class SubjectInsert extends HttpServlet {

	public void doPost (
		HttpServletRequest request, HttpServletResponse response
	) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		Page.header(out);
		try {
			String school_cd=request.getParameter("school_cd");
			String cd=request.getParameter("cd");
			String name=request.getParameter("name");

			Subject s=new Subject();
			s.setSchool_cd(school_cd);
			s.setCd(cd);
			s.setName(name);

			SubjectDAO dao=new SubjectDAO();
			int line=dao.insert(s);

			if (line > 0) {
				out.println("追加に成功しました。<br><br><a href=\"../chapter25/subject_insert.jsp\">科目の追加</a> <a href=\"../chapter23/subject_insert.jsp\">科目の追加</a>\n"
						+ "");
			} else {
				response.sendRedirect("../chapter24/subject-insert-error.jsp");
			}
		} catch (Exception e) {
			response.sendRedirect("../chapter24/subject-insert-error.jsp");
		}
		Page.footer(out);
	}
}
