
package chapter23;

import java.util.List;

import bean.Test;
import dao.TestDAO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tool.Action;

public class TestInsertAction extends Action {
	public String execute(
		HttpServletRequest request, HttpServletResponse response
	) throws Exception {

		String student_no=request.getParameter("student_no");
		String subject_cd=request.getParameter("subject_cd");
		String school_cd=request.getParameter("school_cd");
		String no=request.getParameter("no");
		String point=request.getParameter("point");
		String class_num=request.getParameter("class_num");




		Test s=new Test();
		s.setStudent_no(student_no);
		s.setSubject_cd(subject_cd);
		s.setSchool_cd(school_cd);
		s.setNo(no);
		s.setPoint(point);
		s.setClass_num(class_num);

		TestDAO dao=new TestDAO();
		dao.insert(s);

		List<Test> list=dao.search("");
		request.setAttribute("list", list);

		return "testlist.jsp";
	}
}
