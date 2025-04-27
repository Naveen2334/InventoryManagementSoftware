package com.naveen.InventoryMangementSoftware.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {

	/**
	 * Configures and provides a ModelMapper bean.
	 * 
	 * - Enables field matching, allowing ModelMapper to map fields directly without
	 * getters/setters. - Sets field access level to PRIVATE so that private fields
	 * can be mapped.
	 * 
	 * @return a configured ModelMapper instance
	 */

	@Bean
	public ModelMapper modelMapper() {
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setFieldMatchingEnabled(true)
				.setFieldAccessLevel(org.modelmapper.config.Configuration.AccessLevel.PRIVATE);

		return modelMapper;

	}

}
