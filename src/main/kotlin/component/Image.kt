package component

import kotlinx.css.margin
import react.Props
import react.fc
import styled.css
import styled.styledImg

external interface ImageProps : Props {
    var src: String
    var alt: String
}

val Image = fc<ImageProps> { props ->
    styledImg(props.alt, props.src) {
        css {
            margin = "0"
        }
    }
}