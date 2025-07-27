package com.research.assistant;

/**
 * Request class for research operations
 */
public class ResearchRequest {
    private String content;
    private String operation;
    
    /**
     * Default constructor
     */
    public ResearchRequest() {
    }
    
    /**
     * Constructor with parameters
     * @param content the content to process
     * @param operation the operation to perform
     */
    public ResearchRequest(String content, String operation) {
        this.content = content;
        this.operation = operation;
    }
    
    /**
     * Get the content
     * @return the content
     */
    public String getContent() {
        return content;
    }
    
    /**
     * Set the content
     * @param content the content to set
     */
    public void setContent(String content) {
        this.content = content;
    }
    
    /**
     * Get the operation
     * @return the operation
     */
    public String getOperation() {
        return operation;
    }
    
    /**
     * Set the operation
     * @param operation the operation to set
     */
    public void setOperation(String operation) {
        this.operation = operation;
    }
}