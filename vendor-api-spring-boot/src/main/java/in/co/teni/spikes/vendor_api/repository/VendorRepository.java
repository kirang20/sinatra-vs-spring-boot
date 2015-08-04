package in.co.teni.spikes.vendor_api.repository;

import in.co.teni.spikes.vendor_api.domain.Vendor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

public interface VendorRepository extends Repository<Vendor, Integer> {
  Page<Vendor> findAll(Pageable pageable);

  Vendor save(Vendor vendor);
}
