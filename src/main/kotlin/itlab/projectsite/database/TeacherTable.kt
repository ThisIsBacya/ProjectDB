package itlab.projectsite.database
import org.jetbrains.exposed.dao.EntityClass
import org.jetbrains.exposed.dao.IntEntity
import org.jetbrains.exposed.dao.id.EntityID
import org.jetbrains.exposed.dao.id.IntIdTable

object Teachers : IntIdTable() {
    val fio = reference("fio", Users)
    val academicDegree = varchar ("academic degree", 20)
    val yearsOfWork = integer("experience")
    val predmetsList = varchar("predmetsLists", 100)
}

class Teacher(id: EntityID<Int>) : IntEntity(id) {
    companion object : EntityClass<Int, Teacher>(Teachers)
    var fio by Teachers.fio
    var academicDegree by Teachers.academicDegree
    var yearsOfWork by Teachers.yearsOfWork
    var predmetsList by Teachers.predmetsList

}

