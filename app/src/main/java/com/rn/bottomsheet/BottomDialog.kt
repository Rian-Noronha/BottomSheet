package com.rn.bottomsheet

import android.annotation.SuppressLint
import android.app.Dialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.rn.bottomsheet.databinding.LayoutDialogBinding

class BottomDialog : BottomSheetDialogFragment(){
    private lateinit var binding: LayoutDialogBinding

    @SuppressLint("RestrictedApi")
    override fun setupDialog(dialog: Dialog, style: Int) {
        super.setupDialog(dialog, style)
        binding = LayoutDialogBinding.inflate(layoutInflater)
        binding.btnConfirm.setOnClickListener{dialog.dismiss()}
        binding.btnCancel.setOnClickListener{dialog.dismiss()}
        dialog.setContentView(binding.root)

    }


}