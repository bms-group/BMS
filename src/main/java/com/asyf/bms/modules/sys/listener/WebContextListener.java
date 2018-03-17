package com.asyf.bms.modules.sys.listener;

import javax.servlet.ServletContext;

import com.asyf.bms.modules.sys.service.SystemService;
import org.springframework.web.context.WebApplicationContext;

public class WebContextListener extends org.springframework.web.context.ContextLoaderListener {

    @Override
    public WebApplicationContext initWebApplicationContext(ServletContext servletContext) {
        //打印欢迎语
        if (!SystemService.printKeyLoadMessage()) {
            return null;
        }
        return super.initWebApplicationContext(servletContext);
    }
}
