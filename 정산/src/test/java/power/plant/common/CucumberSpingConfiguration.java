package power.plant.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import power.plant.정산Application;

@CucumberContextConfiguration
@SpringBootTest(classes = { 정산Application.class })
public class CucumberSpingConfiguration {}
