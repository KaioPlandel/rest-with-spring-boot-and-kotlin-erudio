package br.com.plandel.math

import org.apache.tomcat.util.http.parser.HttpParser.isNumeric
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MathController {

    @RequestMapping(value = ["/sum/{numberOne}/{numberTwo}"])
    fun sum(
        @PathVariable(value = "numberOne") numberOne: String?,
        @PathVariable(value = "numberTwo") numberTwo: String?,
    ): Double {
        return convertToDouble(numberOne) + convertToDouble(numberTwo)
    }


    private fun convertToDouble(stringNumber: String?): Double {
        if (stringNumber.isNullOrBlank()) return 0.0
        val number = stringNumber.replace(",".toRegex(), ".")
        return number.toDouble()
    }
}