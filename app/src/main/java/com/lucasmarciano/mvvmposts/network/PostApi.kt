package com.lucasmarciano.mvvmposts.network

import io.reactivex.Observable
import com.lucasmarciano.mvvmposts.models.Post
import retrofit2.http.GET

/**
 *
 * Creation 02/07/2018
 * @author lucasmarciano
 * @version 0.0.0
 */
interface PostApi {
    @GET("/posts")
    fun getPosts(): Observable<List<Post>>
}