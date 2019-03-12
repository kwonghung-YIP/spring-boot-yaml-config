# spring-boot-yaml-config
A demo to load properties from yaml config file into spring different data type

Spring boot allows to externalize properties, but for the password properties such as "spring.database.password", you properly don't want to save in application.yaml in plain text

This demo shows the easy way, for spring boot to load the password property from docker secret, instead of hard code it in a yaml or properties file. The idea is to load the password stored in docker secert as the properties, then other properties such as "spring.datasource.password" can refer to it.



