package netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {
    private int currentStation;
    final int minStationNumber = 0;
    final int maxStationNumber = 10;
    final int minSound = 0;
    final int maxSound = 100;
    private int currentSound;
}

