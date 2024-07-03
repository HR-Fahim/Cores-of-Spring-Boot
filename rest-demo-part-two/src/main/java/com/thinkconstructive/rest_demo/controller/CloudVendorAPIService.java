package com.thinkconstructive.rest_demo.controller;
import com.thinkconstructive.rest_demo.model.CloudVendor;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {

    CloudVendor cloudVendor; // Take CloudVendor object from CloudVendor class
    
    @GetMapping("{vendorId}") // vendorID is a path variable in the URL
    public CloudVendor getCloudVendorDetails(String vendorID) {

        // return new CloudVendor("C1", "Cloud Vendor 1", "123 Main Street", "123-456-7890");
        
        return cloudVendor;

    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor Created Successfully!";
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor Updated Successfully!";
    }

    @DeleteMapping
    public String deleteCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        
        this.cloudVendor = null;
        return "Cloud Vendor Deleted Successfully!";
    }

}
