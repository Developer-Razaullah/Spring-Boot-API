package com.rest.api.model;

import com.rest.api.exception.Errors;

import java.util.List;

public record TechnologyData(List<Technology> data, List<Errors> error, String message) { }
