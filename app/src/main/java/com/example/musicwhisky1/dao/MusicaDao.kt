package com.example.musicwhisky1.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Transaction
import androidx.room.Update
import com.example.musicwhisky.Album
import com.example.musicwhisky1.model.AlbumComMusicas
import com.example.musicwhisky1.model.Musica

@Dao
interface MusicaDao {

    @Insert
    suspend fun inserir(musica: Musica)

    @Query("SELECT * FROM musicas")
    suspend fun buscarTodos(): List<Musica>

    @Query("SELECT * FROM musicas WHERE id = :musicaId")
    fun ListarPorId(musicaId: Int): LiveData<Musica>

    @Query("SELECT * FROM musicas WHERE nome LIKE '%' || :nome || '%'")
    fun buscarPorNome(nome: String): LiveData<List<Musica>>


    @Delete
    suspend fun deletar(musica: Musica)

    @Update
    suspend fun atualizar(musica: Musica)

    @Query("SELECT * FROM musicas WHERE idAlbum = :idAlbum")
    fun musicasAlbum(idAlbum: Int): List<Musica>

    @Insert
    suspend fun insert(artistas: List<Musica>)

}

