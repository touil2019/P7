package com.ocr.zuul.filters;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.logging.Logger;

@Component
public class LogFilter extends ZuulFilter {

   /* Logger log = LoggerFactory.getLogger(this.getClass());*/

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {

        HttpServletRequest req = RequestContext.getCurrentContext().getRequest();

        /*log.info("L'URL est : {}",req.getRequestURL());*/

        return null;
    }
}
