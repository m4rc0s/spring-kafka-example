package org.naturalworks.accountancy

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AccountancyApplication

fun main(args: Array<String>) {
	runApplication<AccountancyApplication>(*args)
}
