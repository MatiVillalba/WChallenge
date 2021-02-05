package com.wolox.wchallenge.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.wolox.wchallenge.model.UserAlbum;

@Repository
public interface UserAlbumRepository extends JpaRepository<UserAlbum, Long> {
	
	public List<UserAlbum> findAllByAlbumId(long albumId);
	
	@Query("Select userId from UserAlbum where albumId = ?1 and role = ?2")
	public List<Long> findAllByAlbumIdAndRole(long albumId, Boolean role);

}
