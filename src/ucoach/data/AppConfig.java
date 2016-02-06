package ucoach.data;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("data")
public class AppConfig extends ResourceConfig {

  public AppConfig () {
    packages("ucoach.data");
  }
}