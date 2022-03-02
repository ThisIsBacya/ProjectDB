package itlab.projectsite.database


import org.jetbrains.exposed.dao.id.IntIdTable

object Tests : IntIdTable() {
    private fun reference(c: String, TaskTest: TestTasksTable, TaskWord: InsertWord, TaskAnswer: FullAnswer) {
        val typeOfTest = reference("type of Test", TestTasksTable, InsertWord, FullAnswer)
    }
}