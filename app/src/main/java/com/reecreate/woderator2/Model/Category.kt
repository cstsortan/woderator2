package com.reecreate.woderator2.Model

import java.io.Serializable

/**
 * Created by reecreate on 22/09/2017.
 */
class Category(val title: String, val image: String): Serializable {

    override fun toString(): String {
        return title
    }
}