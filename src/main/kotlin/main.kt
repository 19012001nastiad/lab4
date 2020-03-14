import data.studentList
import org.w3c.dom.HTMLElement
import org.w3c.dom.HTMLSelectElement
import org.w3c.dom.events.Event
import react.dom.h1
import react.dom.li
import react.dom.ol
import react.dom.render
import kotlin.browser.document
import kotlin.dom.clear


fun main() {
    render(document.getElementById("root")!!) {
        h1 {
            +"Список студентов" }
        studentList(studentList.toTypedArray()) }
}

