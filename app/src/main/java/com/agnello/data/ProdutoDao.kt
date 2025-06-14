package com.agnello.data

import androidx.room.*

@Dao
interface ProdutoDao {
    @Insert
    suspend fun inserir(produto: Produto)

    @Update
    suspend fun atualizar(produto: Produto)

    @Delete
    suspend fun deletar(produto: Produto)

    @Query("SELECT * FROM produtos")
    suspend fun listarTodos(): List<Produto>

    @Query("SELECT * FROM produtos WHERE id = :id")
    suspend fun buscarPorId(id: Int): Produto?
}
