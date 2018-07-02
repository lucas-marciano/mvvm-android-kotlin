package com.lucasmarciano.mvvmposts.ui.posts

import android.arch.lifecycle.MutableLiveData
import com.lucasmarciano.mvvmposts.base.BaseViewModel
import com.lucasmarciano.mvvmposts.models.Post

/**
 *
 * Creation 02/07/2018
 * @author lucasmarciano
 * @version 0.0.0
 */
class PostViewModel: BaseViewModel()  {
    private val postTitle = MutableLiveData<String>()
    private val postBody = MutableLiveData<String>()

    fun bind(post: Post){
        postTitle.value = post.title
        postBody.value = post.body
    }

    fun getPostTitle():MutableLiveData<String>{
        return postTitle
    }

    fun getPostBody():MutableLiveData<String>{
        return postBody
    }
}