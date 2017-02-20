package com.creazytooth.common.utility;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2016/7/30 0030.
 */
public class HttpUtility {
    /**
     * 判断是否为Ajax请求 <功能详细描述>
     *
     * @param request
     * @return 是true, 否false
     * @see [类、类#方法、类#成员]
     */
    public static boolean isAjaxRequest(HttpServletRequest request) {
        String header = request.getHeader("X-Requested-With");
        if (header != null && "XMLHttpRequest".equals(header))
            return true;
        else
            return false;
    }
}
