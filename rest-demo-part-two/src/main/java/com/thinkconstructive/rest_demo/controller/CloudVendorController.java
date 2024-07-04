package com.thinkconstructive.rest_demo.controller;
import com.thinkconstructive.rest_demo.model.CloudVendor;

import com.thinkconstructive.rest_demo.service.CloudVendorService;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {

    CloudVendorService cloudVendorService;
    
    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }
    
    // Read Specific Cloud Vendor Details
    @GetMapping("{vendorId}") // vendorID is a path variable in the URL
    public CloudVendor getCloudVendorDetails(@PathVariable("vendorId") String vendorId) {

        // return new CloudVendor("C1", "Cloud Vendor 1", "123 Main Street", "123-456-7890");
        
        return cloudVendorService.getCloudVendor(vendorId);

    }

    // Read All Cloud Vendor Details  DB
    @GetMapping() // vendorID is a path variable in the URL
    public List<CloudVendor> getAllCloudVendorDetails() {

        return cloudVendorService.getAllCloudVendors();

    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        
        cloudVendorService.createCloudVendor(cloudVendor);
        return "Cloud Vendor Created Successfully!";
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        
        cloudVendorService.updateCloudVendor(cloudVendor);
        return "Cloud Vendor Updated Successfully!";
    }

    @DeleteMapping("{vendorId}") // vendorID is a path variable in the URL
    public String deleteCloudVendorDetails(@PathVariable("vendorId") String vendorId) {
        
        cloudVendorService.deleteCloudVendor(vendorId);
        return "Cloud Vendor Deleted Successfully!";
    }

}
