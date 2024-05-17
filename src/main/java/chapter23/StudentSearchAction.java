package chapter23;

import java.util.List;

import bean.Test;
import dao.TestDAO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tool.Action;

public class StudentSearchAction extends Action {
	public String execute(
		HttpServletRequest request, HttpServletResponse response
	) throws Exception {

		String student_no=request.getParameter("student_no");

		TestDAO dao=new TestDAO();
		List<Test> list=dao.studentsearch(student_no);

		request.setAttribute("list", list);

		return "../chapter23/testlist.jsp";
	}
}

