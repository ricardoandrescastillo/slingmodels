package com.training.aem.core.models;


import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import org.apache.sling.api.resource.Resource;
import javax.inject.Inject;
import java.util.List;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Error {

    @Inject
    private String title;

    @Inject
    private List<StatusText> statusText;


}
