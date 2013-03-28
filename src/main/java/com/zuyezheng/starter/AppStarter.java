package com.zuyezheng.starter;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.util.resource.ResourceCollection;
import org.eclipse.jetty.webapp.WebAppContext;

public class AppStarter {
	
	public static void main (String[] args) throws Exception {
	    Server server = new Server(8080);

        server.setHandler(createWebAppContext());

        server.start();
        server.join();
    }

    private static WebAppContext createWebAppContext() {
        WebAppContext context = new WebAppContext();
        context.setContextPath("/");
        context.setBaseResource(new ResourceCollection(new String[] { "./src/main/webapp" }));
        return context;
    }

}
