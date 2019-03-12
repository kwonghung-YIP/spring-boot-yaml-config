# spring-boot-yaml-config
A demo to load properties from yaml config file into spring different data type

Spring boot allows to externalize properties, but for the password properties such as "spring.database.password", you properly don't want to save in application.yaml in plain text

This demo shows the easy way, for spring boot to load the password property from docker secret, instead of hard code it in a yaml or properties file. I use the EnvironmentPostProcessor, which mentioned in the encrypted property section in spring boot reference. The password stored in docker secret mounted file are loaded
