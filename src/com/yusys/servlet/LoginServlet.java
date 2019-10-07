package com.yusys.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yusys.entity.User;
import com.yusys.service.IUserService;
import com.yusys.service.impl.UserService;

/**
 * 登录
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IUserService<User> userService = new UserService();

	public LoginServlet() {
		super();
	}

	private String uri = "";

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = (String) request.getAttribute("userName");
		String password = (String) request.getAttribute("pwd");
		User user = new User(username, password);
		User loginUser = userService.login(user);
		if (loginUser != null) {
			request.getSession().setAttribute("loginInfo", loginUser);
			uri="/index";
		} else {
			uri="/login.jsp";
		}
		request.getRequestDispatcher(uri).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
