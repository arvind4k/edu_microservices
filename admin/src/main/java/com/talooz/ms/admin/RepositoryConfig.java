package com.talooz.ms.admin;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

import com.talooz.ms.admin.entity.Batch;
import com.talooz.ms.admin.entity.Transport;
import com.talooz.ms.admin.entity.TransportParticulars;

@Configuration
public class RepositoryConfig extends RepositoryRestConfigurerAdapter {
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(Batch.class);
		config.exposeIdsFor(Transport.class);
		config.exposeIdsFor(TransportParticulars.class);
    }
}