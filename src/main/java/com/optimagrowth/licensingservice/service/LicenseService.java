package com.optimagrowth.licensingservice.service;

import com.optimagrowth.licensingservice.model.License;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.SplittableRandom;

/*
 * @author Khan Hafizur Rahman
 * @since 1/11/21
 */
@Service
public class LicenseService {
    public License getLicense(String licenseId, String organizationId) {
        License license = License.builder().build();
        license.setId(new Random().nextInt(1000));
        license.setLicenseId(licenseId);
        license.setOrganizatonId(organizationId);
        license.setDescription("Software Product");
        license.setProductName("Ostock");
        license.setLicenseType("full");

        return license;
    }

    public String createLicense(License license, String organizationId){
        String responseMessage = null;
        if (license != null){
            license.setOrganizatonId(organizationId);
            responseMessage = String.format("This is the post and the object is: %s", license.toString());
        }

        return responseMessage;
    }

    public String updateLicense(License license, String organizationId){
        String responseMessage = null;
        if (license != null){
            license.setOrganizatonId(organizationId);
            responseMessage = String.format("This is the put and the object is: %s", license.toString());
        }

        return responseMessage;
    }

    public String deleteLicense(String licenseId, String organizationId){
        String responseMessage = String.format("Deleting license with id %s for the organization %s", licenseId, organizationId);
        return responseMessage;
    }
}
