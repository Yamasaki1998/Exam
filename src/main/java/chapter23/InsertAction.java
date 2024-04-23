
package chapter23;

import java.util.List;

import bean.Student;
import dao.StudentDAO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tool.Action;

public class InsertAction extends Action {
	public String execute(
		HttpServletRequest request, HttpServletResponse response
	) throws Exception {

		String no=request.getParameter("No");
		String name=request.getParameter("Name");
		String ent_year=request.getParameter("Ent_year");
		String class_num=request.getParameter("Class_num");
		Boolean isattend=Boolean.valueOf(request.getParameter("isattend"));
		String school_cd=request.getParameter("School_cd");
		Student p=new Student();
		p.setNo(no);
		p.setName(name);
		p.setEnt_year(ent_year);
		p.setClass_num(class_num);
		p.setIsattend(isattend);
		p.setSchool_cd(school_cd);
		StudentDAO dao=new StudentDAO();
		dao.insert(p);

		List<Student> list=dao.search("");
		request.setAttribute("list", list);

		return "list.jsp";
	}
}
