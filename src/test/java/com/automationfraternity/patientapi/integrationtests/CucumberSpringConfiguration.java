package com.automationfraternity.patientapi.integrationtests;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * This class was mentioned in the Cucumber Error earlier i.e. a class with annotation
 * as @SpringBootTest or other TestSliced Annotation like @WebMvcTest.
 * Read more on TestSliced Annotations here: https://rieckpil.de/spring-boot-test-slices-overview-and-usage/
 * For our BDD Integration Tests we would need the full Spring Boot Context because we are going to be testing the whole app and would like to validate its behaviour.
 * And there fore we will be using the @SpringBootTest.
 * This annotation brings the whole spring boot context and there by the full app is available for tests.
 * @CucumberContextConfiguration comes from Cucumber Library and it tells cumumber to do any under the hood wiring
 * These annotations tell cucumber to bring the Spring Application Context up before the test starts.
 * @ContextConfiguration -- This is an alternative to @SpringBootTest. This is to be used if you are simply using Spring MVC features and not the Spring Boot. But we will not this one.
 */
@SpringBootTest
@CucumberContextConfiguration
@AutoConfigureMockMvc
public class CucumberSpringConfiguration {
}
