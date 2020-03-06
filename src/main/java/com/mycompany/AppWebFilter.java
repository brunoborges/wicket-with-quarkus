package com.mycompany;

import org.apache.wicket.protocol.http.WicketFilter;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

@WebFilter(value = "/*", initParams = {
                @WebInitParam(name = "applicationClassName", value = "com.mycompany.WicketApplication"),
                @WebInitParam(name = "filterMappingUrlPattern", value = "/*") })
public class AppWebFilter extends WicketFilter {

}
