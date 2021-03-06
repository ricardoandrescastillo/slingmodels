package com.training.aem.core.models;

import com.google.gson.Gson;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import org.apache.sling.api.resource.Resource;
import javax.inject.Inject;
import javax.inject.Named;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ModelTraining {

    @Inject
    @Named("generic")
    private Generic genericData;

    @Inject
    private Error error;

    private Gson gson = new Gson();

    public String getGenericJson(){
        return gson.toJson(genericData);
    }

    public String getErrorJson(){
        return gson.toJson(error);
    }

}
