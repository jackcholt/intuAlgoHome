package component

import kotlinx.css.*
import kotlinx.css.Float
import react.Props
import react.fc
import styled.css
import styled.styledDiv

val Menu = fc<Props> {
    styledDiv {
        css {
            display = Display.inlineBlock
            float = Float.right
            marginRight = 1.em
        }
        child(MenuItem) {
            attrs {
                text = "Products"
            }
        }
        child(MenuItem) {
            attrs {
                text = "Leadership Team"
            }
        }
        child(MenuItem) {
            attrs {
                text = "Contact"
            }
        }
        child(MenuItem) {
            attrs {
                text = "Blog"
            }
        }
    }
}