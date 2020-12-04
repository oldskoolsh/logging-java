package sh.oldskool.java.logging;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.pattern.color.ForegroundCompositeConverterBase;

import static ch.qos.logback.core.pattern.color.ANSIConstants.*;

public class DecentHighlighter extends ForegroundCompositeConverterBase<ILoggingEvent> {

    @Override
    protected String getForegroundColorCode(ILoggingEvent event) {
        Level level = event.getLevel();
        switch (level.toInt()) {
            case Level.TRACE_INT:
                return BOLD + WHITE_FG;
            case Level.ERROR_INT:
                return BOLD + RED_FG;
            case Level.WARN_INT:
                return BOLD + YELLOW_FG;
            case Level.INFO_INT:
                return BOLD + GREEN_FG;
            case Level.DEBUG_INT:
                return GREEN_FG;
            default:
                return WHITE_FG;
        }

    }
}
