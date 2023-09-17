package com.catcatpro.copysonymusic.data

import androidx.annotation.DrawableRes


/**
 * @param title 标题
 * @param musicImage 歌曲封面
 * @param artist 艺术家
 * @param album 专辑
 * @param albumArtist 专辑艺术家
 * @param composer 作曲家
 * @param genre 风格
 * @param year 发行年份
 * @param discNumber 光盘编号
 */
data class Music(val title:String,val musicImage: Int, val artist:String?, val album:String?, val albumArtist:String = "", val composer: String = "", val genre: String = "", val year:String ="", val discNumber: Number = 0)
