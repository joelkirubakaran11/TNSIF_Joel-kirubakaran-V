package com.placement.certificate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/certificate")
@CrossOrigin(origins = "http://localhost:4200")  // ✅ allows Angular frontend requests
public class CertificateController {

    @Autowired
    private CertificateService certificateService;

    // ✅ Get all certificates
    @GetMapping
    public List<Certificate> getAllCertificates() {
        return certificateService.getAllCertificates();
    }

    // ✅ Get certificate by ID
    @GetMapping("/{id}")
    public ResponseEntity<Certificate> getCertificateById(@PathVariable Long id) {
        Optional<Certificate> certificate = certificateService.getCertificateById(id);
        return certificate.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // ✅ Create new certificate (used for POST)
    @PostMapping
    public ResponseEntity<Certificate> createCertificate(@RequestBody Certificate certificate) {
        Certificate createdCertificate = certificateService.createCertificate(certificate);
        return ResponseEntity.ok(createdCertificate);
    }

    // ✅ Update certificate
    @PutMapping("/{id}")
    public ResponseEntity<Certificate> updateCertificate(@PathVariable Long id, @RequestBody Certificate certificateDetails) {
        Optional<Certificate> certificateOptional = certificateService.getCertificateById(id);
        if (certificateOptional.isPresent()) {
            Certificate certificate = certificateOptional.get();
            certificate.setName(certificateDetails.getName());
            certificate.setIssuer(certificateDetails.getIssuer());
            certificate.setIssueDate(certificateDetails.getIssueDate());
            certificate.setExpiryDate(certificateDetails.getExpiryDate());
            Certificate updatedCertificate = certificateService.updateCertificate(certificate);
            return ResponseEntity.ok(updatedCertificate);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // ✅ Delete certificate
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCertificate(@PathVariable Long id) {
        certificateService.deleteCertificate(id);
        return ResponseEntity.noContent().build();
    }
}
