package hung.org;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class StringValues {

	@Value("${string-values.no-quote}")
	private String simpleValue;
	
	@Value("${string-values.single-quote}")
	private String singleQuote;
	
	@Value("${string-values.double-quote}")
	private String doubleQuote;
	
	@Value("${string-values.literal-block-scalar}")
	private String literalBlock;
	
	@Value("${string-values.folded-block-scalar}")
	private String foldedBlock;
	
	@PostConstruct
	public void printValues() {
		System.out.println(simpleValue);
		System.out.println(singleQuote);
		System.out.println(doubleQuote);
		System.out.println(literalBlock+".");
		System.out.println(foldedBlock+".");
	}
}
