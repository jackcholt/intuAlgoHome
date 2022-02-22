package component

import kotlinx.css.*
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
                url = "/products"
            }
        }
        child(MenuItem) {
            attrs {
                text = "Leadership Team"
                url = "/leadership"
            }
        }
        child(MenuItem) {
            attrs {
                text = "Contact"
                url = "/contact"
            }
        }
        child(MenuItem) {
            attrs {
                text = "Blog"
                url = "/blog"
            }
        }
    }
}