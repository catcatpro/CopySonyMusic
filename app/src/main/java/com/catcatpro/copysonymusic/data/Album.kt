package com.catcatpro.copysonymusic.data


/**
 * @param title 专辑标题
 * @param albumImage 专辑图片
 * @param artist 艺术家
 * @param genre 风格
 * @param year 发行年份
 */
data class Album(val title:String,val albumImage: Int, val artist:String?,  val genre: String = "", val year:String ="")
