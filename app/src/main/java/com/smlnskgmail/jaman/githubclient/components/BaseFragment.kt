package com.smlnskgmail.jaman.githubclient.components

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

abstract class BaseFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(
            layoutResId(),
            container,
            false
        )
    }

    abstract fun title(): String

    abstract fun enableBackPress(): Boolean

    abstract fun layoutResId(): Int

}
