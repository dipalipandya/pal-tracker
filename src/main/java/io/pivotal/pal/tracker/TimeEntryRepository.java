package io.pivotal.pal.tracker;

import java.util.List;

/**
 * Created by e048749 on 1/31/18.
 */
public interface TimeEntryRepository {
    public TimeEntry find(long l) ;

    public TimeEntry update(long eq, TimeEntry any) ;

    public TimeEntry delete(long l);

    public List<TimeEntry> list();

    public TimeEntry create(TimeEntry any) ;
}

