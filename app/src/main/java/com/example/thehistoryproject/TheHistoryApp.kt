package com.example.thehistoryproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class TheHistoryApp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_the_history_app)

        val headingView = findViewById<TextView>(R.id.headingView)
        val imageView = findViewById<ImageView>(R.id.imageView)
        val txtAge = findViewById<TextView>(R.id.txtAge)
        val inputAge = findViewById<EditText>(R.id.inputAge)
        val btnGenerate = findViewById<Button>(R.id.btnGenerate)
        val txtDisplay = findViewById<TextView>(R.id.txtDisplay)
        val btnClear = findViewById<Button>(R.id.btnClear)
        val imageView3 = findViewById<ImageView>(R.id.imageView3)



        btnGenerate.setOnClickListener {
            val userInput = inputAge.text.toString()
            val number = userInput.toIntOrNull()

            if (number != null && number in 20..100) {

                when (number) {
                     21 -> {
                        txtDisplay.text = " Napolean II,is 21 years old.Napoleon II (Napoléon François Joseph Charles Bonaparte; March 20, 1811 - July 22, 1832) " +
                                "was the contested Emperor of France for a few weeks in 1815. He was the son of Emperor Napoleon I and Empress Marie Louise, " +
                                "the daughter of Emperor Francis I of Austria. "
                    }
                      28 -> {
                        txtDisplay.text = "Henry the Young King,is 28 years old.Born to Henry II of England and Eleanor of Aquitaine," +
                                " Henry the Young King assumed the throne as the nominal king of England in 1170. " +
                                "The fact that his father would not give him independent authority infuriated him."
                    }
                       33 -> {
                        txtDisplay.text = "Alexander the Great,is 33 years old.Alexander the Great, born in 356 BC in Macedonia," +
                                " was a renowned military leader who conquered vast territories from Greece to India," +
                                " spreading Greek culture along the way. His legacy as a conqueror and cultural influencer endures to this day."
                    }
                     35 -> {
                        txtDisplay.text = "Wolfgang Amadeus Moazart,is 35 years old.Wolfgang Amadeus Mozart (1756-1791), born in Salzburg," +
                                " Austria, was a prolific composer of the Classical era. His 600 works, including symphonies and operas," +
                                " are celebrated worldwide for their innovation and lasting influence."

                    }
                     41 -> {
                         txtDisplay.text =
                             "Amelia Earhart,is 41 years old.Amelia Earhart (1897-1937), a pioneering aviator from Kansas, USA, set records as the first woman to fly solo across the Atlantic. " +
                                     "Her courage and determination inspired generations, despite her mysterious disappearance in 1937 Her legacy as a trailblazer in aviation endures ."

                     }
                      49 -> {
                        txtDisplay.text = "Alexander Hamilton,is 49 years old.Alexander Hamilton (1755/1757-1804), a key Founding Father, shaped early American government, " +
                                "establishing financial institutions like the First Bank and influencing the Constitution. " +
                                "His advocacy for a strong federal government left a profound impact on American politics and economics."
                    }
                       52 -> {
                        txtDisplay.text = "William Shakespeare (1564-1616), an eminent playwright from Stratford-upon-Avon, is celebrated for timeless works like \"Romeo and Juliet\" and \"Hamlet.\"" +
                                " His profound impact on literature endures through rich language and universal themes."
                    }
                       55 -> {
                        txtDisplay.text = "Friedrich Nietzsche (1844-1900), a German philosopher, challenged traditional morality and advocated for individual greatness. " +
                                "His works, including \"Thus Spoke Zarathustra\" and \"Beyond Good and Evil,\" explore existentialism and nihilism, influencing philosophy and culture."
                    }
                      61 -> {
                        txtDisplay.text = "Miyamoto Musashi (1584-1645), a legendary Japanese swordsman, authored \"The Book of Five Rings,\" emphasizing adaptability and self-mastery. " +
                                "His undefeated record in duels and strategic teachings inspire martial artists and leaders worldwide."
                    }
                       67 -> {
                        txtDisplay.text = "Leonardo da Vinci (1452-1519), a Renaissance polymath from Italy, is celebrated for masterpieces like the \"Mona Lisa\" and \"The Last Supper.\" " +
                                "His curiosity and innovation spanned art, science, and engineering, leaving a profound legacy on human history."
                    }
                       74 -> {
                        txtDisplay.text = "Mark Twain (1835-1910), an American author from Missouri, is renowned for his wit and iconic novels like \"The Adventures of Tom Sawyer\" and \"Adventures of Huckleberry Finn.\"" +
                                " His sharp social commentary and enduring literary legacy resonate globally."
                    }
                       77 -> {
                        txtDisplay.text = "Galileo Galilei (1564-1642), an Italian scientist, revolutionized astronomy and physics with groundbreaking discoveries." +
                                " His observations of Jupiter's moons and Venus's phases supported heliocentrism, despite opposition from the Catholic Church." +
                                " Galileo's experiments laid the foundation for modern physics and the scientific method."
                    }
                       83 -> {
                        txtDisplay.text= "Thomas Jefferson (1743-1826), a Virginia native, was a Founding Father and the third President of the United States. " +
                                "Known for drafting the Declaration of Independence, he championed democracy, individual rights, and the Louisiana Purchase. " +
                                "His legacy includes founding the University of Virginia and shaping American history with his intellect and leadership."
                    }
                      88 -> {
                        txtDisplay.text = "Michelangelo (1475-1564), an Italian Renaissance artist, created masterpieces like \"David\" and the Sistine Chapel ceiling. " +
                                "His works, celebrated for emotional depth and technical skill, inspire artists globally, solidifying his status as one of history's greatest artists."
                    }
                      90 ->  {
                        txtDisplay.text = "Winston Churchill (1874-1965), a British statesman, led the UK during WWII, serving as Prime Minister." +
                                " His leadership rallied the nation and formed key alliances, contributing to victory over Nazi Germany." +
                                " Churchill's resilience and commitment to freedom solidified his status as a 20th-century icon."
                    }
                    95 -> {
                        txtDisplay.text = "Nelson Mandela (1918-2013) was a South African leader who fought against apartheid, becoming President from 1994 to 1999." +
                                " He spent 27 years in prison for his activism and won the Nobel Peace Prize in 1993. " +
                                "Mandela is celebrated for his commitment to equality and reconciliation."

                    }


                else -> {txtDisplay.text = "Number is out of range or no person has been recorded for this age. Please enter another number"}
            }
            }

            btnClear.setOnClickListener { inputAge.text.clear() }

        }


    }
}