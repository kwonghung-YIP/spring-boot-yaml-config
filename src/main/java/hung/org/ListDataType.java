package hung.org;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
@ConfigurationProperties(prefix="list-values",ignoreUnknownFields=false)
public class ListDataType {

	//@Value("${list-values.sample-1}")
	@Setter
	private List<String> sample1;

	@Setter
	private List<String> sample2;
	
	@Setter
	private List<String> sample3;
	
	@Setter
	private List<String> sample4;
	
	@PostConstruct
	void printPropertyValue() {
		log.info("{}",sample1);
		log.info("{}",sample2);
	}
}
