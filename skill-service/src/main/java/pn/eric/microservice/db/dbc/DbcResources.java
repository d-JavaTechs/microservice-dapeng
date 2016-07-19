package pn.eric.microservice.db.dbc;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * Created by Eric  on 16-02-18.
 */
@Service
public class DbcResources {

    public static DataSource testDbDataSorce;

    @Resource(name = "testDb_dataSource")
    public void setProductDbDataSorce(DataSource dataSource) {
        DbcResources.testDbDataSorce = dataSource;
    }

}
