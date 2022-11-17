package br.com.plandel.person.model

data class Person(
    var id: Long = 0,
    var name: String,
    var lastName: String,
    var address: String,
    var gender: String
)
