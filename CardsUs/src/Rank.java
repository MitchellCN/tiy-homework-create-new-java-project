import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by cmitchell on 3/22/17.
 */
public enum Rank {


    TWO (2, FALSE),
    THREE,(3, FALSE),
    FOUR,(4, FALSE),
    FIVE, (5, FALSE),
    SIX, (6, FALSE),
    SEVEN,(7, FALSE),
    EIGHT,(8, FALSE),
    NINE, (9, FALSE),
    TEN, (10, FALSE),
    JACK, (11, TRUE),
    QUEEN, (12, TRUE),
    KING, (13, TRUE),
    ACE; (14, TRUE),

}
