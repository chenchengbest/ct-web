package com.creazytooth.common.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.creazytooth.common.utility.HttpUtility;
import org.springframework.web.filter.OncePerRequestFilter;

import com.creazytooth.common.const_value.HttpStatus;
import com.creazytooth.common.const_value.SessionKeyConst;

public class SessionFilter extends OncePerRequestFilter {

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		// 不过滤的uri
		String[] notFilter = new String[] { "/images", "/js", "/css", "/user/login", "/login/mainframe",
				"/user/exist", "/user/checkPassword", "/signcode" };

		// 请求的uri
		String uri = request.getRequestURI();
		// 是否过滤
		boolean doFilter = true;
		for (String s : notFilter) {
			if (uri.indexOf(s) != -1) {
				// 如果uri中包含不过滤的uri，则不进行过滤
				doFilter = false;
				break;
			}
		}

		if (doFilter) {
			// 执行过滤
			// 从session中获取登录者实体
			Object obj = request.getSession().getAttribute(SessionKeyConst.KEY_USER.LOGIN_USER);
			if (null == obj) {
				boolean isAjaxRequest = HttpUtility.isAjaxRequest(request);
				if (isAjaxRequest) {
					response.setCharacterEncoding("UTF-8");
					response.sendError(HttpStatus.HTTP_CODE.Unauthorized, "您已经太长时间没有操作,请刷新页面");
					return;
				}
				response.sendRedirect("/user/login");
				return;
			} else {
				// 如果session中存在登录者实体，则继续
				filterChain.doFilter(request, response);
			}
		} else {
			// 如果不执行过滤，则继续
			filterChain.doFilter(request, response);
		}
	}


}