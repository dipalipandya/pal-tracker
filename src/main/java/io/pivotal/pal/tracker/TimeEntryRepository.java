package io.pivotal.pal.tracker;

import java.util.List;

/**
 * Created by e048749 on 1/31/18.
 */
public interface TimeEntryRepository {
    public TimeEntry find(Long l);

    public TimeEntry update(Long eq, TimeEntry any);

    public void delete(Long l);

    public List<TimeEntry> list();

    public TimeEntry create(TimeEntry any);
}

