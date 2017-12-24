package com.talooz.ms.profiles;

//import com.talooz.ms.profiles.entity.*;
import com.talooz.ms.profiles.entity.Eorg;
import com.talooz.ms.profiles.entity.User;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

@Configuration
public class RepositoryConfig extends RepositoryRestConfigurerAdapter {
	@Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		config.exposeIdsFor(Eorg.class);
		config.exposeIdsFor(User.class);
	}

}


