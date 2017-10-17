package com.guoMgr.common.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;

@ConditionalOnProperty(prefix = "guoMgr", name = "spring-session-open", havingValue = "true")
public class SpringSessionConfig {

}
