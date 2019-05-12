package hr.osc.ada.rollingdiceyamb.model

import android.widget.ImageView
import hr.osc.ada.rollingdiceyamb.R

class Die(
    var dieImage: MutableList<ImageView>

) {

    val listDice: List<Int> = listOf(
        R.drawable.one,
        R.drawable.two,
        R.drawable.three,
        R.drawable.four,
        R.drawable.five,
        R.drawable.six
    )

    fun rollAllDice() {
        for (images in dieImage) {
            images.setImageResource(listDice.random())
        }
    }

}

