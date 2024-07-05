package com.thinkconstructive.rest_demo.controller;

import com.thinkconstructive.rest_demo.model.CloudVendor;
import com.thinkconstructive.rest_demo.service.CloudVendorService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {

    @Autowired
    private CloudVendorService cloudVendorService;

    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(@PathVariable("vendorId") String vendorId) {
        return cloudVendorService.getCloudVendor(vendorId);
    }

    @GetMapping
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

    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(@PathVariable("vendorId") String vendorId) {
        cloudVendorService.deleteCloudVendor(vendorId);
        return "Cloud Vendor Deleted Successfully!";
    }
}
