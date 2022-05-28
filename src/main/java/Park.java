import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Park {
    public class Attraction {
        private String name;
        private String openTime;
        private String closeTime;
        private int cost;
    }
}
