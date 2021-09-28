package exercises.technology;

import java.util.ArrayList;
import java.util.UUID;

abstract class AbstractEntity {
    private static java.util.UUID id;
    private static java.util.UUID Id;
    private static final java.util.UUID UUID = Id;
    private ArrayList<String> idList = new ArrayList<String>();

    public String getNewId() {
        String newId = "";
        while (newId == "") {
            newId = UUID.randomUUID().toString();

            // if doesn't exist already , add to list, else empty String
            if (!idList.contains(newId)) {
                idList.add(newId);
                break;
            }
            else
                newId = "";
        }
        return newId;
    }
}
