package component

import react.Props
import react.fc

val Header = fc<Props> {
    console.log("Starting Header")
    HeaderRow
}