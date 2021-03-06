///usr/bin/env jbang "$0" "$@" ; exit $?
//DEPS org.jooq.pro-java-8:jooq:${jooq.version:LATEST}

import static java.lang.System.*;

public class diffprojava8 {

    public static void main(String... args) throws Exception {
        if (System.getProperty("java.util.logging.SimpleFormatter.format") == null)
            System.setProperty("java.util.logging.SimpleFormatter.format", "%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS %4$s %2$s %5$s%6$s%n");

        org.jooq.DiffCLI.main(args);
    }
}
