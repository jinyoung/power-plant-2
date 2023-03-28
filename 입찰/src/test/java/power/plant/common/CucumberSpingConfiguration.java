package power.plant.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import power.plant.입찰Application;

@CucumberContextConfiguration
@SpringBootTest(classes = { 입찰Application.class })
public class CucumberSpingConfiguration {}
