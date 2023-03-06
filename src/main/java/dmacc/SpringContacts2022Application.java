package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Address;
import dmacc.beans.Contact;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.ContactRepository;

@SpringBootApplication //(exclude = {DataSourceAutoConfiguration.class })  //see below class
public class SpringContacts2022Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringContacts2022Application.class, args);
	}
	
	@Autowired
	ContactRepository repo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Contact c = appContext.getBean("contact", Contact.class);
		c.setRelationship("best friend");
		repo.save(c);
		
		Contact d = new Contact ("Sandra Boyton", "555-555-5557", "friend");
		Address a = new Address("123 Main Street", "Des Moines", "IA");
		d.setAddress(a);
		repo.save(d);
		
		List<Contact> allMyContacts = repo.findAll();
		for (Contact people: allMyContacts) {
			System.out.println(people.toString());
		}
		
		((AbstractApplicationContext) appContext).close();
	}
}

/*
Error starting ApplicationContext. To display the condition evaluation report re-run your application with 'debug' enabled.
[2m2023-03-04T14:59:41.157-06:00[0;39m [31mERROR[0;39m [35m18356[0;39m [2m---[0;39m [2m[           main][0;39m [36mo.s.b.d.LoggingFailureAnalysisReporter  [0;39m [2m:[0;39m 

***************************
APPLICATION FAILED TO START
***************************

Description:

Failed to configure a DataSource: 'url' attribute is not specified and no embedded datasource could be configured.

Reason: Failed to determine a suitable driver class


Action:

Consider the following:
	If you want an embedded database (H2, HSQL or Derby), please put it on the classpath.
	If you have database settings to be loaded from a particular profile you may need to activate it (no profiles are currently active).

 */
/*
 * maven-wrapper.properties
 * --Original
distributionUrl=https://repo.maven.apache.org/maven2/org/apache/maven/apache-maven/3.8.7/apache-maven-3.8.7-bin.zip
wrapperUrl=https://repo.maven.apache.org/maven2/org/apache/maven/wrapper/maven-wrapper/3.1.1/maven-wrapper-3.1.1.jar

 *---Changed to
distributionUrl=https://repo.maven.apache.org/maven2/org/apache/maven/apache-maven/3.8.2/apache-maven-3.8.2-bin.zip
wrapperUrl=https://repo.maven.apache.org/maven2/io/takari/maven-wrapper/0.5.6/maven-wrapper-0.5.6.jar
 */