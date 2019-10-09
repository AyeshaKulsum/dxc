package com.dxc.training.dao;

import java.util.List;

import com.dxc.training.model.User;

public interface ValidateDAO {
	public boolean isUserExists(User user);
}
