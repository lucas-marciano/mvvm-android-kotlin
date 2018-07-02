package com.lucasmarciano.mvvmposts.injection.module.component

import com.lucasmarciano.mvvmposts.injection.module.NetworkModule
import com.lucasmarciano.mvvmposts.ui.posts.PostListViewModel
import dagger.Component
import javax.inject.Singleton

/**
 *
 * Creation 02/07/2018
 * @author lucasmarciano
 * @version 0.0.0
 */

/**
* Component providing inject() methods for presenters.
*/
@Singleton
@Component(modules = [(NetworkModule::class)])
interface ViewModelInjector {
    /**
     * Injects required dependencies into the specified PostListViewModel.
     * @param postListViewModel PostListViewModel in which to inject the dependencies
     */
    fun inject(postListViewModel: PostListViewModel)

    @Component.Builder
    interface Builder {
        fun build(): ViewModelInjector

        fun networkModule(networkModule: NetworkModule): Builder
    }
}