package component

import react.Props
import react.fc

val Header = fc<Props> {
    HeaderRow {
        child(Menu)
    }
}