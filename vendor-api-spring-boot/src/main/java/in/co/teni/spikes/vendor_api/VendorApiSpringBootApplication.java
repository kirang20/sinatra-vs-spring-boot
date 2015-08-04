package in.co.teni.spikes.vendor_api;

import in.co.teni.spikes.vendor_api.repository.VendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VendorApiSpringBootApplication {

  @Autowired
  private VendorRepository repository;

  public static void main(String[] args) {
    SpringApplication.run(VendorApiSpringBootApplication.class, args);
  }
}
