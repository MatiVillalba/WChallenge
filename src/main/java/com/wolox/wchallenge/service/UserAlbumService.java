package com.wolox.wchallenge.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wolox.wchallenge.dto.PatchUserAlbumRolDTO;
import com.wolox.wchallenge.dto.UserAlbumDTO;
import com.wolox.wchallenge.model.User;
import com.wolox.wchallenge.model.UserAlbum;

@Service
public interface UserAlbumService {
	
	public UserAlbum createUserAlbum(UserAlbumDTO userAlbumDTO);
	
	public List<UserAlbum> patchUserAlbumRole(long albumId, PatchUserAlbumRolDTO patchUserAlbumRoleDTO);

	public List<User> getAllUsersByAlbumAndRole(long albumId, Boolean role);
}
