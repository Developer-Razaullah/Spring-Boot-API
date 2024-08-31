package com.rest.api.service.serviceimpl;

import com.rest.api.exception.Errors;
import com.rest.api.model.Technology;
import com.rest.api.model.TechnologyData;
import com.rest.api.service.TechnologyService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TechnologyServiceImpl implements TechnologyService {

    @Override
    public TechnologyData getTechnology() {
         return new TechnologyData(getData(), List.of(new Errors()),"");
    }

    private static List<Technology> getData() {
        return List.of(new Technology(1, "C"), new Technology(2, "C++"),
                new Technology(3, "Java"), new Technology(4, "C#"),
                new Technology(4, "Python"), new Technology(5, "JavaScript"));
    }
}
