package com.example.core.data.repository

import com.example.core.domain.model.CharacterPaging
import com.example.core.domain.model.Comic

interface CharactersRemoteDataSource {

    suspend fun fetchCharacters(queries: Map<String, String>): CharacterPaging

    suspend fun fetchComics(characterId: Int): List<Comic>
}