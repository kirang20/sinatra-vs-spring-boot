package in.co.teni.spikes.vendor_api.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("vendor")
public class Vendor extends User {
  protected Vendor() {
  }
}
