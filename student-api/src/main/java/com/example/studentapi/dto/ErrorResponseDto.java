package com.example.studentapi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public record ErrorResponseDto(
        @JsonProperty("errorCode")
        String errorCode,
        @JsonProperty("errorMessage")
        String errorMessage,
        @JsonProperty("details")
        Map<String, String> details
) {
    public ErrorResponseDto(String errorCode, String errorMessage) {
        this(errorCode, errorMessage, null);
    }
}