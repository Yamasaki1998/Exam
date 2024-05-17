package chapter23;

import java.util.List;

import bean.Test;
import dao.TestDAO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tool.Action;

public class KamokuSearchAction extends Action {
	public String execute(
		HttpServletRequest request, HttpServletResponse response
	) throws Exception {

		String ent_year=request.getParameter("ent_year");
		String class_num=request.getParameter("class_num");
		String subject_cd=request.getParameter("subject_cd");
		String no=request.getParameter("no");

		TestDAO dao=new TestDAO();
		List<Test> list=dao.kamokusearch(ent_year, class_num, subject_cd, no);

		request.setAttribute("list", list);

		return "../chapter23/testlist.jsp";
	}
}

