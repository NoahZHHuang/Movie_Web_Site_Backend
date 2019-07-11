package com.noah;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletContainer;

public class JettyServer {

    private Server server;

    public void start() throws Exception {
        ResourceConfig config = new ResourceConfig();
        config.packages("com.noah.restful");
        ServletHolder servletHolder = new ServletHolder(new ServletContainer(config));
        server = new Server(8080);
        ServletContextHandler contextHandler = new ServletContextHandler(server, "/");
        contextHandler.addServlet(servletHolder, "/*");
        server.start();
        System.out.println("Jetty server start, link: http://localhost:8080/index");
    }

    public void stop() throws Exception {
        if (server != null) {
            server.stop();
        }
    }

    public static void main(String[] args) throws Exception {
        JettyServer jettyServer = new JettyServer();
        jettyServer.start();
        Runtime.getRuntime().addShutdownHook(new Thread(
                () -> {
                    try{
                        jettyServer.stop();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
        ));
    }

}
