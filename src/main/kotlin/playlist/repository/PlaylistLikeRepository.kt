package com.wafflestudio.seminar.spring2023.playlist.repository

import org.springframework.data.jpa.repository.JpaRepository

interface PlaylistLikeRepository : JpaRepository<PlaylistLikeEntity, Long> {
    fun findByPlaylistOfLike_IdAndUser_Id(playlistId: Long, userId: Long): PlaylistLikeEntity?
}