package code.ShallowCopy.dto;

import java.util.List;

public class RequestPayload<T> {
    public List<T> events;

    public RequestPayload(List<T> events) {
        this.events = events;
    }


}
