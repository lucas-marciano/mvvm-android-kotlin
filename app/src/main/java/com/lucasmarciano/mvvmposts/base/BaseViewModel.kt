package com.lucasmarciano.mvvmposts.base

import android.arch.lifecycle.ViewModel
import com.lucasmarciano.mvvmposts.injection.module.NetworkModule
import com.lucasmarciano.mvvmposts.injection.module.component.DaggerViewModelInjector
import com.lucasmarciano.mvvmposts.injection.module.component.ViewModelInjector
import com.lucasmarciano.mvvmposts.ui.posts.PostListViewModel

/**
 *
 * Creation 02/07/2018
 * @author lucasmarciano
 * @version 0.0.0
 */
open class BaseViewModel: ViewModel() {
    private val injector: ViewModelInjector = DaggerViewModelInjector
            .builder()
            .networkModule(NetworkModule)
            .build()

    init {
        inject()
    }

    /**
     * Injects the required dependencies
     */
    private fun inject() {
        when (this) {
            is PostListViewModel -> injector.inject(this)
        }
    }
}