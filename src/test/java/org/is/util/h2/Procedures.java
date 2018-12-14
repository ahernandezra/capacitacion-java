package org.is.util.h2;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.h2.tools.SimpleResultSet;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

@Slf4j
@NoArgsConstructor
public class Procedures {

    public static ResultSet simpleResultSet() throws SQLException, InterruptedException {
        log.info("ejecutando procedimiento...");
        log.info("5 secs...");

        SimpleResultSet rs = new SimpleResultSet();
        rs.addColumn("ID", Types.INTEGER, 10, 0);
        rs.addColumn("NAME", Types.VARCHAR, 255, 0);
        rs.addRow(0, "Hello");
        rs.addRow(0, "World");

        Thread.currentThread().sleep(5000);

        log.info(">procedimiento ejecutado");
        return rs;
    }

}
