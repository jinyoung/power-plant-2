package power.plant.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import power.plant.계량Application;

@CucumberContextConfiguration
@SpringBootTest(classes = { 계량Application.class })
public class CucumberSpingConfiguration {}
