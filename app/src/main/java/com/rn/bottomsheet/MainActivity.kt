package com.rn.bottomsheet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.rn.bottomsheet.databinding.ActivityMainBinding
import com.rn.bottomsheet.databinding.LayoutBottomSheetBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var bindingBottomSheet:LayoutBottomSheetBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        bindingBottomSheet = LayoutBottomSheetBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val layoutBottomSheet = findViewById<LinearLayout>(R.id.layoutBottomSheet)

        binding.btnBottomSheet.setOnClickListener {
            val behavior = BottomSheetBehavior.from(layoutBottomSheet)
            if (behavior.state == BottomSheetBehavior.STATE_HIDDEN
                || behavior.state == BottomSheetBehavior.STATE_EXPANDED) {
                behavior.state = BottomSheetBehavior.STATE_COLLAPSED
            } else if (behavior.state == BottomSheetBehavior.STATE_COLLAPSED) {
                behavior.state = BottomSheetBehavior.STATE_EXPANDED
            }
        }

        binding.btnBottomSheetDialog.setOnClickListener {
            val dialog = BottomDialog()
            dialog.show(supportFragmentManager, "tag")
        }

    }
}