package demo;

import org.dozer.DozerConverter;
import org.joda.time.DateTime;

/**
 * Created by jiyeon on 15. 9. 6..
 */
public class DateTimeCustomConverter extends DozerConverter<DateTime, DateTime> {
    public DateTimeCustomConverter() {
        super(DateTime.class, DateTime.class);
    }

    @Override
    public DateTime convertTo(final DateTime source, final DateTime destination) {

        if (source == null) {
            return null;
        }

        return new DateTime(source);
    }

    @Override
    public DateTime convertFrom(final DateTime source, final DateTime destination) {

        if (source == null) {
            return null;
        }

        return new DateTime(source);
    }

}