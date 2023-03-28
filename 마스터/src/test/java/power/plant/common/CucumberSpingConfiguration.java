package power.plant.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import power.plant.마스터Application;

@CucumberContextConfiguration
@SpringBootTest(classes = { 마스터Application.class })
public class CucumberSpingConfiguration {}
