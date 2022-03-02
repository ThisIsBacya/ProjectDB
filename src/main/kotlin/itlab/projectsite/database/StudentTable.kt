package itlab.projectsite.database

import org.jetbrains.exposed.dao.IntEntity
import org.jetbrains.exposed.dao.id.EntityID
import org.jetbrains.exposed.dao.id.IntIdTable
import org.jetbrains.exposed.dao.EntityClass

object Students : IntIdTable() {
    val fio = reference("fio", Users)
    val group = integer("group")
    val groupType = varchar ("groupType", 15)
    val telephoneNumber = varchar("telephone Number", 30)
}

class Student(id: EntityID<Int>): IntEntity(id) {
    companion object : EntityClass<Int, Student>(Students)
    var fio by Students.fio
    var group by Students.group
    var groupType by Students.groupType
    var telephoneNumber by Students.telephoneNumber
}