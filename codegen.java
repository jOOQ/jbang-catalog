///usr/bin/env jbang "$0" "$@" ; exit $?
//DEPS org.jooq:jooq-codegen:${jooq.version:[3.14.11,)}
//DEPS org.jooq:jooq-meta-extensions:${jooq.version:[3.14.11,)}

import static java.lang.System.*;

public class codegen {

    public static void main(String... args) throws Exception {
        org.jooq.codegen.GenerationTool.main(args);
    }
}
