package power.plant.domain;

import power.plant.domain.입찰됨;
import power.plant.입찰Application;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;
import org.springframework.context.ApplicationContext;

@Entity
@Table(name="입찰_table")
@Data

public class 입찰  {


    
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

        입찰됨 입찰됨 = new 입찰됨(this);
        입찰됨.publishAfterCommit();


    
    }



    public static 입찰Repository repository(){
        입찰Repository 입찰Repository = applicationContext().getBean(입찰Repository.class);
        return 입찰Repository;
    }

    public static ApplicationContext applicationContext(){        
        return 입찰Application.applicationContext;
    }






}
