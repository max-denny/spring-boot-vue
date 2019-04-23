package com.persona.springbootvue;

import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.stereotype.Component;

@Component
public class RestRepositoryConfigurator implements RepositoryRestConfigurer {
    
    // @Override
    public void RepositoryRestConfiguration(RepositoryRestConfiguration config){
        config.exposeIdsFor(Todo.class);
    }
}