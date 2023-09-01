package com.messenger.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.messenger")
@ComponentScan(basePackages = {"com.messenger.proxy", "com.messenger.repository", "com.messenger.service"})
// we do not add comment because it does not have dependency and dose not dependency itself. POJOs do not have component
public class ProjectConfig {
}
