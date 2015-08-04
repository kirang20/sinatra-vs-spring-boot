package in.co.teni.spikes.vendor_api.controller;

import in.co.teni.spikes.vendor_api.domain.Vendor;
import in.co.teni.spikes.vendor_api.repository.VendorRepository;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class VendorController {
  @Autowired
  private VendorRepository vendorRepository;
  private Log log = LogFactory.getLog(VendorController.class);

  @RequestMapping(value = "/vendor", method = RequestMethod.GET)
  @ResponseBody
  @Transactional(readOnly = true)
  public Page<Vendor> all() {
    return vendorRepository.findAll(null);
  }

  @RequestMapping(value = "/vendor", method = RequestMethod.POST, headers = {"Accept=application/json"})
  @ResponseBody
  @Transactional(readOnly = false)
  public Vendor create(@RequestBody Vendor vendor) {
    log.info("Vendor: " + vendor);
    return vendorRepository.save(vendor);
  }
}
