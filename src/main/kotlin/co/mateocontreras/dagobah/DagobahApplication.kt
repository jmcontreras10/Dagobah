package co.mateocontreras.dagobah

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.runApplication
import org.springframework.data.mongodb.config.EnableMongoAuditing
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories

@SpringBootApplication
class DagobahApplication

@SuppressWarnings("SpreadOperator")
fun main(args: Array<String>) {
	(runApplication<DagobahApplication>(*args))
}
