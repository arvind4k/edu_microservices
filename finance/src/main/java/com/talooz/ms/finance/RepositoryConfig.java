package com.talooz.ms.finance;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

import com.talooz.ms.finance.common.entity.PaymentFrequency;
import com.talooz.ms.finance.discount.entity.Discount;
import com.talooz.ms.finance.discount.entity.DiscountCategory;
import com.talooz.ms.finance.fee.entity.FeeParticular;
import com.talooz.ms.finance.fee.entity.Fine;
import com.talooz.ms.finance.fee.entity.FineSlab;

@Configuration
public class RepositoryConfig extends RepositoryRestConfigurerAdapter {
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
    	config.exposeIdsFor(FeeParticular.class);
    	config.exposeIdsFor(DiscountCategory.class);
    	config.exposeIdsFor(Discount.class);
    	config.exposeIdsFor(PaymentFrequency.class);
    	config.exposeIdsFor(Fine.class);
    	config.exposeIdsFor(FineSlab.class);
    }
}