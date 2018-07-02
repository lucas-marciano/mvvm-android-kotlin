/*
 * Developed by: Inatel Competence Center
 * Copyright 2018, NONUS
 * All rights are reserved. Reproduction in whole or part is
 * prohibited without the written consent of the copyright owner.
 */
package com.lucasmarciano.mvvmposts.utils

import android.content.ContextWrapper
import android.support.v7.app.AppCompatActivity
import android.view.View

/**
 *
 * Creation 02/07/2018
 * @author lucasmarciano
 * @version 0.0.0
 */
fun View.getParentActivity(): AppCompatActivity?{
    var context = this.context
    while (context is ContextWrapper) {
        if (context is AppCompatActivity) {
            return context
        }
        context = context.baseContext
    }
    return null
}