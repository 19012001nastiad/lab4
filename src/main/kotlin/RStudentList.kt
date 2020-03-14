import data.Student
import react.*
import react.dom.li
import react.dom.ol

interface RStudentListProps : RProps {
    var students: Array<Student>
}
class RStudentList : RComponent<RStudentListProps, RState>() {
    override fun RBuilder.render() {
        ol {
            props.students.map { student ->
                li {
                    rstudent(student) }
            }
        } }
}
fun RBuilder.studentList(students: Array<Student>) =
    child(RStudentList::class) {
        attrs.students = students
    }