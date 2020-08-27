package com.prodev.photoalbum

import android.media.ThumbnailUtils

data  class Album (
    val albumId: Int, val photoId:Int, val title: String, val url : String, val thumbnailUtils: ThumbnailUtils
)