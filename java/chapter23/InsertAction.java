package chapter23;

import java.util.List;

import bean.Product;
import dao.ProductDAO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tool.Action;

public class InsertAction extends Action {
	public String execute(
		HttpServletRequest request, HttpServletResponse response
	) throws Exception {

		String Name=request.getParameter("Name");
		Integer Ent_Year=Integer.parseInt(request.getParameter("Ent_Year"));

		Student p=new Student();
		p.setName(name);
		p.setPrice(price);
		ProductDAO dao=new ProductDAO();
		dao.insert(p);

		List<Product> list=dao.search("");
		request.setAttribute("list", list);

		return "list.jsp";
	}
}


