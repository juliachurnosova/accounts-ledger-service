package com.harrypotter.accountsledgerservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class AccountsLedgerServiceApplication

fun main(args: Array<String>) {
	runApplication<AccountsLedgerServiceApplication>(*args)
}

@RestController
class MessageController {

	@GetMapping("/")
	fun greeting(): GreetingMessage = GreetingMessage("Hi, I'm Harry! I'm here to help you track your expenses!")

	data class GreetingMessage(
		val message: String

	)
}
