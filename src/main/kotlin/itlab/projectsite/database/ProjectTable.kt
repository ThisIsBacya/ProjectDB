package itlab.projectsite.database

import org.jetbrains.exposed.dao.id.IntIdTable

object Project : IntIdTable() {
    val nameProject = varchar("name", 50)
}