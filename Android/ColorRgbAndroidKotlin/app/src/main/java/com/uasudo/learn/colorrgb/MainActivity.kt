package com.uasudo.learn.colorrgb

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.SeekBar
import android.widget.Toast

import java.util.regex.Matcher
import java.util.regex.Pattern

class MainActivity : AppCompatActivity(), SeekBar.OnSeekBarChangeListener {

    private var mBtnColor: Button? = null
    private var btnCopyToBuffer: Button? = null
    private var mBtnSetColor: Button? = null

    private var mSbRed: SeekBar? = null
    private var mSbGreen: SeekBar? = null
    private var mSbBlue: SeekBar? = null

    private var mEtEnterColor: EditText? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mSbRed = findViewById(R.id.seekBarRed) as SeekBar
        // mSbRed.setBackgroundColor(Color.rgb(255, 0, 0));
        mSbRed!!.setOnSeekBarChangeListener(this)

        mSbGreen = findViewById(R.id.seekBarGreen) as SeekBar
        // mSbGreen.setBackgroundColor(Color.rgb(0, 255, 0));
        mSbGreen!!.setOnSeekBarChangeListener(this)

        mSbBlue = findViewById(R.id.seekBarBlue) as SeekBar
        //mSbBlue.setBackgroundColor(Color.rgb(0, 0, 255));
        mSbBlue!!.setOnSeekBarChangeListener(this)

        mEtEnterColor = findViewById(R.id.editText) as EditText
        mEtEnterColor!!.setText("00" + checkHex(Integer.toHexString(mSbRed!!.progress)) +
                checkHex(Integer.toHexString(mSbGreen!!.progress)) +
                checkHex(Integer.toHexString(mSbBlue!!.progress)))


        mBtnColor = findViewById(R.id.button_color) as Button
        mBtnColor!!.setBackgroundColor(Color.rgb(mSbRed!!.progress, mSbGreen!!.progress, mSbBlue!!.progress))
        // mBtnColor.setClickable(false);

        mBtnSetColor = findViewById(R.id.setColor) as Button
        mBtnSetColor!!.setOnClickListener(View.OnClickListener {
            val s = mEtEnterColor!!.text
            val length = s.toString().length
            var isHexColorRegex = false
            when (length) {
                3 -> {
                    val patternFor3Chars = Pattern.compile("^[A-Fa-f\\d]{3}$")
                    val matcher3 = patternFor3Chars.matcher(s)
                    isHexColorRegex = matcher3.matches()
                }
                4 -> {
                    val patternFor4Chars = Pattern.compile("^[A-Fa-f\\d]{4}$")
                    val matcher4 = patternFor4Chars.matcher(s)
                    isHexColorRegex = matcher4.matches()
                }
                6 -> {
                    val patternFor6Chars = Pattern.compile("^[A-Fa-f\\d]{6}$")
                    val matcher6 = patternFor6Chars.matcher(s)
                    isHexColorRegex = matcher6.matches()
                }
                8 -> {
                    val patternFor8Chars = Pattern.compile("^[A-Fa-f\\d]{8}$")
                    val matcher8 = patternFor8Chars.matcher(s)
                    isHexColorRegex = matcher8.matches()
                }
                else -> {
                    Toast.makeText(applicationContext, "Please enter 3, 4, 6 or 8 chars", Toast.LENGTH_LONG).show()
                    return@OnClickListener
                }
            }
            if (!isHexColorRegex) {
                Toast.makeText(applicationContext, "Please enter A-F, a-f, 0-9 chars", Toast.LENGTH_LONG).show()
                return@OnClickListener
            }

            var localTempStringFromEditable = s.toString()

            if ((length == 3) or (length == 4)) {
                var temp = ""
                for (t in 0 until length) {
                    temp += localTempStringFromEditable[t]
                    temp += localTempStringFromEditable[t]
                }
                localTempStringFromEditable = temp
                Log.i("ffffff", localTempStringFromEditable)
            }
            if (localTempStringFromEditable.length == 6) {
                localTempStringFromEditable = "00" + localTempStringFromEditable
            }
            mSbRed!!.progress = Integer.parseInt(localTempStringFromEditable.substring(2, 4), 16)
            mSbGreen!!.progress = Integer.parseInt(localTempStringFromEditable.substring(4, 6), 16)
            mSbBlue!!.progress = Integer.parseInt(localTempStringFromEditable.substring(6, 8), 16)
        })

        btnCopyToBuffer = findViewById(R.id.button_copy_to_buffer) as Button
        btnCopyToBuffer!!.setOnClickListener {
            val clipboardManager = getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
            val clipData = ClipData.newPlainText("copy to buffer", "#" + mEtEnterColor!!.text)
            clipboardManager.primaryClip = clipData
            Toast.makeText(applicationContext, "Copied to buffer!", Toast.LENGTH_LONG).show()
        }
    }

    override fun onProgressChanged(seekBar: SeekBar, i: Int, b: Boolean) {
        mBtnColor!!.setBackgroundColor(Color.rgb(mSbRed!!.progress, mSbGreen!!.progress, mSbBlue!!.progress))
        mEtEnterColor!!.setText("00" + checkHex(Integer.toHexString(mSbRed!!.progress)) +
                checkHex(Integer.toHexString(mSbGreen!!.progress)) +
                checkHex(Integer.toHexString(mSbBlue!!.progress)))
    }

    override fun onStartTrackingTouch(seekBar: SeekBar) {}

    override fun onStopTrackingTouch(seekBar: SeekBar) {}

    private fun checkHex(string: String): String {
        return if (string.length == 1)
            "0" + string
        else
            string
    }
}
