package digital.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import digital.domain.Admin;

@WebFilter()
public class AuthCheck implements Filter {
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpServletResponse httpResponse = (HttpServletResponse) response;

		Admin loginMember = (Admin) httpRequest.getSession().getAttribute("");
		if (loginMember == null) { // 쿠키에 세션ID가 없다면 로그인 화면으로 보낸다.
			httpResponse.sendRedirect("../admin/loginform");
			return;
		}

		// 다음 필터 또는 서블릿을 실행해야 한다.
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
	}
}
