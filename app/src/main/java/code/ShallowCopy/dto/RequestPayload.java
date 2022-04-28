package code.ShallowCopy.dto;

import java.util.List;

public class RequestPayload<T> implements Cloneable{
    public List<T> events;

    public RequestPayload(List<T> events) {
        this.events = events;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
