package com.mycompany;

import org.apache.wicket.protocol.http.WicketFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

@WebFilter(value = "/*", initParams = {
        @WebInitParam(name = "applicationClassName", value = "com.mycompany.WicketApplication") })
public class AppWebFilter extends WicketFilter {

}
