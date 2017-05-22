package com.shark.ssm.models.sys.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.shark.ssm.common.Const;
import com.shark.ssm.models.sys.entity.User;

/** 
 * @Description: TODO
 * @author Wangjie
 * @date 创建时间：2017年5月18日 下午10:16:38
 * @version 1.0
 * @since  
 */
public class LoginInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("LoginInterceptor    preHandle");
		String path = request.getServletPath();
		System.out.println("path = " + path);
		String url = request.getRequestURI();
		System.out.println("url = " + url);
		if(path.matches(Const.NO_LOGIN_INTERCEPTOR_PATH)){
			return true;
		}
//			HttpSession session = request.getSession();
//			User sysUser = (User) session.getAttribute(Const.SESSION_USER); 
		
		//不符合条件的，跳转到登录界面  
        //request.getRequestDispatcher("/WEB-INF/classes/templates/sys/login.html").forward(request, response);
        
		return false;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("LoginInterceptor    postHandle");
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("LoginInterceptor    afterCompletion");
	}

}
