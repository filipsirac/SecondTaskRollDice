package hr.osc.ada.rollingdiceyamb.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import hr.osc.ada.rollingdiceyamb.R
import hr.osc.ada.rollingdiceyamb.model.Die
import kotlinx.android.synthetic.main.activity_die.*

class DieActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var die: Die


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_die)
        initUi()
        setListeners()

    }

    private fun initUi() {
        die = Die(mutableListOf(firstDice, secondDice, thirdDice, fourthDice, fifthDice, sixthDice))
    }

    private fun setListeners() {
        rollDice.setOnClickListener { die.rollAllDice() }
        firstDice.setOnClickListener(this)
        secondDice.setOnClickListener(this)
        thirdDice.setOnClickListener(this)
        fourthDice.setOnClickListener(this)
        fifthDice.setOnClickListener(this)
        sixthDice.setOnClickListener(this)
        refresh.setOnClickListener (this)

    }

    override fun onClick(v: View?) {
        when(v){
            firstDice -> die.dieImage.remove(firstDice)
            secondDice -> die.dieImage.remove(secondDice)
            thirdDice -> die.dieImage.remove(thirdDice)
            fourthDice -> die.dieImage.remove(fourthDice)
            fifthDice -> die.dieImage.remove(fifthDice)
            sixthDice -> die.dieImage.remove(sixthDice)
            refresh -> die = Die(mutableListOf(firstDice, secondDice, thirdDice, fourthDice, fifthDice, sixthDice))
        }
    }

}
