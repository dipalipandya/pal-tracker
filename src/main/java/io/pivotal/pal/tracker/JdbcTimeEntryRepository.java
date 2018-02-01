package io.pivotal.pal.tracker;

import java.util.List;
import javax.sql.DataSource;

/**
 * Created by e048749 on 2/1/18.
 */
public class JdbcTimeEntryRepository implements TimeEntryRepository {

    private final JdbcTemplate jdbcTemplate;

    public JdbcTimeEntryRepository(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public TimeEntry find(long l) {
        return null;
    }

    @Override
    public TimeEntry update(long eq, TimeEntry any) {
        return null;
    }

    @Override
    public TimeEntry delete(long l) {
        return null;
    }

    @Override
    public List<TimeEntry> list() {
        return null;
    }

    @Override
    public TimeEntry create(TimeEntry any) {
        return null;
    }
}
