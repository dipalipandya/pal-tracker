package io.pivotal.pal.tracker;

import io.pivotal.pal.tracker.TimeEntry;

import java.sql.Time;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by e048749 on 1/31/18.
 */
public class InMemoryTimeEntryRepository implements TimeEntryRepository {


    Map<Long, TimeEntry> timeEntryMap = new HashMap<Long, TimeEntry>();

    @Override
    public TimeEntry find(long l) {
        return timeEntryMap.get(l);
    }

    @Override
    public TimeEntry update(long id, TimeEntry timeEntry) {
        timeEntryMap.replace(id, timeEntry);
        timeEntry.setId(id);
        return timeEntry;
    }

    @Override
    public TimeEntry delete(long id) {

        TimeEntry timeEntry = timeEntryMap.get(id);
        timeEntryMap.remove(id);
        return timeEntry;
    }

    @Override
    public List<TimeEntry> list() {
        return new ArrayList<>(timeEntryMap.values());
    }

    @Override
    public TimeEntry create(TimeEntry timeEntry) {
        timeEntry.setId(timeEntryMap.size() + 1);
        timeEntryMap.put(timeEntry.getId(), timeEntry);
        return timeEntry;
    }
}
