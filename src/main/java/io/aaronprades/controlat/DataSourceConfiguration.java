//package io.aaronprades.controlat;
//
//import java.sql.SQLException;
//
//import javax.sql.DataSource;
//import javax.validation.constraints.NotNull;
//
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import lombok.Data;
//import oracle.jdbc.pool.OracleDataSource;
 
//@Data
//@Configuration
//@ConfigurationProperties("oracle")
//public class DataSourceConfiguration {
//	
//    @NotNull
//    private String username;
// 
//    @NotNull
//    private String password;
// 
//    @NotNull
//    private String url;
// 
//    @Bean
//    DataSource dataSource() throws SQLException {
//        OracleDataSource dataSource = new OracleDataSource();
//        dataSource.setUser(username);
//        dataSource.setPassword(password);
//        dataSource.setURL(url);
//        dataSource.setImplicitCachingEnabled(true);
//        dataSource.setFastConnectionFailoverEnabled(true);
//        return dataSource;
//    }
//}