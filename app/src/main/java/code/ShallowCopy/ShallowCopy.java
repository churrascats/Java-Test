package code.ShallowCopy;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

import code.ShallowCopy.dto.RequestPayload;

public class ShallowCopy {

    public static void test() {

        Double maxNumberOfEvents = 4.0;
        List<String> dataList = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14",
                "15", "16", "17", "18");

        List<RequestPayload> eventBatchList = new ArrayList<>();
        List<String> eventBatch = new ArrayList<>();
        Double eventBatchCount = dataList.size() / maxNumberOfEvents;

        int index = 0;

        for (String data : dataList) {
            eventBatch.add(data);

            RequestPayload requestPayload = new RequestPayload(eventBatch);

            if (eventBatchCount >= 1) {
                if (eventBatch.size() >= maxNumberOfEvents) {

                    eventBatchList.add(requestPayload);

                    eventBatch = new ArrayList<>();
                    eventBatchCount -= 1;
                }
            } else {
                if (index == dataList.size() - 1) {
                    eventBatchList.add(requestPayload);
                }
            }

            index++;
        }

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(Paths.get("data.json").toFile(), eventBatchList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
