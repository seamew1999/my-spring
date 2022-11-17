package event;

import com.seamew.springframework.context.event.ApplicationContextEvent;
import lombok.Data;

/**
 * @Author: seamew
 * @Title: CustomEvent
 * @CreateTime: 2022年11月16日 19:07:00
 * @Description:
 * @Version: 1.0
 */
public class CustomEvent extends ApplicationContextEvent {

    private long id;

    private String message;


    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public CustomEvent(Object source, Long id, String message) {
        super(source);
        this.id = id;
        this.message = message;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
