package pt.digitalnext.incm.monitoring;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.metrics.MeterRegistryCustomizer;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import io.micrometer.core.instrument.MeterRegistry;

@SpringBootApplication
public class MonitoringApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(MonitoringApplication.class, args);
		
		String[] beanNames = ctx.getBeanDefinitionNames();
        
        Arrays.sort(beanNames);
         
        for (String beanName : beanNames) 
        {
            System.out.println(beanName);
        }
	}
	
	@Bean
	MeterRegistryCustomizer<MeterRegistry> metricsCommonTags() {
	  return registry -> registry.config().commonTags("application", "Monitoring");
	}

}
