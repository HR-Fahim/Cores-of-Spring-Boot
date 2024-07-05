package com.thinkconstructive.rest_demo.service;

import com.thinkconstructive.rest_demo.model.CloudVendor;
import java.util.List;

public interface CloudVendorService {
    CloudVendor createCloudVendor(CloudVendor cloudVendor);
    CloudVendor updateCloudVendor(CloudVendor cloudVendor);
    void deleteCloudVendor(String cloudVendorId);
    CloudVendor getCloudVendor(String cloudVendorId);
    List<CloudVendor> getAllCloudVendors();
}
