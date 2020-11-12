package com.training.aem.core.models;

import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import org.apache.sling.api.resource.Resource;
import javax.inject.Inject;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Generic {

    @Inject
    private String title;

    @Inject
    private String field;

    @Inject
    private String session;

    @Inject
    private String go;


}
