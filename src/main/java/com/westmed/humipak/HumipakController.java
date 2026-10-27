package com.westmed.humipak;

import jakarta.validation.Valid;
import java.util.Map;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HumipakController {

    private static final Logger log = LoggerFactory.getLogger(HumipakController.class);
    private final ContentService content;

    public HumipakController(ContentService content) {
        this.content = content;
    }

    @GetMapping("/humipak")
    public HumipakContent page() {
        return content.getContent();
    }

    @PostMapping("/sample-requests")
    public ResponseEntity<Map<String, String>> requestSample(@Valid @RequestBody SampleRequest req) {
        // TODO: persist (JPA) and/or email sales@westmed.co.uk (spring-boot-starter-mail)
        String ref = UUID.randomUUID().toString().substring(0, 8);
        log.info("Sample request {} from {} <{}> ({})", ref, req.name(), req.email(), req.organisation());
        return ResponseEntity.status(HttpStatus.CREATED).body(Map.of("reference", ref));
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, String>> invalid(MethodArgumentNotValidException ex) {
        var errors = new java.util.LinkedHashMap<String, String>();
        ex.getBindingResult().getFieldErrors().forEach(e -> errors.put(e.getField(), e.getDefaultMessage()));
        return ResponseEntity.badRequest().body(errors);
    }
}
