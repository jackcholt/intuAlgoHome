package component

import kotlinx.css.*
import kotlinx.html.P
import react.Props
import react.dom.p
import react.fc
import styled.css
import styled.styledDiv

val HeaderRow = fc<Props> {
    styledDiv {
        css {
            background = "antiquewhite"
            margin = "0"
            paddingTop = 1.rem
            paddingRight = 1.rem
            paddingBottom = .6.rem
            paddingLeft = 1.rem
            position = Position.absolute
            top = 0.px
            left = 0.px
            width = 100.pct
        }
        p {
            +"IntuAlgo"
        }
        child(Image) {
            attrs {
                src = "logo.svg"
                alt = "IntuAlgo"
            }
        }
        child(Menu)
    }
}