package power.plant.external;

import org.springframework.stereotype.Service;

@Service
public class 정산ServiceImpl implements 정산Service {

    /**
     * Fallback
     */
    public 정산 get정산(Long id) {
        정산 정산 = new 정산();
        return 정산;
    }
}
