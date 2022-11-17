package br.com.plandel.person

import br.com.plandel.person.model.Person
import org.springframework.stereotype.Service
import java.util.concurrent.atomic.AtomicLong
import java.util.logging.Logger

@Service
class PersonService {

    private val counter: AtomicLong = AtomicLong()
    private val logger = Logger.getLogger(PersonService::class.java.name)

    fun getPerson(id: Long): Person {

        logger.info("Finding one Person!")
        return Person(
            id = counter.incrementAndGet(),
            name = "Kaio",
            lastName = "Plandel",
            address = "Address 23 GH",
            gender = "Male"
        )
    }
}