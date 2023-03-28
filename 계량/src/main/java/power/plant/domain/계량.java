package power.plant.domain;

import power.plant.domain.PowerGenerated;
import power.plant.계량Application;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;
import org.springframework.context.ApplicationContext;

@Entity
@Table(name="계량_table")
@Data

public class 계량  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    private String id;    
    
    
    
    private String subscriberId;    
    
    
    
    private String plantId;    
    
    
    
    private Double generatedAmount;    
    
    
    
    private String generatorType;

    @PostPersist
    public void onPostPersist(){
       
        */

        PowerGenerated powerGenerated = new PowerGenerated(this);
        powerGenerated.publishAfterCommit();


    
    }



    public static 계량Repository repository(){
        계량Repository 계량Repository = applicationContext().getBean(계량Repository.class);
        return 계량Repository;
    }

    public static ApplicationContext applicationContext(){        
        return 계량Application.applicationContext;
    }






}
