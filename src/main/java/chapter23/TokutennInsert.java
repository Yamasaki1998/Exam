package chapter23;

import java.io.IOException;
import java.io.PrintWriter;

import bean.Student;
import dao.StudentDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tool.Page;

@WebServlet(urlPatterns = { "/chapter23/insert" })
public class TokutennInsert extends HttpServlet {

	public void doPost(
			HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Page.header(out);
		try {
			String student_no = request.getParameter("student_no");
			String subject_cd = request.getParameter("subject_cd");
			String school_cd = request.getParameter("school_cd");
			String no = request.getParameter("no");
			String point = request.getParameter("point");
			String class_num = request.getParameter("class_cd");

			Student s = new Student();
			s.setStudent_no(no);
			s.setSubject_cd(subject_cd);
			s.setSchool_cd(school_cd);
			s.setNo(no);
			s.setPoint(point);
			s.setClass_num(class_num);

			StudentDAO dao = new StudentDAO();
			int line = dao.insert(s);

			if (line > 0) {
				out.println("追加に成功しました。<br><br><a href=\"../chapter25/menu.jsp\">メニューに戻る</a> <a href=\"../chapter23/insert.jsp\">学生の追加</a>\n"
						+ "");
			} else {
				response.sendRedirect("../chapter24/insert-error.jsp");
			}
		} catch (Exception e) {
			response.sendRedirect("../chapter24/insert-error.jsp");
		}
		Page.footer(out);
	}
}
