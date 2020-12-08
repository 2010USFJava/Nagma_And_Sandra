package com.revature.servlet;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import com.revature.controller.ApprovalController;
import com.revature.controller.EmployeeController;
import com.revature.controller.EmployeeLoginController;
import com.revature.controller.HomeController;
import com.revature.controller.LoginController;

public class RequestHelper {

public static String process(HttpServletRequest req) throws SQLException {
		
	//String projectName = "TRMS_NagmaSandra";
	
		System.out.println(req.getRequestURI());
		switch(req.getRequestURI()) {
			
		case "/TRMS_NagmaSandra/login.change": /* This case will display 'login' page for all users */
			System.out.println("in login.change rhelper");
			return LoginController.login(req);
			
		case "/TRMS_NagmaSandra/home.change": /* This case will display 'home' pages */
			System.out.println("in home.change rhelper");
			return HomeController.home(req);
			
		case "/TRMS_NagmaSandra/approver.benco": /* This case will display 'approvers(1-5)' pages */
			System.out.println("in approver.benco rhelper");
			return ApprovalController.approval(req);
		
		case "/TRMS_NagmaSandra/empLogin.change": /* This case will display 'login' page for all users */
			System.out.println("in empLogin.change rhelper");
			return EmployeeLoginController.login(req);
			
		case "/TRMS_NagmaSandra/home.employee": /* This case will display 'approvers(1-5)' pages */
			System.out.println("in home.employee rhelper");
			return EmployeeController.employee(req);
			
		default:
			System.out.println("in default case Check RequestHelper.java"); /* 'failure' page displayed */
			return "resources/html/failure.html";
			
		}
		
	}
}
