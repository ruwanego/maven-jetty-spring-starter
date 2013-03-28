package com.zuyezheng.starter;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.util.resource.ResourceCollection;
import org.eclipse.jetty.webapp.WebAppContext;

/**
 * 
 * Entry point of the app, will initialize and start a Jetty server which will in turn
 * load up the spring contexts.
 * 
 * @author zuyezheng
 *
 */
public class AppStarter {
	
	public static final int PORT = 8080;
	public static final String ROOT_DIR = "./src/main/webapp";
	
	public static void main (String[] args) throws Exception {
		//create a new server
	    Server server = new Server(PORT);
	    
	    //configure and start it
        server.setHandler(createWebAppContext(ROOT_DIR));
        server.start();
        server.join();
    }
	
    private static WebAppContext createWebAppContext(String rootDir) {
        WebAppContext context = new WebAppContext();
        context.setContextPath("/");
        context.setBaseResource(new ResourceCollection(new String[]{rootDir}));
        return context;
    }

}
