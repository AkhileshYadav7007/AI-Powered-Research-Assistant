package com.research.assistant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/research")
@CrossOrigin(origins = "*")
public class ResearchController {
    private final ResearchService researchService;

    @Autowired
    public ResearchController(ResearchService researchService) {
        this.researchService = researchService;
    }

    /**
     * Process the content based on the request
     * @param request the research request
     * @return the processed content
     */
    @PostMapping("/process")
    public ResponseEntity<String> processContent(@RequestBody ResearchRequest request) {
        // Validate the request
        if (request == null) {
            return ResponseEntity.badRequest().body("Request cannot be null");
        }
        
        // Process the content
        String result = researchService.processContent(request);
        
        // Return the result
        return ResponseEntity.ok(result);
    }
}
