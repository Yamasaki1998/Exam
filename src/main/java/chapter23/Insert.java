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

@WebServlet(urlPatterns={"/gakuseikanri/insert"})
public class Insert extends HttpServlet {

	public void doPost (
		HttpServletRequest request, HttpServletResponse response
	) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		Page.header(out);
		try {
			int id=Integer.parseInt(request.getParameter("id"));
			String name=request.getParameter("name");
			String course=request.getParameter("course");

			Student s=new Student();
			s.setId(id);
			s.setName(name);
			s.setCourse(course);

			StudentDAO dao=new StudentDAO();
			int line=dao.insert(s);

			if (line>0) {
				out.println("追加に成功しました。");
			}
		} catch (Exception e) {
			e.printStackTrace(out);
		}
		Page.footer(out);
	}
}
