package component

import kotlinx.css.Color
import kotlinx.css.color
import kotlinx.css.padding
import react.Props
import react.fc
import styled.css
import styled.styledSpan

external interface MenuItemProps : Props {
    var text: String
}

val MenuItem = fc<MenuItemProps> { props ->
    styledSpan {
        css {
            padding = "1em"
            color = Color.darkBlue
        }
        +props.text
    }
}