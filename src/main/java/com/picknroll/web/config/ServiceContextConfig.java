package com.picknroll.web.config;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

@ComponentScan(basePackages={"com.picknroll.web.dao.mybatis","com.picknroll.web.service.mybatis"})
@Configuration
public class ServiceContextConfig {
	
	// 1. 데이터소스 객체 만들기
	@Bean
	public BasicDataSource basicDataSource() {

		BasicDataSource basicDataSource = new BasicDataSource();

		// db 연결 설정
		
		/*mssqlserver*/
/*		basicDataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		basicDataSource.setUrl("jdbc:sqlserver://211.238.142.251:1433;databaseName=lecture");
		basicDataSource.setUsername("sist");
		basicDataSource.setPassword("dclass");*/
		
		
        /*mysql*/
/*      basicDataSource.setDriverClassName("com.mysql.jdbc.Driver");
		basicDataSource.setUrl("jdbc:mysql://localhost/picknrolldb?autoReconnect=true&useSSL=false&useUnicode=true&characterEncoding=utf8");
        basicDataSource.setUsername("hong");
        basicDataSource.setPassword("1234");*/
        
        /*mariadb*/
        basicDataSource.setDriverClassName("org.mariadb.jdbc.Driver");
		basicDataSource.setUrl("jdbc:mariadb://picknroll.gonetis.com:3306/picknrolldb?autoReconnect=true&useSSL=false&useUnicode=true&characterEncoding=utf8");
        basicDataSource.setUsername("pi");
        basicDataSource.setPassword("magnetic0611");

        
		// 커넥션풀 설정
		basicDataSource.setRemoveAbandoned(true);
		basicDataSource.setInitialSize(20);
		basicDataSource.setMaxActive(30);
		return basicDataSource;
	}
	
	@Bean
	public SqlSessionFactory sqlSessionFactoryBean(BasicDataSource basicDataSource) throws Exception {
		
		// 매개변수에 IoC 컨테이너에 있는 basicDataSource가 참조된다.
		SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
		sqlSessionFactory.setDataSource(basicDataSource);
		sqlSessionFactory.setMapperLocations(
				 new PathMatchingResourcePatternResolver()
				.getResources("classpath:com/picknroll/web/dao/mybatis/mapper/*.xml")
		);
		return sqlSessionFactory.getObject();
	}
	
	
	//위에서 만든 SqlSesstionFactory를 IoC 컨테이너에서 찾아 매개변수에 자동으로 넣어주고 
	// SqlSesstionTemplate객체를 반환하자, 매개변수에 위에서 설정한 팩토리
	@Bean
	public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
		return new SqlSessionTemplate(sqlSessionFactory);
	}

}
