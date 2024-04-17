package chapter23;

import java.util.List;

import bean.Student;
import dao.StudentDAO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tool.Action;

public class SearchAction extends Action {
	public String execute(
		HttpServletRequest request, HttpServletResponse response
	) throws Exception {

		String keyword=request.getParameter("keyword");

		StudentDAO dao=new StudentDAO();
		List<Student> list=dao.search(keyword);

		request.setAttribute("list", list);

		return "list.jsp";
	}
}

