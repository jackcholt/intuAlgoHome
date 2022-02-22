package component

import kotlinx.browser.window
import kotlinx.css.*
import kotlinx.html.js.onClickFunction
import react.Props
import react.dom.attrs
import react.fc
import styled.css
import styled.styledSpan

external interface MenuItemProps : Props {
    var text: String
    var url: String
}

val MenuItem = fc<MenuItemProps> { props ->
    styledSpan {
        css {
            padding = "1em"
            color = Color.darkBlue
            fontFamily = "sans-serif"
            cursor = Cursor.pointer
        }
        attrs {
            key = props.text
            onClickFunction = {
                window.location.href = props.url
            }
        }
        +props.text
    }
}